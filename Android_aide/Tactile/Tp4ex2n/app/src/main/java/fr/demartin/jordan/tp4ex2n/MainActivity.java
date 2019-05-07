package fr.demartin.jordan.tp4ex2n;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LaVue dessin = findViewById(R.id.Le_Dessin);
        GestureDetector mouvement = new GestureDetector(this, new DonneTesDoigts(dessin));

        FacteurListener facteur = new FacteurListener(mouvement);

        dessin.setOnTouchListener(facteur);
    }
}
