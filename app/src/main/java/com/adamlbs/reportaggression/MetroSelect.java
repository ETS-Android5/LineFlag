package com.adamlbs.reportaggression;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.SharedPreferences;

public class MetroSelect extends AppCompatActivity {
    private SessionHandler session;
    public ImageButton m1, m2;
    private SharedPreferences sharedPreference;
    private String text;
    Activity context = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_metroselect);
        session = new SessionHandler(getApplicationContext());
        User user = session.getUserDetails();
        addListenerOnButton();
    }

    //get the selected dropdown list value
    public void addListenerOnButton() {
        m1 = (ImageButton) findViewById(R.id.m1);
        ImageButton m2 = findViewById(R.id.m2);
        m1.setOnClickListener(new OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      text = "M1";
                                      Bundle bundle = new Bundle();

                                      BottomSheetDialog bottomSheet = new BottomSheetDialog();
                                      bundle.putString("text", text);
                                      bottomSheet.setArguments(bundle);
                                      bottomSheet.show(getSupportFragmentManager(),"text");

                                  }


            public void newActivity(View v) {
                                  }
                              }

        );


        m2.setOnClickListener(new OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      text = "M2";
                                      Bundle bundle = new Bundle();
                                      BottomSheetDialog bottomSheet = new BottomSheetDialog();
                                      bundle.putString("text", text);
                                      bottomSheet.setArguments(bundle);
                                      bottomSheet.show(getSupportFragmentManager(),"text");
                                  }


            public void newActivity(View v) {
                                  }
                              }

        );
    }
}