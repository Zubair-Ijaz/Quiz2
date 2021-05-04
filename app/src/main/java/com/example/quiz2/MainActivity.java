package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements CarAdapter.OnSelected {

    Button btnCarInfo, btnOwnerInfo;
    CircleImageView imageView;
    TextView carName, ownerName, phoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCarInfo = findViewById(R.id.btnCarInfo);
        btnOwnerInfo = findViewById(R.id.btnOwnerInformation);
        imageView = findViewById(R.id.car_image);
        carName = findViewById(R.id.car_name);
        ownerName = findViewById(R.id.owner_name);
        phoneNum = findViewById(R.id.owner_phone_number);
        onClicked(0);
    }

    @Override
    public void onClicked(int index) {

        imageView.setVisibility(View.VISIBLE);
        carName.setVisibility(View.VISIBLE);
        ownerName.setVisibility(View.GONE);
        phoneNum.setVisibility(View.GONE);
        imageView.setImageResource(CarData.data.get(index).getUrls());
        carName.setText(CarData.data.get(index).getCarName());
        ownerName.setText(CarData.data.get(index).getOwnerName());
        phoneNum.setText(CarData.data.get(index).getPhoneNumber());

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.GONE);
                carName.setVisibility(View.GONE);
                ownerName.setVisibility(View.VISIBLE);
                phoneNum.setVisibility(View.VISIBLE);
                ownerName.setText(CarData.data.get(index).getOwnerName());
                phoneNum.setText(CarData.data.get(index).getPhoneNumber());
            }
        });

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ownerName.setVisibility(View.GONE);
                phoneNum.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
                carName.setVisibility(View.VISIBLE);
                imageView.setImageResource(CarData.data.get(index).getUrls());
                carName.setText(CarData.data.get(index).getCarName());

            }
        });
    }
}