package com.example.alice744.various;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.alice744.various.flowers.Bouquet;
import com.example.alice744.various.logs.Logger;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bouquet bouquet = new Bouquet();
        Logger logger = new Logger(this.getClass().getName());

        logger.log("добавление роз в букет");
        bouquet.addManyRose(40, 80);
        logger.log("добавление тюльпанов в букет");
        bouquet.addManyTulip(30, 70);
        logger.log("добавление гвоздик в букет");
        bouquet.addManyCarnation(20, 100);
        logger.log("количество цветов букете:" + bouquet.getQuantity());
    }
}
