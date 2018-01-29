package com.uninorte.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText oper1,oper2;
    public String operador;
    public double numero1,numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybtn=(Button)findViewById(R.id.button31);
        TextView txtView=(TextView)findViewById(R.id.textView4);
        

    }

    public void sumar(View v){
        //convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1+n2;
        mostrar(sum);
    }

    public void restar(View v){
        //convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1-n2;
        mostrar(sum);
    }

    public void multiplicar(View v){
        //convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1*n2;
        mostrar(sum);

    }

    public void dividir(View v){
        //convertimos a número los valores introducidos y operamos
        int n1=Integer.parseInt(oper1.getText().toString());
        int n2=Integer.parseInt(oper2.getText().toString());
        int sum=n1/n2;
        mostrar(sum);
    }

    public void mostrar(int sum){
        //mostramos resultado en un Toast
         Toast.makeText(this,"Resultado operación:" + sum, Toast.LENGTH_LONG).show();
         TextView tvv= (TextView) findViewById(R.id.textView4);
         tvv.setText(sum);
    }



    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickDEL(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText("");
    }

    public void onClickBtn1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickBtnRestar(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "-");
    }
    public void onClickBtnSumar(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "+");
    }
    public void onClickBtnMultiplicar(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "*");
    }
    public void onClickBtnDividir(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "/");
    }
    public void onClickBtn2(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickBtn3(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickBtn4(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickBtn5(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickBtn6(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickBtn7(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickBtn8(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickBtn9(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickBtn0(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + "0");
    }
    public void onClickBtnPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textView4) ;
        tv.setText(tv.getText() + ".");
    }





}

