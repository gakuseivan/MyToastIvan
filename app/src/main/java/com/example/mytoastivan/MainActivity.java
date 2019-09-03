package com.example.mytoastivan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2,btn3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View boton1 = findViewById(R.id.btnDefault);
        boton1.setOnClickListener(this);
        View boton2 = findViewById(R.id.btnGravity);
        boton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        String mensaje="";
     if(view.getId()==R.id.btnDefault)
     {
         //Toast.makeText(getApplicationContext(), "Hola Toast", Toast.LENGTH_SHORT).show();
         mensaje="Toast por defecto";
     }
     else if(view.getId()==R.id.btnGravity)
     {
         //Toast.makeText(getApplicationContext(), "Toast con Posición", Toast.LENGTH_SHORT).show();
         mensaje = "Toast con Posición";
         //toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
         //toast.show();
     }
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}

//Toast.makeText(this, "Hola Toast", Toast.LENGTH_SHORT).show();

 /*       btn1 =(Button)findViewById(R.id.btnDefault);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hola Toast", Toast.LENGTH_SHORT).show();
            }
        });
        btn2 =(Button)findViewById(R.id.btnGravity);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Toast con Posición", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
                toast.show();
            }
        });
        btn3 =(Button)findViewById(R.id.btnCustom);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Toast Personalizado", Toast.LENGTH_SHORT).show();
            }
        });*/
