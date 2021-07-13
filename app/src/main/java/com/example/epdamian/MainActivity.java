package com.example.epdamian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.idusuario);
        et2 = (EditText) findViewById(R.id.idpassword);

        bt1 = findViewById(R.id.btningresar);

    }
    public void Menuindex (View view) {
        if (et1.getText().toString().equals("sato") && et2.getText().toString().equals("sato123")) {
            Intent menuindex = new Intent(this, menuindex.class);
            startActivity(menuindex);
        } else {
            Toast.makeText(this,"El usuario ingresado no existe", Toast.LENGTH_SHORT).show();
        }
    }

}