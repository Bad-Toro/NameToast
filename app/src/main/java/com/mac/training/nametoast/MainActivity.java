package com.mac.training.nametoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_STR = "FT's Tag";
    EditText fN, lN;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fN = (EditText) findViewById(R.id.fName);
        lN = (EditText) findViewById(R.id.lName);
        btn2 = (Button) findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LOG_STR, "Showing Toast");
                showToast("From button 2");
            }
        });

    }

    public void btn1Click(View view) {
        showToast("");
    }

    private void showToast(String adtMssg) {
        String s = fN.getText().toString() + " " + lN.getText().toString();
        if (!adtMssg.equals("")){
            s += " " + adtMssg;
        }

        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
