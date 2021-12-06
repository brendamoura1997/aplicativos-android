package com.brenda.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int r = random.nextInt(2);

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                if(r==0){
                    intent.putExtra("imagem",R.drawable.moeda_cara);
                    startActivity(intent);
                }else if(r==1){
                    intent.putExtra("imagem",R.drawable.moeda_coroa);
                    startActivity(intent);

                }




            }
        });


    }
}
