package com.example.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Calendar calendar;
    SimpleDateFormat sdate;
    String date;
    TextView getdatetime;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getdatetime = findViewById(R.id.getdateandtime);
        button = findViewById(R.id.btndateandtime);
        calendar = Calendar.getInstance();
        sdate = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");
        date = sdate.format(calendar.getTime());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getdatetime.setText(date);
            }
        });
    }
}