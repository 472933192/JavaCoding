package com.example.konka.javacoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.konka.javacoding.utilities.TextUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textUtil = (TextView) findViewById(R.id.textUtils);
        TextUtils text=new TextUtils();
        textUtil.setText(text.getValues());
    }
}
