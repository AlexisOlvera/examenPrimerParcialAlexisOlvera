package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class navegador extends AppCompatActivity {

    TextView txURL;
    WebView wV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);
        txURL = (TextView) findViewById(R.id.txtURL);
        wV = (WebView) findViewById(R.id.vistaFake);
    }

    public void ir(View view){
        String recupera = txURL.getText().toString();
        wV.loadUrl(recupera);
    }
}
