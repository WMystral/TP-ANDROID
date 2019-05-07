package fr.demartin.screen_pref;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean is_dark_mode_on = sharedPreferences.getBoolean("pref_dark_mode",false);

        OuvrePrefListener listener = new OuvrePrefListener(this);
        ReloadListener listener_reload = new ReloadListener(this);
        findViewById(R.id.bouton_pref).setOnClickListener(listener);
        findViewById(R.id.bouton_reload).setOnClickListener(listener_reload);

        if(is_dark_mode_on){
            findViewById(R.id.layout_main).setBackgroundColor(Color.BLACK);
        }
    }
}
