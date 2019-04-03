package mx.edu.tesoem.hugo4295.itics.examen7t11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MOperacionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moperaciones);
    }

    public void o_suma(){
        Intent intent = new Intent(this, OSumaActivity.class);
        startActivity(intent);
    }

    public void o_resta(){
        Intent intent = new Intent(this, ORestaActivity.class);
        startActivity(intent);
    }

    public void o_potencia(){
        Intent intent = new Intent(this, OPotenciaActivity.class);
        startActivity(intent);
    }

    public void o_salir(){
        Intent intent = new Intent(this, SalidaActivity.class);
        startActivity(intent);
    }
}
