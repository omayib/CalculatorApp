package com.technomotion.calculatorapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    EditText editTextInput1,editTextInput2,editTextOutput;

    Button btnPlus,btnMinus,btnMultiply,btnDevider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput1= (EditText) findViewById(R.id.input1);
        editTextInput2= (EditText) findViewById(R.id.input2);
        editTextOutput= (EditText) findViewById(R.id.output);

        btnPlus= (Button) findViewById(R.id.buttonPlus);
        btnMinus= (Button) findViewById(R.id.buttonMinus);
        btnMultiply= (Button) findViewById(R.id.buttonMultiply);
        btnDevider= (Button) findViewById(R.id.buttonDivider);


        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDevider.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonPlus:
                    String angka1= editTextInput1.getText().toString();
                    String angka2= editTextInput2.getText().toString();

                    double hasil= Double.parseDouble(angka1)+Double.parseDouble(angka2);

                    editTextOutput.setText(String.valueOf(hasil));
                break;
            case R.id.buttonMinus:

                break;
            case R.id.buttonMultiply:

                break;
            case R.id.buttonDivider:

                break;
        }

    }
}
