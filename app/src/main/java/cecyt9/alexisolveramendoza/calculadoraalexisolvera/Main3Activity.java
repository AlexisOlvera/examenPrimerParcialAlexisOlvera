package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txtUser;
    TextView txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtUser= findViewById(R.id.usr);
        txtPass= findViewById(R.id.pass);
    }

    public void entrar(View view){
        if(txtUser.getText().toString().equals("humungosaurio")&&txtPass.getText().toString().equals("alienx")){
            Intent inte = new Intent(this, Practicas.class);
            startActivity(inte);
            finish();
        }else{
            Snackbar.make(view, "Contraseña incorrecta", Snackbar.LENGTH_LONG)
                    .show();
        }

    }

}

