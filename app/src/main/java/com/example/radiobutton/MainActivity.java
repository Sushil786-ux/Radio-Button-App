package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radio;
    RadioButton radioButton;
    Button submit;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio=findViewById(R.id.radio);
        submit=findViewById(R.id.submit);
        txt=findViewById(R.id.txt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ID=radio.getCheckedRadioButtonId();
                radioButton=findViewById(ID);

                txt.setText("Selected : "+radioButton.getText());
            }
        });

    }
}