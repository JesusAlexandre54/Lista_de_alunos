package com.example.listadealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {
    TextView tv_morada, tv_nome, tv_email;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tv_nome = findViewById(R.id.tv_nome);
        tv_email = findViewById(R.id.tv_email);
        tv_morada = findViewById(R.id.tv_morada);
        i= getIntent();
        tv_nome.setText("Nome: "+i.getExtras().getString("nome"));
        tv_morada.setText("Morada: "+i.getExtras().getString("morada"));
        tv_email.setText("Email: "+i.getExtras().getString("email"));

    }
}