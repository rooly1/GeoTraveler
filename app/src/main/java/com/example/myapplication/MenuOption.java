package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuOption extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutoption);


        //ferme l'activité lorsque le bouton est cliqué
        final Button bouton_retour = findViewById(R.id.fermerOption);
        bouton_retour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }

        });


    }
}
