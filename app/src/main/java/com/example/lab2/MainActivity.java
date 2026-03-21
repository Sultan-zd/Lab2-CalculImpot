package com.example.lab2;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText surfaceInput, piecesInput;
    private CheckBox piscineCheckbox;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceInput = findViewById(R.id.input_surface);
        piecesInput = findViewById(R.id.input_pieces);
        piscineCheckbox = findViewById(R.id.checkbox_piscine);
        resultView = findViewById(R.id.result);

        findViewById(R.id.button_calcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        String surfaceTexte = surfaceInput.getText().toString();
        String piecesTexte = piecesInput.getText().toString();

        if (surfaceTexte.isEmpty() || piecesTexte.isEmpty()) {
            Toast.makeText(this, "Veuillez remplir toutes les cases !", Toast.LENGTH_SHORT).show();
            return;
        }

        double surface = Double.parseDouble(surfaceTexte);
        int pieces = Integer.parseInt(piecesTexte);
        boolean piscine = piscineCheckbox.isChecked();

        double impotBase = surface * 2;
        double supplement = pieces * 50 + (piscine ? 100 : 0);
        double total = impotBase + supplement;

        resultView.setText("Impôt total : " + total + " DH");
    }
}