package com.eitguide.nguyennghia.mastertoastandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnShowToastDefault;
    private Button btnShowToastCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnShowToastDefault = (Button) findViewById(R.id.btn_show_toast_default);
        btnShowToastCustom = (Button) findViewById(R.id.btn_show_toast_custom);
        final View viewToast = LayoutInflater.from(this).inflate(R.layout.toast_layout, null);
        ((TextView) viewToast.findViewById(R.id.tv_text)).setText("This is Custom Toast In Android \n Eitguide.com");

        btnShowToastDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is Toast Default", Toast.LENGTH_SHORT).show();
            }
        });


        btnShowToastCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);
                toast.setView(viewToast);
                toast.setDuration(Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.TOP, 0, 0);
//                toast.setGravity(Gravity.RIGHT, 0, 0);
//                toast.setGravity(Gravity.BOTTOM, 0, 0);
//                toast.setGravity(Gravity.LEFT, 0, 0);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                //toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });
    }
}
