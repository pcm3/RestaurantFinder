package com.example.restaurantfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = findViewById(R.id.search_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar now = Calendar.getInstance();
                int day = now.get(Calendar.DAY_OF_WEEK);
                int hour = now.get(Calendar.HOUR_OF_DAY);
                int minutes = now.get(Calendar.MINUTE);
                TextView t = findViewById(R.id.tester);
                if (day == 1) {
                    t.setText("Sunday" + " " + hour + " : " + minutes);
                } else if (day == 2) {
                    t.setText("Monday" + " " + hour + " : " + minutes);
                } else if (day == 3) {
                    t.setText("Tuesday" + " " + hour + " : " + minutes);
                } else if (day == 4) {
                    t.setText("Wednesday" + " " + hour + " : " + minutes);
                } else if (day == 5) {
                    t.setText("Thursday" + " " + hour + " : " + minutes);
                } else if (day == 6) {
                    t.setText("Friday" + " " + hour + " : " + minutes);
                } else if (day == 7) {
                    t.setText("Saturday" + " " + hour + " : " + minutes);
                }
            }
        });
    }
}
