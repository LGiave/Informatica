package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TrisActivity extends AppCompatActivity {
    private TextView title;
    public int matrix[][];
    private boolean g1,vittoria;
    Button b00, b01 , b02;
    Button b10, b11 , b12;
    Button b20, b21 , b22;

    Button b[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);

        title=findViewById(R.id.title);

        title.setText(getIntent().getStringExtra("G1") +"  Vs  "+ getIntent().getStringExtra("G2"));

        g1=true;


        matrix = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=0;
            }
        }
/*
        b00.setOnClickListener(new myListener());
        b01.setOnClickListener(new myListener());
        b02.setOnClickListener(new myListener());
        b10.setOnClickListener(new myListener());
        b11.setOnClickListener(new myListener());
        b12.setOnClickListener(new myListener());
        b20.setOnClickListener(new myListener());
        b21.setOnClickListener(new myListener());
        b22.setOnClickListener(new myListener());
 */
// oppure
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[0][0].setTransitionName("btn" + i +"_" + j);
                b[i][j].setOnClickListener(new myListener());
            }
        }
    }

    private void bindComponents(){
        title = findViewById(R.id.textView2);
/*
        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);

 */
// oppure

        b=new Button[3][3];

        b[0][0] = findViewById(R.id.b00);
        b[0][1] = findViewById(R.id.b01);
        b[0][2] = findViewById(R.id.b02);
        b[1][0] = findViewById(R.id.b10);
        b[1][1] = findViewById(R.id.b11);
        b[1][2] = findViewById(R.id.b12);
        b[2][0] = findViewById(R.id.b20);
        b[2][1] = findViewById(R.id.b21);
        b[2][2] = findViewById(R.id.b22);
    }
    void vince(String g){
        Toast.makeText(this, g , Toast.LENGTH_LONG).show();
    }
    void bloccaPulsanti(){
        b00.setEnabled(false);
        b01.setEnabled(false);
        b02.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b20.setEnabled(false);
        b21.setEnabled(false);
        b22.setEnabled(false);
    }

    class myListener implements View.OnClickListener{
        private static final String TAG = "classListener";
        @Override
        public void onClick(View v) {
            int x,y;
            Log.i(TAG, "CLICK");
            // rintracciare pulsante
            Button bl = (Button) v;
            Log.i(TAG, String.valueOf((bl.getTransitionName())));

            x=Integer.parseInt(bl.getTransitionName().split("_")[1]);
            y=Integer.parseInt(bl.getTransitionName().split("_")[2]);

            if(g1){
                matrix[x][y]=1;
                g1=false;
                bl.setBackgroundResource(R.color.G1);
            }else{
                matrix[x][y]=2;
                g1=true;
                bl.setBackgroundResource(R.color.G2);
            }

            for(int i=0;i<3;i++){
                Log.d("",String.valueOf(matrix[i][0])+ "" + String.valueOf(matrix[i][1]) + "" + String.valueOf(matrix[i][2]));
            }

            vittoria=false;

            if(matrix[0][y]==matrix[x][y] && matrix[1][y]==matrix[x][y] && matrix[2][y]==matrix[x][y]){
                vittoria = true;
            }else{
                if(matrix[x][0]==matrix[x][y] && matrix[x][1]==matrix[x][y] && matrix[x][2]== matrix[x][y]){
                    vittoria=true;
                }else{
                    if()
                }
            }

            if(vittoria){
                if(!g1){
                    Log.d(TAG, "Vince G1");
                    vince("Vince:G1");
                }else{
                    Log.d(TAG, "VInce G2");
                    vince("Vince:G2")
                }
            }

        }
    }
}
