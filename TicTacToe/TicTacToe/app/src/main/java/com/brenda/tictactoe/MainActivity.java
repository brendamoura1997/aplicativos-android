package com.brenda.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int flag = 0;
    EditText mEditPos1;
    EditText mEditPos2;
    EditText mEditPos3;
    EditText mEditPos4;
    EditText mEditPos5;
    EditText mEditPos6;
    EditText mEditPos7;
    EditText mEditPos8;
    EditText mEditPos9;
    TextView mTextGanhou;
    TextView mTextJogarNovamente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificarCaracter(View view){

        mEditPos1 = findViewById(R.id.edit_pos1);
        mEditPos2 = findViewById(R.id.edit_pos2);
        mEditPos3 = findViewById(R.id.edit_pos3);
        mEditPos4 = findViewById(R.id.edit_pos4);
        mEditPos5 = findViewById(R.id.edit_pos5);
        mEditPos6 = findViewById(R.id.edit_pos6);
        mEditPos7 = findViewById(R.id.edit_pos7);
        mEditPos8 = findViewById(R.id.edit_pos8);
        mEditPos9 = findViewById(R.id.edit_pos9);

        /*if( (mEditPos1.equals("X")) || (mEditPos1.equals("O")) ||
                (mEditPos2.equals("X")) || (mEditPos2.equals("O")) ||
                (mEditPos3.equals("X")) || (mEditPos3.equals("O"))||
                (mEditPos4.equals("X")) || (mEditPos4.equals("O"))||
                (mEditPos5.equals("X")) || (mEditPos5.equals("O"))||
                (mEditPos6.equals("X")) || (mEditPos6.equals("O"))||
                (mEditPos7.equals("X")) || (mEditPos7.equals("O"))){
            Log.d("teste","É IGUAL");
        }else{
                    Log.d("teste","NÃO É IGUAL");
        }*/

        String pos1 = mEditPos1.getText().toString();
        String pos2 = mEditPos2.getText().toString();
        String pos3 = mEditPos3.getText().toString();
        String pos4 = mEditPos4.getText().toString();
        String pos5 = mEditPos5.getText().toString();
        String pos6 = mEditPos6.getText().toString();
        String pos7 = mEditPos7.getText().toString();
        String pos8 = mEditPos8.getText().toString();
        String pos9 = mEditPos9.getText().toString();


        if( (pos1.equals(pos2)) && (pos1.equals(pos3))  && ("" != pos1.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos1.equals(pos4)) && (pos1.equals(pos7)) && ("" != pos1.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos1.equals(pos5)) && (pos1.equals(pos9)) && ("" != pos1.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos2.equals(pos4)) && (pos1.equals(pos8)) && ("" != pos2.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos3.equals(pos5)) && (pos3.equals(pos7)) && ("" != pos3.intern()) ){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos3.equals(pos6)) && (pos3.equals(pos9))  && ("" != pos3.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos4.equals(pos5)) && (pos4.equals(pos6)) && ("" != pos4.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }else if((pos7.equals(pos8)) && (pos7.equals(pos9))  && ("" != pos7.intern())){

            mTextGanhou = findViewById(R.id.text_ganhou);
            mTextGanhou.setText("VOCÊ GANHOU!");
            flag = 1;

        }
        else{
            Log.d("teste", "NÃO GANHOU AINDA");
        }

        if(flag == 1){
            mTextJogarNovamente = findViewById(R.id.text_jogar_novamente);
            mTextJogarNovamente.setText("Você deseja jogar novamente?");
        }


    }

}
