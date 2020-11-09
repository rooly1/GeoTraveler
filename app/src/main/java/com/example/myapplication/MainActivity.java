package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * Cette méthode est appelé quand l'activité est crée.
     *
     * @param savedInstanceState the state of the saved instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Dirige vers le menu jouer lorsque le bouton est cliqué
        final Button bouton_jouer = findViewById(R.id.bouton_jouer);
        bouton_jouer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuJouer.class));
            }

        });

        //Dirige vers le menu option lorsque le bouton est cliqué
        final Button bouton_option = (Button) findViewById(R.id.bouton_option);
        bouton_option.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuOption.class));
            }

        });

    }

    /**
     * Cette méthode est utilisé lorsque l'activité se charge, ou recharge à nouveau.
     */
    @Override
    protected void onResume() {
        super.onResume();


    }

    /**
     * Cette méthode est appelé lorsque l'activité est sur pause.
     */
    @Override
    protected void onPause() {
        super.onPause();

    }

    /**
     * Cette méthode est appelé quand le menu est terminé
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
