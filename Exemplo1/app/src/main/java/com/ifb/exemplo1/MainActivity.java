package com.ifb.exemplo1;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText Nome;
    private TextView Mensagem;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Nome = (EditText) findViewById(R.id.nomeText);
        this.Mensagem = (TextView) findViewById(R.id.mensagemText);
    }

    public void exibeMensagem(View v) {
        Editable texto = this.Nome.getText();
        String msg = "Olá, " + texto.toString() + " ,seja bem-vindo(a)!!!";
        this.Mensagem.setText(msg);
    }
}
