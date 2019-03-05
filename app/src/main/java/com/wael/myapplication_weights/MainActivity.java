package com.wael.myapplication_weights;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText txtWeight1;
    TextView txtRes1;
    RadioButton radioButton1, rbMercury1,rbMars1,rbVenus1,rbEarth1,rbUranus1,rbNeptune1,rbSaturn1,rbJupiter1;
    RadioGroup radioGroup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtWeight1 = (EditText) findViewById(R.id.txtWeight);
        txtRes1= (TextView) findViewById(R.id.txtRes);

       radioGroup1=(RadioGroup)findViewById(R.id.rg);
    }


    public void weghtsCalc(View v)
    {

        int selectId = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectId);
        double wegOnPlant =0;
        switch (radioButton.getId()){
            case R.id.rbMercury:
                wegOnPlant = (Double.parseDouble(txtWeight1.getText().toString())* 3.7)  / 9.8;
                txtRes1.setText("The Weight: " +String.valueOf(wegOnPlant).toString());

                break;

            case R.id.rbMars:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 3.711  / 9.8;
                txtRes1.setText("The Weight: " +String.valueOf(wegOnPlant).toString());

                break;

            case R.id.rbVenus:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 8.87  / 9.8;
                txtRes1.setText("The Weight" +String.valueOf(wegOnPlant).toString());

                break;

            case R.id.rbEarth:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 1  / 9.8;
                txtRes1.setText("The Weight" +String.valueOf(wegOnPlant).toString());

                break;

            case R.id.rbUranus:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 8.69  / 9.8;
                txtRes1.setText("The Weight" +String.valueOf(wegOnPlant).toString());

                break;

            case R.id.rbNeptune:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 11.15 / 9.8;
                txtRes1.setText("The Weight" +String.valueOf(wegOnPlant).toString());

                break;

            case R.id.rbSaturn:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 10.44  / 9.8;
                txtRes1.setText("The Weight" +String.valueOf(wegOnPlant).toString());
                break;

            case R.id.rbJupiter:

                wegOnPlant = Double.parseDouble(txtWeight1.getText().toString())* 24.79  / 9.8;
                txtRes1.setText("The Weight" +String.valueOf(wegOnPlant).toString());

                break;


        }
    }
}
