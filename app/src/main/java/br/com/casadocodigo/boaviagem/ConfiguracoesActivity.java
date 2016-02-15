package br.com.casadocodigo.boaviagem;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by mreis on 15/02/2016.
 */
public class ConfiguracoesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
