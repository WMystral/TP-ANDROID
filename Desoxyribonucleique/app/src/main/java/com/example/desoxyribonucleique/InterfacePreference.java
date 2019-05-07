package com.example.desoxyribonucleique;


import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;

import java.util.ArrayList;



public class InterfacePreference extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedinstance) {
        super.onCreate(savedinstance);
        this.addPreferencesFromResource(R.xml.preference);
        PreferenceScreen startmain = (PreferenceScreen) findPreference("startmain");
        startmain.setOnPreferenceClickListener(new StartApplication(this));
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
}