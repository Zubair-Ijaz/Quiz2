package com.example.quiz2;

import android.app.Application;

import java.util.ArrayList;

public class CarData extends Application {

    public static ArrayList<CarInfo> data;

    @Override
    public void onCreate() {
        super.onCreate();
        data = new ArrayList<>();
        data.add(new CarInfo("POLO",R.drawable.mercedes,"Peter Parker", "123456789"));
        data.add(new CarInfo("E200",R.drawable.nissan,"Chuck Norris", "816651651"));
        data.add(new CarInfo("Almera",R.drawable.volkswagen,"Peter Pollock", "123456789"));
        data.add(new CarInfo("E180",R.drawable.mercedes,"Chris James", "123456789"));
        data.add(new CarInfo("Nisaan",R.drawable.nissan,"John Rambo", "123456789"));
        data.add(new CarInfo("Volkswagen",R.drawable.volkswagen,"Woody", "123456789"));
        data.add(new CarInfo("Mercedes",R.drawable.mercedes,"Klieny", "123456789"));
        data.add(new CarInfo("E210",R.drawable.nissan,"Eitan bernath", "123456789"));


    }
}
