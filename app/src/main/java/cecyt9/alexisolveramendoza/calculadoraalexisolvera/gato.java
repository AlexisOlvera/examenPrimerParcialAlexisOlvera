package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class gato extends AppCompatActivity {

    Button btnIS, btnCS, btnDS, btnIC, btnCC, btnDC, btnII, btnCI, btnDI;
    ImageButton btnRei;
    private int contador, c1, c2, c3, c4, c5, c6, c7, c8, eval;
    TextView txtT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato);
        txtT = (TextView) findViewById(R.id.txtTitulo);
        contador = 0;
        btnIS = (Button) findViewById(R.id.btnIS);
        btnIS.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnIS);
                c1 += eval;
                c4 += eval;
                c7 += eval;
                gana();
            }
    });
        btnCS = (Button) findViewById(R.id.btnCS);
        btnCS.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnCS);
                c1 += eval;
                c6 += eval;
                gana();
            }
        });
        btnDS = (Button) findViewById(R.id.btnDS);
        btnDS.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnDS);
                c1 += eval;
                c5 += eval;
                c8 += eval;
                gana();
            }
        });
        btnIC = (Button) findViewById(R.id.btnIC);
        btnIC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnIC);
                c2 += eval;
                c7 += eval;
                gana();
            }
        });
        btnCC = (Button) findViewById(R.id.btnCC);
        btnCC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnCC);
                c2 += eval;
                c6 += eval;
                c4 += eval;
                c8 += eval;
                gana();
            }
        });
        btnDC = (Button) findViewById(R.id.btnDC);
        btnDC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnDC);
                c2 += eval;
                c5 += eval;
                gana();
            }
        });
        btnII = (Button) findViewById(R.id.btnII);
        btnII.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnII);
                c3 += eval;
                c7 += eval;
                c8 += eval;
                gana();
            }
        });
        btnCI = (Button) findViewById(R.id.btnCI);
        btnCI.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnCI);
                c3 += eval;
                c6 += eval;
                gana();
            }
        });
        btnDI = (Button) findViewById(R.id.btnDI);
        btnDI.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                eval = pinta(btnDI);
                c3 += eval;
                c5 += eval;
                c4 += eval;
                gana();
            }
        });
        btnRei = (ImageButton) findViewById(R.id.btnResart);
        btnRei.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCC.setText("");
                btnCI.setText("");
                btnCS.setText("");
                btnIC.setText("");
                btnII.setText("");
                btnIS.setText("");
                btnDC.setText("");
                btnDI.setText("");
                btnDS.setText("");
                contador = 0;
                txtT.setText("");
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                c5 = 0;
                c6 = 0;
                c7 = 0;
                c8 = 0;
            }
        });

    }

    public int pinta(Button b){
        if(b.getText().equals("")){
            if(contador%2!=0){
                b.setText("X");
                contador++;
                return 1;
            }else{
                b.setText("O");
                contador++;
                return -1;
            }
        }else{
            return 0;
        }
    }

    private void gana(){
        if(contador>=9){
            txtT.setText("Gato :(");
            txtT.setTextColor(Color.parseColor("#FF00FF"));
        }
        if (c1==3 || c2==3 || c3==3 || c4==3 || c5==3 || c6==3 || c7==3 || c8==3 ){
            txtT.setText("Cruz gana");
            txtT.setTextColor(Color.parseColor("#0000FF"));
        }
        if (c1==-3 || c2==-3 || c3==-3 || c4==-3 || c5==-3 || c6==-3 || c7==-3 || c8==-3 ){
            txtT.setText("Circulo gana");
            txtT.setTextColor(Color.parseColor("#FF0000"));


        }
    }
}
