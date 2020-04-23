package com.chestnut.app1v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

import java.util.Vector;

public class Forza4Activity extends AppCompatActivity {
    private static final String TAG = "Forza4Activity";
    private final int ROWS = 6;
    private final int COLS = 7;
    private int gioc = 1;

    int m[][];
    Button btn[][];
    Vector<Button> vBtn;


    TableRow tb0, tb1, tb2, tb3, tb4, tb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forza4);

        // init matrix
        m = new int[ROWS][COLS];
        for(int i=0; i<ROWS; i++){
            for(int j=0; j<COLS; j++){
                m[i][j] = 0;
            }
        }
        // init Vector
        vBtn=new Vector<Button>();
        // bind components
        tb0 = findViewById(R.id.tbR1);
        tb1 = findViewById(R.id.tbR2);
        tb2 = findViewById(R.id.tbR3);
        tb3 = findViewById(R.id.tbR4);
        tb4 = findViewById(R.id.tbR5);
        tb5 = findViewById(R.id.tbR6);
        Button btn;
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_0_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb0.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_1_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb1.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_2_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb2.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_3_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb3.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_4_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb4.addView(btn);
        }
        for(int i=0; i<COLS; i++){
            btn = new Button(this);
            btn.setTransitionName("btn_5_" + i);
            btn.setBackgroundResource(R.color.colorBlu);
            btn.setOnClickListener(new myListener());
            vBtn.add(btn);
            tb5.addView(btn);
        }
        //bindComponents();
    }
    void bindComponents(){
       /* btn = new Button[ROWS][COLS];
        btn[0][0] = findViewById(R.id.btn00);
        btn[0][1] = findViewById(R.id.btn01);
        btn[0][2] = findViewById(R.id.btn02);
        btn[0][3] = findViewById(R.id.btn03);
        btn[0][4] = findViewById(R.id.btn04);
        btn[0][5] = findViewById(R.id.btn05);
        btn[0][6] = findViewById(R.id.btn06);
        btn[1][0] = findViewById(R.id.btn10);
        btn[1][1] = findViewById(R.id.btn11);
        btn[1][2] = findViewById(R.id.btn12);
        btn[1][3] = findViewById(R.id.btn13);
        btn[1][4] = findViewById(R.id.btn14);
        btn[1][5] = findViewById(R.id.btn15);
        btn[1][6] = findViewById(R.id.btn16);
        btn[3][0] = findViewById(R.id.btn30);
        btn[3][1] = findViewById(R.id.btn31);
        btn[3][2] = findViewById(R.id.btn32);
        btn[3][3] = findViewById(R.id.btn33);
        btn[3][4] = findViewById(R.id.btn34);
        btn[3][5] = findViewById(R.id.btn35);
        btn[3][6] = findViewById(R.id.btn36);



        for(int i=0; i<ROWS; i++){
            for(int j=0; i<COLS; j++){
                btn[i][j].setBackgroundResource(R.color.colorBlu);
                btn[i][j].setOnClickListener(new myListener());
            }
        }
*/
    }

    class myListener implements View.OnClickListener{
        private static final String TAG = "ClassListener";
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            int x, y;
            x = Integer.parseInt(btn.getTransitionName().split("_")[1]);
            y = Integer.parseInt(btn.getTransitionName().split("_")[2]);
            Log.d(TAG, "x: " + x + " y: " + y);
            inserisciMoneta(x, y);
        }
        private void inserisciMoneta(int x, int y){
                Log.d(TAG,vBtn.get(0).getTransitionName());
                vBtn.get(0).setBackgroundResource(R.color.coloreVerdeFigo);
                boolean trovato=false;
                while (x<ROWS && trovato==false){
                    if(m[x][y]==0){
                        x++;
                    }else{
                        trovato=true;
                    }
                }
                x--;
                m[x][y]=gioc;

                if(controlloOrizzontale(x,y)){
                    vince(gioc, "ORIZZONTALE");
                }else if(controlloVerticale(x,y)){
                    vince(gioc, "VERTICALE");
                }else if(controlloDiagonalePrinc(x,y)){
                    vince(gioc,"diagonale principale");
                }else if(controlloDiagonaleSec(x,y)){
                    vince(gioc,"DIAGONALE SECONDARIA");
                }

                for (int z=0;z<vBtn.size();z++){
                    if(vBtn.get(z).getTransitionName().equals("btn_"+x+"_"+y)){
                        if(gioc==1){
                            vBtn.get(z).setBackgroundResource(R.color.coloreVerdeFigo);
                        }else{
                            vBtn.get(0).setBackgroundResource(R.color.coloreArancio);
                        }
                        vBtn.get(z).setEnabled(false);
                    }
                }


            }
        }

    private boolean controlloVerticale(int i, int j) {
        int cnt=1;
        int x=i+1;
        // verso il basso
        while (x<ROWS&&m[x][j]==gioc){
            cnt++;
            x++;
        }
        if(cnt==4){
            return true;
        }
        return false;
    }

    private boolean controlloOrizzontale(int i,int j){
        int cnt=1;
        int x= j+1;
        // verso destra
        while(x>COLS&&m[i][x] == gioc){
            cnt++;
            x++;
        }
        // verso sinistra
        x=j-1;
        while (x>=0 && m[i][x]==gioc){
            cnt++;
            x--;
        }
        if(cnt==4){
            return true;
        }
        return false;
    }

    private boolean controlloDiagonaleSec(int i, int j) {
        int cnt=1;
        int x=i+1;
        int y=j+1;
        //verso il basso
        while (x<ROWS&&y<COLS&&m[x][y]==gioc){
            cnt++;
            x++;
            y++;
        }
        //verso l'alto
        x=i-1;
        y=j-1;
        while(x>0 && i>0 && m[x][y]==gioc){
            cnt++;
            x--;
            y--;
        }
        if(cnt==4){
            return true;
        }
        return false;
    }

    private boolean controlloDiagonalePrinc(int i, int j) {
        int cnt=1;
        //verso il basso
        int x = i+1;
        int y = j-1;
        while (x<ROWS && y>=0 && m[x][y]==gioc){
            cnt++;
            x++;
            y--;
        }
        //verso l'alto
        x=i-1;
        y=j+1;
        while(x>=0 && y<COLS && m[x][y]==gioc){
            cnt++;
            x--;
            y++;
        }
        if(cnt==4){
            return true;
        }
        return false;
    }
}
