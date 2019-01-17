package com.example.bestever.challenge5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        txt = (TextView)findViewById(R.id.txt);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rb1){
                    txt.setText("First Radio Button CLicked");
                }else if( i == R.id.rb2){
                    txt.setText("Second Radio Button CLicked");
                }else if(i == R.id.rb3){
                    txt.setText("Third Radio Button CLicked");
                }else if(i == R.id.rb4){
                    txt.setText("Fourth Radio Button CLicked");
                }
            }
        });


    }
}
