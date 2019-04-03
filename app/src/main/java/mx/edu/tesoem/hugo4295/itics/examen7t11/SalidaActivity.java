package mx.edu.tesoem.hugo4295.itics.examen7t11;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SalidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },6000);
    }
}
