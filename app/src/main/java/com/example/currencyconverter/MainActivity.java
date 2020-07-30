package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConvert (View view)  {

        EditText dollarAmt = (EditText)findViewById(R.id.dollarAmt);

        Double dollarAmtDouble = Double.parseDouble(dollarAmt.getText().toString());

        Double rupeesAmount = dollarAmtDouble * 75.33;

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("₹" + rupeesAmount.toString());



        Toast.makeText(MainActivity.this, "₹" + String.format("%.2f", rupeesAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount",dollarAmt.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
