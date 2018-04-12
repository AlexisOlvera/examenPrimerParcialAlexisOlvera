package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Practicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicas);
    }

    public void clickCalcu(View view){
        Intent inte = new Intent(this, MainActivity.class);
        startActivity(inte);;
    }

    public void clickEnviaMail(View view){
        Intent inte = new Intent(this, enviaMail.class);
        startActivity(inte);
    }

    public void clickImagen(View view){
        Intent inte = new Intent(this, imagen.class);
        startActivity(inte);
    }

    public void clickNav(View view){
        Intent inte = new Intent(this, navegador.class);
        startActivity(inte);
    }

    public void clickGato(View view){
        Intent inte = new Intent(this, gato.class);
        startActivity(inte);
    }

    public void clickConecta4(View view){
        Intent inte = new Intent(this, conecta4.class);
        startActivity(inte);
    }

    public void clickMemorama(View view){
        Intent inte = new Intent(this, memorama.class);
        startActivity(inte);
    }

    public void clickReserva(View view){
        Intent inte = new Intent(this, res.class);
        startActivity(inte);
    }

    public void clickIntenciones1(View view){
        Intent inte = new Intent(this, intentions.class);
        startActivity(inte);
    }
}
