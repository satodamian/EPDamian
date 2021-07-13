package com.example.epdamian;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class menuindex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuindex);
    }

    //metodo para ocultar
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
        return true;
    }

    //asignar funciones
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Carreras) {
            Intent ingresar = new Intent(this, carreras.class);
            startActivity(ingresar);
            Toast.makeText(this, "Carreras", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.VideoUNTELS) {
            Intent ingresar = new Intent(this, videoinstitucional.class);
            startActivity(ingresar);
            Toast.makeText(this, "VideoUNTELS", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Rector) {
            Intent ingresar = new Intent(this, rector.class);
            startActivity(ingresar);
            Toast.makeText(this, "Rector", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Bicentenario) {
            Intent ingresar = new Intent(this, bicentenario.class);
            startActivity(ingresar);
            Toast.makeText(this, "Bicentenario", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.Salir) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(menuindex.this);
            alerta.setMessage("Desea salir?")
                    .setCancelable(false)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent salir = new Intent(Intent.ACTION_MAIN);
                            salir.addCategory(Intent.CATEGORY_HOME);
                            salir.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(salir);
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            AlertDialog titulo = alerta.create();
            titulo.setTitle("Salida");
            titulo.show();

        }
        return super.onOptionsItemSelected(item);
    }
}


