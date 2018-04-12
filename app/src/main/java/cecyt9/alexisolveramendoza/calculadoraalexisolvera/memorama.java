package cecyt9.alexisolveramendoza.calculadoraalexisolvera;

import android.print.PrintAttributes;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class memorama extends AppCompatActivity implements View.OnClickListener{
    ImageButton botones[][] = new ImageButton[6][2];
    int contador=0, guarda1=10, guarda2=10, ganas=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorama);
        botones[0][0] = findViewById(R.id.amlo);
        botones[0][1] = findViewById(R.id.amlo2);
        botones[1][0] = findViewById(R.id.piolin);
        botones[1][1] = findViewById(R.id.piolin2);
        botones[2][0] = findViewById(R.id.ocnitrix);
        botones[2][1] = findViewById(R.id.ocnitrix2);
        botones[3][0] = findViewById(R.id.pollo);
        botones[3][1] = findViewById(R.id.pollo2);
        botones[4][0] = findViewById(R.id.patricio);
        botones[4][1] = findViewById(R.id.patricio2);
        botones[5][0] = findViewById(R.id.emo);
        botones[5][1] = findViewById(R.id.emo2);
        ConstraintLayout.LayoutParams rel_btn = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        Random randomX = new Random(), randomY = new Random();
        //ConstraintLayout parentConstraintLayout = (ConstraintLayout) botones[0][0].getParent();
        for(int i = 0; i<6; i++){
            for(int j = 0; j<2; j++){


                //int xx = randomX.nextInt(295-10)+10;
                //int yy = randomY.nextInt(1700)+1;
                //rel_btn.leftMargin = xx;
                //rel_btn.topMargin = yy;
                //rel_btn.width = 250;
                //rel_btn.height = 200;
                botones[i][j].setImageResource(R.drawable.bienvenidos);
                botones[i][j].setOnClickListener(this);
                //botones[i][j].setLayoutParams(rel_btn);
                //ConstraintSet set = new ConstraintSet();
                //set.connect(botones[i][j].getId(), ConstraintSet.START,
                //        ConstraintSet.PARENT_ID, ConstraintSet.START, xx);
                //set.setMargin(botones[i][j].getId(), ConstraintSet.START, xx);
                //set.applyTo(parentConstraintLayout);
            }
        }
    }

    @Override
    public void onClick(View v) {
        for (int i = 0; i<6; i++){
            for(int j = 0; j<2; j++){
                if(botones[i][j].getId() == v.getId() && pasa(i, j)){
                    /*switch (i){
                        case 0:
                            botones[i][j].setImageResource(R.drawable.amlo);
                            break;
                        case 1:
                            botones[i][j].setImageResource(R.drawable.piolin);
                            break;
                        case 2:
                            botones[i][j].setImageResource(R.drawable.ocnitrix);
                            break;
                        case 3:
                            botones[i][j].setImageResource(R.drawable.pollo);
                            break;
                        case 4:
                            botones[i][j].setImageResource(R.drawable.patricio);
                            break;
                        case 5:
                            botones[i][j].setImageResource(R.drawable.emo);
                            break;

                    }*/
                    if(i==0){
                        botones[i][j].setImageResource(R.drawable.amlo);
                    }
                    if(i==1){
                        botones[i][j].setImageResource(R.drawable.piolin);
                    }
                    if(i==2){
                        botones[i][j].setImageResource(R.drawable.ocnitrix);
                    }
                    if(i==3){
                        botones[i][j].setImageResource(R.drawable.pollo);
                    }
                    if(i==4){
                        botones[i][j].setImageResource(R.drawable.patricio);
                    }
                    if(i==5){
                        botones[i][j].setImageResource(R.drawable.emo);
                    }
                    if(contador<1){
                        contador++;
                        guarda1 = i;
                        guarda2 = j;
                    }else{
                        contador = 0;
                        if(i == guarda1){
                            botones[i][j].setEnabled(false);
                            botones[guarda1][guarda2].setEnabled(false);
                            ganas++;
                            if(ganas>3){
                                Toast.makeText(this, "Ganaste", Toast.LENGTH_LONG);
                            }
                            break;
                        }else{

                            botones[i][j].setImageResource(R.drawable.bienvenidos);
                            botones[guarda1][guarda2].setImageResource(R.drawable.bienvenidos);
                            guarda1 = 10;
                            guarda2 = 10;
                            break;

                        }


                    }
                }
            }
        }
    }

    private boolean pasa(int uno, int dos){
        boolean ret=false;
        if(uno != guarda1){
            ret = true;
        }else{
            if(dos != guarda2){
                ret=true;
            }else{
                ret = false;
            }
        }

        return  ret;
    }
}
