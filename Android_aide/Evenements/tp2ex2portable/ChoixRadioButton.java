package fr.demartin.jordan.tp2ex2portable;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ChoixRadioButton implements Spinner.OnItemSelectedListener {
    private LaVue vue;

    public ChoixRadioButton(LaVue vue){
        this.vue=vue;

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        vue.changeFigure(adapterView.getItemAtPosition(i).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        vue.changeFigure("");
    }
}
