package com.noobmaster048.androideventhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  showOutput(View view){

        TextView textView = (TextView)findViewById(R.id.ouputText);
        RadioButton red,blue;
        red = (RadioButton) findViewById(R.id.red);
        blue = (RadioButton) findViewById(R.id.blue);
        EditText editTextName = (EditText) findViewById(R.id.editTextTextPersonName);
        String nameField= editTextName.getText().toString();
        if(red.isChecked()){
            textView.setTextColor(Color.RED);
        }
        if(blue.isChecked()){
            textView.setTextColor(Color.BLUE);
        }

        textView.setText(nameField);


    }
}