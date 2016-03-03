package com.jacob.measure;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.jacob.measure.tools.PhoneParams;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HeightDashBoard heightDashBoard=(HeightDashBoard)findViewById(R.id.act_main_height);
        heightDashBoard.setW(PhoneParams.getInstance(this).screenWidth/3);
    }
}
