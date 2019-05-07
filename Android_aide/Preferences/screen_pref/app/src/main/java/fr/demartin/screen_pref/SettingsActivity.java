package fr.demartin.screen_pref;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle state){
        super.onCreate(state);
        this.addPreferencesFromResource(R.xml.preferences);
    }
}
