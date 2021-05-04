package com.example.quiz2;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

import de.hdodenhof.circleimageview.CircleImageView;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    ArrayList<CarInfo> arrayList;
    OnSelected onSelected;

    public CarAdapter(Context context, ArrayList<CarInfo> carInfoArrayList){

        arrayList = carInfoArrayList;
        onSelected = (OnSelected) context;

    }

    public interface OnSelected{
        public void onClicked(int index);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_item_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvCarName.setText(arrayList.get(position).getCarName());
        holder.imageView.setImageResource(arrayList.get(position).getUrls());
        holder.tvOwnerName.setText(arrayList.get(position).getOwnerName());
        holder.itemView.setTag(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        TextView tvCarName;
        TextView tvOwnerName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.horizontal_image);
            tvCarName = itemView.findViewById(R.id.horizontal_carName);
            tvOwnerName = itemView.findViewById(R.id.horizontal_ownerName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    onSelected.onClicked(arrayList.indexOf((CarInfo)itemView.getTag()));

                }
            });
        }
    }
}
