package com.chestnut.app1v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class
TrisActivity extends AppCompatActivity {
    private static final String TAG = "TrisActivity";

    public int m[][]; // matrice interi
    private boolean g1; // true o false

    private TextView lblTit;
    Button b[][];
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);

        Log.e(TAG, "Activity avviata con successo");

        // binding
        bindComponents();
        // leggere parametri da MainActivity
        Intent intent;
        intent = getIntent();
        // in stringa -> intent.getStringExtra("g1");
        lblTit.setText(intent.getStringExtra("g1") + " VS " + intent.getStringExtra("g2"));

        // init giocatore
        g1 = true;
        // init matrice
        m = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                m[i][j] = 0;
            }
        }

        // possibilità 2
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j].setTransitionName("btn_" + i + "_" + j);
                b[i][j].setOnClickListener(new myListener());
            }
        }
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
            }
        });
    }

    private void bindComponents(){
        lblTit = findViewById(R.id.lblTitolo);
        b = new Button[3][3];
        btnReset = findViewById(R.id.resetButton);
        b[0][0] = findViewById(R.id.btn00); //b[0][0].setTransitionName("btn_0_0");
        b[0][1] = findViewById(R.id.btn01); //b[0][1].setTransitionName("btn_0_1");
        b[0][2] = findViewById(R.id.btn02); //b[0][2].setTransitionName("btn_0_2");
        b[1][0] = findViewById(R.id.btn10); //b[1][0].setTransitionName("btn_1_0");
        b[1][1] = findViewById(R.id.btn11); //b[1][1].setTransitionName("btn_1_1");
        b[1][2] = findViewById(R.id.btn12); //b[1][2].setTransitionName("btn_1_2");
        b[2][0] = findViewById(R.id.btn20); //b[2][0].setTransitionName("btn_2_0");
        b[2][1] = findViewById(R.id.btn21); //b[2][1].setTransitionName("btn_2_1");
        b[2][2] = findViewById(R.id.btn22); //b[2][2].setTransitionName("btn_2_2");
    }


    class myListener implements View.OnClickListener{
        private static final String TAG = "ClassListener";
        @Override
        public void onClick(View v) {
            int x, y;
            boolean vittoria;
            // 1. rintracciare pulsante chiamante
            Button bL = (Button) v;
            Log.i(TAG, String.valueOf(bL.getTransitionName()));
            // 2. assegno a x y le coordinate lette dal Button
            x = Integer.parseInt(bL.getTransitionName().split("_")[1]);
            y = Integer.parseInt(bL.getTransitionName().split("_")[2]);

            if(g1){
                bL.setBackgroundResource(R.color.verdeTris);
                m[x][y] = 1;
                g1 = false;
            }else{
                bL.setBackgroundResource(R.color.rossoTris);
                m[x][y] = 2;
                g1 = true;
            }
            bL.setEnabled(false); // disabilitiamo il click del pulsante

            if(checkWin(x,y)){
                if(!g1){ // ho già invertito giocatore 1 con giocatore 2
                    Log.d(TAG, "VINCE GIOCATORE 1");
                    vince("VINCE GIOCATORE 1");
                }else{
                    Log.d(TAG, "VINCE GIOCATORE 2");
                    vince("VINCE GIOCATORE 2");
                }
                bloccaPulsanti();
            }
        }
    }

    void vince(String g){
        Toast.makeText(this, g, Toast.LENGTH_LONG).show();
    }

    boolean checkWin(int x, int y){
        if(m[0][y] == m[x][y] && m[1][y] == m[x][y] && m[2][y] == m[x][y]){
            // vittoria verticale
            return true;
        }else{
            // ORIZZONTALE
            if(m[x][0] == m[x][y] && m[x][1] == m[x][y] && m[x][2] == m[x][y]){
                // vittoria orizzontale
                return true;
            }else{
                // Diagonale principale
                if(m[0][0] == m[x][y] && m[1][1] == m[x][y] && m[2][2] == m[x][y]){
                    // Vittoria diagonale p.
                }else if(m[0][2] == m[x][y] && m[1][1] == m[x][y] && m[2][0] == m[x][y]){// Diagonale secondaria
                    // Vittoria diagonale s.
                    return true;
                }
            }
        }
        return false;
    }

    void bloccaPulsanti(){
        // POSSIBILITA' 2
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j].setEnabled(false);
            }
        }
    }

    void resetGame(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j].setEnabled(true);
                b[i][j].setBackgroundResource(R.color.coloreBianco);
                m[i][j] = 0;
            }
        }
    }

}
