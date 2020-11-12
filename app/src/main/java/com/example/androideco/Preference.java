package com.example.androideco;

        import android.content.SharedPreferences;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.preference.CheckBoxPreference;
        import android.preference.PreferenceActivity;
        import android.preference.PreferenceManager;


public class Preference extends  PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
        Load_setting();
    }
    private void Load_setting(){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(this);
        boolean Chk_night = sp.getBoolean("NOGHT",false);
        if(Chk_night){
            getListView().setBackgroundColor(Color.parseColor("#222222"));
        }
        else{
            getListView().setBackgroundColor(Color.parseColor("#ffffff"));

        }
        CheckBoxPreference Chk_night_instant = (CheckBoxPreference)findPreference("NOGHT");
        Chk_night_instant.setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(android.preference.Preference prefs, Object obj) {
                //change Preference object into boolean
                boolean yes = (boolean)obj;

                if(yes){
                    //if yes then change to darker
                    getListView().setBackgroundColor(Color.parseColor("#222222"));

                }
                else{
                    getListView().setBackgroundColor(Color.parseColor("#ffffff"));

                }
                return true;
            }
        });
    }
    @Override
    protected void onResume() {
        Load_setting();
        super.onResume();
    }

    
}
