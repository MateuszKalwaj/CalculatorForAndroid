package com.mk.metrestoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = findViewById(R.id.inputInMetersId);
        resultTextView = findViewById(R.id.metresToInchesId);
        convertButton = findViewById(R.id.convertButtonId);

        convertButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double multi = 39.37;
                double result = 0.0;

                if (enterMeters.getText().toString().equals("")) {
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.MAGENTA);
                } else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());

                    result = meterValue * multi;

                    resultTextView.setText(String.format("%.2f", result) + " inches");
                }
            }
        });
    }
}
