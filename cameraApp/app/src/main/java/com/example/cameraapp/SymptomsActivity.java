package com.example.cameraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class SymptomsActivity extends AppCompatActivity {

    Spinner spinnerSymptoms;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        spinnerSymptoms = findViewById(R.id.spinnerSymptoms);
        ratingBar = findViewById(R.id.ratingBar);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        // Setting up the dropdown (Spinner)
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this,
                R.layout.custom_spinner_dropdown_item, // using the custom layout for the spinner items
                new String[]{"Nausea", "Headache", "Diarrhea", "Sore throat", "Fever",
                        "Muscle ache", "Loss of smell/taste", "Cough",
                        "Breathlessness","Feeling tired"});
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown_item); // using the custom layout for the dropdown items
        spinnerSymptoms.setAdapter(adapter);

        // On Submit button click
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String symptomSelected = spinnerSymptoms.getSelectedItem().toString();
                int ratingValue = (int) ratingBar.getRating();

                // Here you can use the values as you wish
                Toast.makeText(SymptomsActivity.this,
                        "Symptom: " + symptomSelected + ", Rating: " + ratingValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
