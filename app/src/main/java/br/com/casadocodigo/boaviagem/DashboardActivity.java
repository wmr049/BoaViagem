package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mreis on 12/02/2016.
 */
public class DashboardActivity extends Activity{

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dashbord_menu,menu);

        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        finish();
        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void selecionarOpcao(View view) {
        switch (view.getId()) {
            case R.id.nova_viagem:
                startActivity(new Intent(this, ViagemActivity.class));
                break;

            case R.id.novo_gasto:
                startActivity(new Intent(this, GastoActivity.class));
                break;
        }
    }
}
