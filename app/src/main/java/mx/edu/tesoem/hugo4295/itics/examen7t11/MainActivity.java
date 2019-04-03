package mx.edu.tesoem.hugo4295.itics.examen7t11;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent objprincipal = new Intent(MainActivity.this, MPrincipalActivity.class);
                startActivity(objprincipal);
                finish();

            }
        },5000);
    }
}
