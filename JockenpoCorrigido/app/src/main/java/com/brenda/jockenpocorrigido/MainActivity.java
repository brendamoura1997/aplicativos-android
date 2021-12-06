package com.brenda.jockenpocorrigido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");

    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }



    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView mImageEscolhaApp;
        mImageEscolhaApp = findViewById(R.id.imageEscolhaApp);

        int numero  = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[numero];

        switch(opcaoApp){
            case "pedra":
                mImageEscolhaApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                mImageEscolhaApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                mImageEscolhaApp.setImageResource(R.drawable.tesoura);
        }

        this.programacao(opcaoApp, opcaoSelecionada);

    }


    public void programacao(String opcaoApp, String opcaoUsuario){
        TextView mTextResultado;
        mTextResultado = findViewById(R.id.textResultado);


        /////////// EMPATE! //////////////////
        if(((opcaoApp == "papel") && (opcaoUsuario == "papel"))         ||
                ((opcaoApp == "pedra") && (opcaoUsuario == "pedra"))    ||
                ((opcaoApp == "tesoura") && (opcaoUsuario == "tesoura")) ){

                mTextResultado.setText("Empatamos!");
        }
        /////////// USUARIO PERDEU //////////////////
        else if( ((opcaoApp == "papel") && (opcaoUsuario == "pedra"))   ||
                ((opcaoApp == "pedra") && (opcaoUsuario == "tesoura"))  ||
                ((opcaoApp == "tesoura") && (opcaoUsuario == "papel"))  ){

                mTextResultado.setText("Você perdeu :)");
        }
        /////////// USUARIO GANHOU! //////////////////
        else if( ((opcaoApp == "papel") && (opcaoUsuario == "tesoura")) ||
                ((opcaoApp == "tesoura") && (opcaoUsuario == "pedra"))  ||
                ((opcaoApp == "pedra") && (opcaoUsuario == "papel"))    ){

                mTextResultado.setText("Você ganhou :(");
        }



    }



}
