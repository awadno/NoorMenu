package com.awad.noor.noormenu;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

import static com.awad.noor.noormenu.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener, OnClickListener {

    private Button btnDate;
    private TextView tvShowDate;
    private Button btnTime;
    private TextView tvShowTime;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        btnDate = (Button) findViewById(R.id.btndate);
        tvShowDate = (TextView) findViewById(R.id.tvShowDate);
        btnDate.setOnClickListener(this);
        tvShowTime = (TextView) findViewById(R.id.tvshowTime);
        btnTime = (Button) findViewById(R.id.btnTime);
        btnTime.setOnClickListener(this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.mnItmScreen1:
                Toast.makeText(getBaseContext(), "Hi Screen1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
            case R.id.mnItmScreen2:
                Toast.makeText(getBaseContext(), "Hi Screen2", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
            case R.id.mnItmScreen3:
                Toast.makeText(getBaseContext(), "Hi Screen3", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
            case R.id.mnItmScreen4:
                Toast.makeText(getBaseContext(), "Hi Screen4", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Screen2.class);
                startActivity(intent);
                break;
        }

        return true;
    }


    @Override
    public void onClick(DialogInterface dialog, int which) {


    }

    @Override
    public void onClick(View v) {
        if (v == btnDate) {
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    tvShowDate.setText(year + "/" + month + "/" + dayOfMonth);

                }
            };

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, dateListener, year, month, day);
            datePickerDialog.show();
        }
        if (v == btnTime) {
            Calendar c1 = Calendar.getInstance();
            final int hour = c1.get(Calendar.HOUR);
            final int minute = c1.get(Calendar.MINUTE);

            TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    tvShowTime.setText(hour + ":" + minute);
                }


            };
            TimePickerDialog timePickerDialog = new TimePickerDialog(this, timeListener, hour, minute, true);
            timePickerDialog.show();
        }
    }

}









