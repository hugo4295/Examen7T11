package mx.edu.tesoem.hugo4295.itics.examen7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PSaludoActivity extends AppCompatActivity {

    TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psaludo);
        saludo = (TextView) findViewById(R.id.txtsaludanombre);

        Bundle parametro = this.getIntent().getExtras();

        saludo.setText("Bienvenido " + parametro.getString("nombre").toString());
    }
}
