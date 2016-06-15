package com.example.afif.bekupdua;

/**
 * Created by afif on 15/06/2016.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityHitung extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button1);
        input1 = (TextView) findViewById(R.id.angka1);
        input2 = (TextView) findViewById(R.id.angka2);


    }


}
