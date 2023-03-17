package com.example.hesapmakinesi01;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    float a,b;



    int p;

    TextView islem,result,operator;


    Button btnC, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnD, btnAC;
    Button btnSum,btnSub,btnPro,btnDiv,btnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btn0= findViewById(R.id.btn_0);
        btn1= findViewById(R.id.btn_1);
        btn2= findViewById(R.id.btn_2);
        btn3= findViewById(R.id.btn_3);
        btn4= findViewById(R.id.btn_4);
        btn5= findViewById(R.id.btn_5);
        btn6= findViewById(R.id.btn_6);
        btn7= findViewById(R.id.btn_7);
        btn8= findViewById(R.id.btn_8);
        btn9= findViewById(R.id.btn_9);

        btnD = findViewById(R.id.btn_nokta);
        btnSum= findViewById(R.id.btn_sum);
        btnSub= findViewById(R.id.btn_sub);
        btnDiv= findViewById(R.id.btn_div);
        btnPro= findViewById(R.id.btn_pro);
        btnRes= findViewById(R.id.btn_res);
        btnAC= findViewById(R.id.btn_AC);


        result = findViewById(R.id.result_txt);
        islem = findViewById(R.id.islem_txt);
        operator=findViewById(R.id.operator);

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");


            }
        });


        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                islem.setText(result.getText());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
                islem.setText(result.getText());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
                islem.setText(result.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
                islem.setText(result.getText());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
                islem.setText(result.getText());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                islem.setText(result.getText());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                islem.setText(result.getText());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                islem.setText(result.getText());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                islem.setText(result.getText());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                islem.setText(result.getText());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                islem.setText(result.getText());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a=Float.parseFloat(result.getText()+"");
                p=1;
                result.setText(null);
                operator.setText("-");


            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat(result.getText()+"");
                p=2;
                result.setText(null);
                operator.setText("+");

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a=Float.parseFloat(result.getText()+"");
                p=4;
                result.setText(null);
                operator.setText("/");


            }
        });

        btnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a=Float.parseFloat(result.getText()+"");
                p=3;
                result.setText(null);
                operator.setText("*");

            }
        });



        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Float.parseFloat(result.getText() + "");

                switch (p){

                    case 1:
                        result.setText(a - b + "");
                        islem.setText(a+"-"+b);
                        operator.setText("");

                        break;

                    case 2:
                        result.setText(a + b + "");
                        islem.setText(a+"+"+b);
                        operator.setText("");

                        break;

                    case 3:
                        result.setText(a * b + "");
                        islem.setText(a+"*"+b);
                        operator.setText("");

                        break;
                    case 4:
                        result.setText(a / b + "");
                        islem.setText(a+"/"+b);
                        operator.setText("");

                        break;



                }



            }
        });



























    }
}