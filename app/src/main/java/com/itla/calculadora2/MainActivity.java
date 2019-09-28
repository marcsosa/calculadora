package com.itla.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;
    Button ocho;
    Button nueve;
    Button cero;
    Button punto;
    Button suma;
    Button resta;
    Button multi;
    Button divi;
    Button porciento;
    Button eliminar;
    Button igualdad;
    EditText pantalla;
    String cambiar;
    String signo;
    Float Valor1;
    Float Valor2;
    TextView pantalla2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uno = (Button)findViewById(R.id.bt1);
        dos = (Button)findViewById(R.id.bt2);
        tres = (Button)findViewById(R.id.bt3);
        cuatro = (Button)findViewById(R.id.bt4);
        cinco = (Button)findViewById(R.id.bt5);
       seis = (Button)findViewById(R.id.bt6);
       siete = (Button)findViewById(R.id.bt7);
       ocho = (Button)findViewById(R.id.bt8);
       nueve = (Button)findViewById(R.id.bt9);
       cero = (Button)findViewById(R.id.btcero);
       suma = (Button)findViewById(R.id.btsuma);
       resta = (Button)findViewById(R.id.btmenos);
      multi  = (Button)findViewById(R.id.btmulti);
       divi = (Button)findViewById(R.id.btdivision);
       porciento = (Button)findViewById(R.id.btporciento);
       punto = (Button)findViewById(R.id.btpunto);
       igualdad = (Button)findViewById(R.id.btigualdad);
       eliminar = (Button)findViewById(R.id.btdel);
       pantalla = (EditText)findViewById(R.id.etpantalla);
       pantalla2 = (TextView)findViewById(R.id.tvsignos);


       uno.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               cambiar = pantalla.getText().toString();
               cambiar = cambiar + "1";
               pantalla.setText(cambiar);
           }
       });
       dos.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               cambiar = pantalla.getText().toString();
               cambiar = cambiar + "2";
               pantalla.setText(cambiar);
           }
       });
       tres.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               cambiar = pantalla.getText().toString();
               cambiar = cambiar + "3";
               pantalla.setText(cambiar);
           }
       });
       cuatro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               cambiar = pantalla.getText().toString();
               cambiar = cambiar + "4";
               pantalla.setText(cambiar);
           }
       });
       cinco.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               cambiar = pantalla.getText().toString();
               cambiar = cambiar + "5";
               pantalla.setText(cambiar);
           }
       });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = pantalla.getText().toString();
                cambiar = cambiar + "6";
                pantalla.setText(cambiar);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = pantalla.getText().toString();
                cambiar = cambiar + "7";
                pantalla.setText(cambiar);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = pantalla.getText().toString();
                cambiar = cambiar + "8";
                pantalla.setText(cambiar);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = pantalla.getText().toString();
                cambiar = cambiar + "9";
                pantalla.setText(cambiar);
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = pantalla.getText().toString();
                cambiar = cambiar + "0";
                pantalla.setText(cambiar);
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = pantalla.getText().toString();
                cambiar = cambiar + ".";
                pantalla.setText(cambiar);
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(pantalla.getText().toString());
                signo = "+";
                pantalla.setText("");
                pantalla2.setText("+");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(pantalla.getText().toString());
                signo = "-";
                pantalla.setText("");
                pantalla2.setText("-");
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(pantalla.getText().toString());
                signo = "/";
                pantalla.setText("");
                pantalla2.setText("/");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(pantalla.getText().toString());
                signo = "*";
                pantalla.setText("");
                pantalla2.setText("*");
            }
        });
        porciento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor1 = Float.parseFloat(pantalla.getText().toString());
                signo = "%";
                pantalla.setText("");
                pantalla2.setText("%");
            }
        });
        igualdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valor2 = Float.parseFloat(pantalla.getText().toString());

                if (signo == "+") { pantalla.setText(Valor1 + Valor2 + "");
                signo = "";
                    pantalla2.setText("");
                }
                if (signo == "-") { pantalla.setText(Valor1 - Valor2 + "");
                    signo = "";
                    pantalla2.setText("");
                }
                if (signo == "/") { pantalla.setText(Valor1 / Valor2 + "");
                    signo = "";
                    pantalla2.setText("");
                }
                if (signo == "*") { pantalla.setText(Valor1 * Valor2 + "");
                    signo = "";
                    pantalla2.setText("");
                }
                if (signo == "%") { pantalla.setText(Valor1 * Valor2 / 100 + "");
                    signo = "";
                    pantalla2.setText("");
                }
            }
        });

        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiar = "";
                signo = "";
                pantalla.setText("");
                Valor1 = null;
                Valor2 = null;
                pantalla2.setText("");
            }
        });
    }
}
