package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class enviaMail extends AppCompatActivity implements View.OnClickListener{

    Button miBtn;
    TextView txtPara, txtAsunto, txtCuerpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envia_mail);

        miBtn = findViewById(R.id.btnEnviar);
        miBtn.setOnClickListener(this);
        txtPara = findViewById(R.id.txtCorreo);
        txtAsunto = findViewById(R.id.txtAsunto);
        txtCuerpo = findViewById(R.id.txtCuerpo);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == miBtn.getId()){
            enviaElMail(v);
        }
    }

    private void enviaElMail(View view){
        String para[] = {txtPara.getText().toString()};
        String asunto = txtAsunto.getText().toString();
        String cuerpoMsj = txtCuerpo.getText().toString();
        Intent miMail = new Intent(Intent.ACTION_SEND);
        miMail.setData(Uri.parse("mailto:"));
        miMail.setType("text/plain");
        miMail.putExtra(Intent.EXTRA_EMAIL, para);
        miMail.putExtra(Intent.EXTRA_SUBJECT, asunto);
        miMail.putExtra(Intent.EXTRA_TEXT, cuerpoMsj);

        try {
            startActivity(Intent.createChooser(miMail, "Envíar mail"));
            Snackbar.make(view, "Expresión incorrecta", Snackbar.LENGTH_LONG)
                    .show();
            finish();
        }catch (ActivityNotFoundException xd){
            Toast.makeText(enviaMail.this, "vientos huracanados", Toast.LENGTH_SHORT).show();
        }

    }
}
