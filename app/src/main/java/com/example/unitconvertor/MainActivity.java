package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText getAmount;
    Button convert;
    TextView rupees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAmount = findViewById(R.id.getAmount);
        convert = findViewById(R.id.convert);
        rupees = findViewById(R.id.rupees);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(getAmount.getText().toString());
                int toPrint = value * 83;
                rupees.setText("₹"+toPrint);
                Toast.makeText(MainActivity.this, "₹"+toPrint, Toast.LENGTH_SHORT).show();
            }
        });
    }
}