package fr.demartin.jordan.tp2ex2portable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> tab = ArrayAdapter.createFromResource(this,R.array.forme_array,android.R.layout.simple_spinner_item);

        tab.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner sp = findViewById(R.id.Le_Spinner);
        sp.setOnItemSelectedListener(new ChoixRadioButton((LaVue) findViewById(R.id.Le_Dessin)));

        sp.setAdapter(tab);
    }
}
