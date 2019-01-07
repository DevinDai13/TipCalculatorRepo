package com.example.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTotalTextView;
    TextView totalTextView;
    EditText billTotalEditView;
    Button tenPercentButton;
    Button fifteenPercentButton;
    Button twentyPercentButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTotalTextView = (TextView) findViewById(R.id.tipTotal);
        totalTextView = (TextView) findViewById(R.id.total);
        billTotalEditView = (EditText) findViewById(R.id.billTotalEdit);
        tenPercentButton = (Button) findViewById(R.id.ten);
        fifteenPercentButton = (Button) findViewById(R.id.fifteen);
        twentyPercentButton = (Button) findViewById(R.id.twenty);

        tenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTip(0.1);

            }
        });

        fifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTip(0.15);

            }
        });


        twentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcTip(0.2);

            }
        });

    }


    void calcTip(Double tipPercentge){
        // get the number for the edit text
        Double billTotal = Double.valueOf(billTotalEditView.getText().toString());

        // determine the tip
        Double tipTotal = billTotal * tipPercentge;

        // display tip
        tipTotalTextView.setText("Tip - $" + String.format("%.2f", tipTotal));

        //determine total
        Double total = tipTotal + billTotal;

        // display total
        totalTextView.setText("Total - $" + String.format("%.2f", total));

    }
}




























