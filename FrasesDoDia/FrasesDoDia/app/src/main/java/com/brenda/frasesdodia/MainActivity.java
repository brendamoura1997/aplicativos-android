package com.brenda.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView mTextFrasesGeradas;
    Button mButtonNovaFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listaFrases(View view){
        String[] listaFrases = {"Amanhã eu vou revelar", "Depois eu penso em aprender", "Daqui a uns dias eu vou dizer o que me faz "+
                                "querer gritar", "No mês que vem tudo vai melhorar", "Só mais alguns anos e o mundo " +
                                "vai mudar", "Ainda temos tempo até tudo explodir", "Quem sabe quanto vai durar", "Não deixe nada pra " +
                                "depois", "Não deixe o tempo passar", "Não deixe nada pra semana que vem porque semana que vem pode " +
                                "nem chegar", "A partir de amanhã eu vou discutir", "Da proxima vez eu vou questionar", "Na segunda eu " +
                                "começo a agir", "Só mais duas horas pra eu decidir"};

        int posicaoFrase = new Random().nextInt(listaFrases.length);

        //Log.d("teste", "Quantidade é "+ listaFrases.length);

        mTextFrasesGeradas = findViewById(R.id.text_frase_gerada);

        mTextFrasesGeradas.setText(listaFrases[posicaoFrase]);



    }


}
