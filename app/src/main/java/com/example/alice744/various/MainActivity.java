package com.example.alice744.various;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.alice744.various.flowers.Bouquet;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bouquet bouquet = new Bouquet();
        Log.d(TAG, "добавление роз в букет");
        bouquet.addManyRose(40, 80);
        Log.d(TAG, "добавление тюльпанов в букет");
        bouquet.addManyTulip(30, 70);
        Log.d(TAG, "добавление гвоздик в букет");
        bouquet.addManyCarnation(20, 100);
        Log.d(TAG, "количество цветов букете");
        System.out.println(bouquet.getQuantity());
    }

    public static void main(String[] args) {

    }

}
