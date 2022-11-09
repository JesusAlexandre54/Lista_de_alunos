package com.example.listadealunos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Aluno> lista;
    ArrayAdapter<Aluno> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        lista = new ArrayList<>();
        lista.add(new Aluno("Maria","Rua do sobe e desce","maria@gmail.com"));
        lista.add(new Aluno("Ana","Rua do desce","ana@gmail.com"));
        lista.add(new Aluno("Carlos","Rua do sobe","carlos@gmail.com"));
        lista.add(new Aluno("José","Rua do desce e sobe","jose@gmail.com"));



        adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,lista);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetalhesActivity.class);
                intent.putExtra("nome",lista.get(i).getNome());
                intent.putExtra("morada",lista.get(i).getMorada());
                intent.putExtra("email",lista.get(i).getEmail());
                startActivity(intent);

            }
        });
    }
}