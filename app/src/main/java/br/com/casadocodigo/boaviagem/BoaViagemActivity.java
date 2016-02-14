package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.ContextMenu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by mreis on 12/02/2016.
 */
public class BoaViagemActivity extends Activity{

    private EditText usuario;
    private EditText senha;

    @Override
    public void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.login);

        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);

    }

    public void entrarOnClick(View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        if("leitor".equals(usuarioInformado) &&
                "123".equals(senhaInformada)) {
            startActivity(new Intent(this, DashboardActivity.class));

        }else {
            String mensagemErro = getString(R.string.erro_autenticao);
            Toast toast = Toast.makeText(this, mensagemErro, Toast.LENGTH_SHORT);

            toast.show();
        }

    }
}
