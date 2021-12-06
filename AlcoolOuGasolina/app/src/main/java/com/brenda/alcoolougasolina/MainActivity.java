package com.brenda.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editAlcool, editGasolina;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.editAlcool);
        editGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcular(View view){
        try {

            String alcoolStr = editAlcool.getText().toString();
            String GasolinaStr = editGasolina.getText().toString();

            Boolean validado = validarCampos(alcoolStr, GasolinaStr);

            if(validado == false){
                textResultado.setText("Favor preencher todos os campos!");
            }else{

                double precoAlcool = Double.parseDouble(alcoolStr);
                double precoGasolina = Double.parseDouble(GasolinaStr);

                double resultado = precoAlcool / precoGasolina;


                if(resultado >=0.7){
                    textResultado.setText("Melhor utilizar Gasolina");
                    Log.d("teste", "Resultado >= 0.7: "+resultado);
                }else{
                    textResultado.setText("Melhor utilizar Álcool");
                    Log.d("teste", "Resultado < 0.7: "+resultado);
                }
            }
        }catch(NumberFormatException e){
            Log.d("LALALA","DEU RUIM");
            textResultado.setText("Oooops, algo de errado aconteceu :(");

        }

    }

    public Boolean validarCampos(String pAlcool, String pGasolina){
        Boolean camposValidados = true;
        //String campoNaoPreenchido;

        if(pAlcool==null || pGasolina==null || pAlcool.equals("") || pGasolina.equals("")){
            camposValidados = false;
        }
        return camposValidados;

        /*if((pAlcoolString == null) || pGasolinaString == null || pAlcoolString.equals("") || pGasolinaString.equals("")){
            camposValidados = false;
            campoNaoPreenchido = "alcool";
        }else{
            camposValidados = true;
            campoNaoPreenchido="gasolina";
        }

        return campoNaoPreenchido;*/

    }


    public void resultado(View view){
        //calcular();
    }


}
