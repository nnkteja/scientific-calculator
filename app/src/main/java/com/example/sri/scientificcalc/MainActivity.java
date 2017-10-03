package com.example.sri.scientificcalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Stack;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    EditText ta;
    //String n="";
    //numpad
    Button dot,plus,minus,percent,mul,div,comma;
    Button del,ac,zeros,zero,one,two,three,four,five,six,seven,eight,nine,equals;
    //row1
    Button sqrt,inv,logbase,pow10,mod;
    //row2
    Button squared,power,log,ln,acos;
    //row3
    Button sin,cos,tan,asin,atan;
    //row4
    Button abs,fact,leftpar,rightpar,epow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //create text box
        ta = (EditText) findViewById(R.id.tbox);
        //at far left
        ta.setSelection(ta.getText().length());
        //no default keyboard
        ta.setInputType(InputType.TYPE_NULL);
        //ta.setText(n);

        //create buttons
        del = (Button) findViewById(R.id.del);
        //row1
        //sqrt,inv,logbase,pow10,mod
        sqrt = (Button) findViewById(R.id.sqrt);
        inv = (Button) findViewById(R.id.inv);
        logbase=(Button) findViewById(R.id.logbase);
        pow10=(Button) findViewById(R.id.pow10);
        mod=(Button) findViewById(R.id.mod);

        //row2
        //squared,power,log,ln,acos;
        squared=(Button) findViewById(R.id.squared);
        power=(Button) findViewById(R.id.power);
        log=(Button) findViewById(R.id.log);
        ln=(Button) findViewById(R.id.ln);
        acos=(Button) findViewById(R.id.acos);

        //row3
        //sin,cos,tan,asin,atan;
        sin=(Button) findViewById(R.id.sin);
        cos=(Button) findViewById(R.id.cos);
        tan=(Button) findViewById(R.id.tan);
        asin=(Button) findViewById(R.id.asin);
        atan=(Button) findViewById(R.id.atan);

        //row4
        //abs,fact,leftpar,rightpar,epow;
        abs=(Button) findViewById(R.id.abs);
        fact=(Button) findViewById(R.id.fact);
        leftpar=(Button) findViewById(R.id.leftpar);
        rightpar=(Button) findViewById(R.id.rightpar);
        epow=(Button) findViewById(R.id.epow);

        //num pad
        ac=(Button) findViewById(R.id.ac);
        zeros=(Button) findViewById(R.id.zeros);
        zero=(Button) findViewById(R.id.zero);
        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);
        six=(Button) findViewById(R.id.six);
        seven=(Button) findViewById(R.id.seven);
        eight=(Button) findViewById(R.id.eight);
        nine=(Button) findViewById(R.id.nine);
        dot=(Button) findViewById(R.id.dot);
        plus=(Button) findViewById(R.id.plus);
        minus=(Button) findViewById(R.id.minus);
        percent=(Button) findViewById(R.id.percent);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        comma=(Button) findViewById(R.id.comma);

        equals=(Button) findViewById(R.id.equals);





        del.setOnClickListener(this);
        sqrt.setOnClickListener(this);
        inv.setOnClickListener(this);
        ac.setOnClickListener(this);
        zeros.setOnClickListener(this);
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        dot.setOnClickListener(this);
        percent.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        comma.setOnClickListener(this);

        //row1
        //sqrt,inv,logbase,pow10,mod
        sqrt.setOnClickListener(this);
        inv.setOnClickListener(this);
        logbase.setOnClickListener(this);
        pow10.setOnClickListener(this);
        mod.setOnClickListener(this);

        //row2
        //squared,power,log,ln,acos;
        squared.setOnClickListener(this);
        power.setOnClickListener(this);
        log.setOnClickListener(this);
        ln.setOnClickListener(this);
        acos.setOnClickListener(this);

        //row3
        //sin,cos,tan,asin,atan;
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        asin.setOnClickListener(this);
        atan.setOnClickListener(this);

        //row4
        //abs,fact,leftpar,rightpar,epow;
        abs.setOnClickListener(this);
        epow.setOnClickListener(this);
        leftpar.setOnClickListener(this);
        rightpar.setOnClickListener(this);
        fact.setOnClickListener(this);

        equals.setOnClickListener(this);
    }


    public void onClick(View v) {
         switch(v.getId())
         {

             case R.id.del:
                 String ta2=ta.getText().toString();
                 if(ta.length()>0)
                     ta.setText(ta2.substring(0,ta2.length()-1));
                 break;

             case R.id.ac:
                 ta.setText("");
                 break;

             //row1
             //sqrt,inv,logbase,pow10,mod
             case R.id.sqrt:
                   //to be written in eval function

                 //Integer it=Integer.valueOf(ta.getText().toString());
                 //Double sq=Math.sqrt(it);
                 //ta.setText(Double.toString(sq));
                ta.setText(ta.getText()+"sqrt ( ");
                 break;

             case R.id.inv:
                 ta.setText(ta.getText()+"inv ( ");
                 break;

             case R.id.logbase:
                 ta.setText(ta.getText()+"logbase ( ");
                 break;

             case R.id.pow10:
                 ta.setText(ta.getText()+"pow10 ( ");
                 break;

             case R.id.mod:
                 ta.setText(ta.getText()+"mod ( ");
                 break;

             //row2
             //squared,power,log,ln,acos;

             case R.id.squared:
                 ta.setText(ta.getText()+"squared ( ");
                 break;
             case R.id.power:
                 ta.setText(ta.getText()+"pow ( ");
                 break;

             case R.id.log:
                 ta.setText(ta.getText()+"log ( ");
                 break;

             case R.id.ln:
                 ta.setText(ta.getText()+"ln ( ");
                 break;

             case R.id.acos:
                 ta.setText(ta.getText()+"acos ( ");
                 break;

             //row3
             //sin,cos,tan,asin,atan;
             case R.id.sin:
                 ta.setText(ta.getText()+"sin ( ");
                 break;
             case R.id.cos:
                 ta.setText(ta.getText()+"cos ( ");
                 break;
             case R.id.tan:
                 ta.setText(ta.getText()+"tan ( ");
                 break;
             case R.id.asin:
                 ta.setText(ta.getText()+"asin ( ");
                 break;
             case R.id.atan:
                 ta.setText(ta.getText()+"atan ( ");
                 break;

             //row4
             //abs,fact,leftpar,rightpar,epow;
             case R.id.abs:
                 ta.setText(ta.getText()+"abs ( ");
                 break;
             case R.id.fact:
                 ta.setText(ta.getText()+" ! ");
                 break;
             case R.id.leftpar:
                 ta.setText(ta.getText()+"( ");
                 break;
             case R.id.rightpar:
                 ta.setText(ta.getText()+" )");
                 break;
             case R.id.epow:
                 ta.setText(ta.getText()+"epow ( ");
                 break;

             //numpad
             case R.id.zeros:
                 ta.setText(ta.getText()+"00");
                 break;
             case R.id.zero:
                 ta.setText(ta.getText()+"0");
                 break;

             case R.id.one:
                 ta.setText(ta.getText()+"1");
                 break;

             case R.id.two:
                 ta.setText(ta.getText()+"2");
                 break;

             case R.id.three:
                 ta.setText(ta.getText()+"3");
                 break;

             case R.id.four:
                 ta.setText(ta.getText()+"4");
                 break;

             case R.id.five:
                 ta.setText(ta.getText()+"5");
                 break;

             case R.id.six:
                 ta.setText(ta.getText()+"6");
                 break;

             case R.id.seven:
                 ta.setText(ta.getText()+"7");
                 break;

             case R.id.eight:
                 ta.setText(ta.getText()+"8");
                 break;

             case R.id.nine:
                 ta.setText(ta.getText()+"9");
                 break;

             case R.id.dot:
                 ta.setText(ta.getText()+".");
                 break;

             case R.id.percent:
                 ta.setText(ta.getText()+" % ");
                 break;

             case R.id.plus:
                 ta.setText(ta.getText()+" + ( ");
                 break;

             case R.id.minus:
                 ta.setText(ta.getText()+" - ( ");
                 break;
             case R.id.div:
                 ta.setText(ta.getText()+" / ( ");
                 break;
             case R.id.mul:
                 ta.setText(ta.getText()+" * ( ");
                 break;
             case R.id.comma:
                 ta.setText(ta.getText()+" , ");
                 break;

            
            case R.id.equals:
                 ta.setText(eva(ta.getText().toString()));
                 break;



         }
    }

    public static float fact(float n)
    {
        float fact=1;
        for (float i=1;i<=n ;i++ ) {
            fact*=i;
        }
        return fact;
    }
    public static String eva(String exp) { 

        Stack<Float> operandstk=new Stack<Float>();
        Stack<String> operatorstk=new Stack<String>();
        

        // String exp = "( 1 + ( 2 ) + ( inv ( 3 ) * 2 ) + ( 4 * 2 ) + ( 3 ) )";
        // String exp="1 + ( 2.3 * 3 ) + ( 3 * 2 )";
        // String exp="5 !";
        //1+2+3+8+3=6+11
        // String exp="1 2 3 + 4 5 * * +";//StdIn.readString();
        // String exp="mod ( 99 , mod ( 10 , 8 ) )";
        // String exp="pow ( 2 , 8 )";
        // String exp="pow ( inv ( inv ( ( 2 * 2 + 10 ) ) ) , 2 )";
        String s[]=exp.split(" ");
//        for (int i=0;i<s.length;i++ ) {
//            System.out.println(s[i]);
//        }

        //while (!StdIn.isEmpty()) {
       for (int i=0;i<s.length;i++ ) {

  //            System.out.println("contents of operandstk");
        // while(!operandstk.empty())
        //  System.out.println(operandstk.pop());

        

        // System.out.println("contents of operatorstk");
        // while(!operatorstk.empty())
        //  System.out.println(operatorstk.pop());

            if      (s[i].equals("(")||s[i].equals(",")) ;

            else if (s[i].equals("+"))      operatorstk.push(s[i]);
            else if (s[i].equals("-"))      operatorstk.push(s[i]);
            else if (s[i].equals("*"))      operatorstk.push(s[i]);
            else if (s[i].equals("/"))      operatorstk.push(s[i]);
            else if (s[i].equals("%"))      operatorstk.push(s[i]);

            //row1
            else if (s[i].equals("sqrt"))   operatorstk.push(s[i]);
            else if(s[i].equals("inv"))     operatorstk.push(s[i]);
            else if (s[i].equals("logbase"))    operatorstk.push(s[i]);
            else if(s[i].equals("pow10"))     operatorstk.push(s[i]);
            else if (s[i].equals("mod"))    operatorstk.push(s[i]);

            //row2
            else if(s[i].equals("squared"))     operatorstk.push(s[i]);
            else if(s[i].equals("pow"))     operatorstk.push(s[i]);
            else if (s[i].equals("log"))    operatorstk.push(s[i]);
            else if(s[i].equals("ln"))     operatorstk.push(s[i]);
            else if (s[i].equals("acos"))    operatorstk.push(s[i]);

            //row3
            else if(s[i].equals("sin"))     operatorstk.push(s[i]);
            else if(s[i].equals("cos"))     operatorstk.push(s[i]);
            else if (s[i].equals("tan"))    operatorstk.push(s[i]);
            else if(s[i].equals("asin"))     operatorstk.push(s[i]);
            else if (s[i].equals("atan"))    operatorstk.push(s[i]);

            //row4
            else if(s[i].equals("abs"))     operatorstk.push(s[i]);
            else if (s[i].equals("leftpar"))    operatorstk.push(s[i]);
            else if(s[i].equals("rightpar"))     operatorstk.push(s[i]);
            else if (s[i].equals("epow"))    operatorstk.push(s[i]);
            else if (s[i].equals("!"))      operatorstk.push(s[i]);

            else if (s[i].equals(")"))
            {
                String op = operatorstk.pop();
                float v = operandstk.pop();


                if      (op.equals("+"))    v = operandstk.pop() + v;
                else if (op.equals("-"))    v = operandstk.pop() - v;
                else if (op.equals("*"))    v = operandstk.pop() * v;
                else if (op.equals("/"))    v = operandstk.pop() / v;
                else if (op.equals("%"))    v = v*0.01f;

                //row1
                else if (op.equals("sqrt"))   v = (float)Math.sqrt(v);
                else if(op.equals("inv"))     v =(float)Math.pow(v,-1);
                else if (op.equals("logbase")) v=(float)Math.log(v) /(float) Math.log(operandstk.pop());
                else if(op.equals("pow10"))    v =(float)Math.pow(10,v);
                else if (op.equals("mod"))    v =operandstk.pop()%v;

                //row2
                else if(op.equals("squared"))     v =(float)Math.pow(v,2);
                else if(op.equals("pow"))     v =(float)Math.pow(operandstk.pop(),v);
                else if (op.equals("log"))    v=(float)Math.log(v);
                else if(op.equals("ln"))     v=(float)Math.log(v) /(float) Math.log(2.71f);
                else if (op.equals("acos"))    v=(float)Math.acos(v);

                //row3
                else if(op.equals("sin"))     v=(float)Math.sin(v);
                else if(op.equals("cos"))     v=(float)Math.cos(v);
                else if (op.equals("tan"))    v=(float)Math.tan(v);
                else if(op.equals("asin"))    v=(float)Math.asin(v);
                else if (op.equals("atan"))   v=(float)Math.atan(v);

                //row4
                else if(op.equals("abs"))     v=Math.abs(v);
                else if (op.equals("epow"))    v =(float)Math.pow(v,2.71f);
                else if (op.equals("!"))      v=fact(v);

                operandstk.push(v);
            }

            //this is a number
            else  operandstk.push(Float.parseFloat(s[i]));


       }

        while(!operatorstk.empty())
        {
            // operandstk.push(apply(operatorstk.pop(),
                                            // operandstk.pop(),
                                            // operandstk.pop()));
            String op = operatorstk.pop();  
            float v=operandstk.pop();


            if      (op.equals("+"))    v = operandstk.pop() + v;
            else if (op.equals("-"))    v = operandstk.pop() - v;
            else if (op.equals("*"))    v = operandstk.pop() * v;
            else if (op.equals("/"))    v = operandstk.pop() / v;
            else if (op.equals("%"))    v = v*0.01f;

            //row1
            else if (op.equals("sqrt"))   v = (float)Math.sqrt(v);
            else if(op.equals("inv"))     v =(float)Math.pow(v,-1);
            else if (op.equals("logbase")) v=(float)Math.log(v) /(float) Math.log(operandstk.pop());
            else if(op.equals("pow10"))    v =(float)Math.pow(10,v);
            else if (op.equals("mod"))    v =operandstk.pop()%v;

            //row2
            else if(op.equals("squared"))     v =(float)Math.pow(v,2);
            else if(op.equals("pow"))     v =(float)Math.pow(operandstk.pop(),v);
            else if (op.equals("log"))    v=(float)Math.log(v);
            else if(op.equals("ln"))     v=(float)Math.log(v) /(float) Math.log(2.71f);
            else if (op.equals("acos"))    v=(float)Math.acos(v);

            //row3
            else if(op.equals("sin"))     v=(float)Math.sin(v);
            else if(op.equals("cos"))     v=(float)Math.cos(v);
            else if (op.equals("tan"))    v=(float)Math.tan(v);
            else if(op.equals("asin"))    v=(float)Math.asin(v);
            else if (op.equals("atan"))   v=(float)Math.atan(v);

            //row4
            else if(op.equals("abs"))     v=Math.abs(v);
            else if (op.equals("epow"))    v =(float)Math.pow(v,2.71f);
            else if (op.equals("!"))      v=fact(v);

            operandstk.push(v);
        }
        float f=operandstk.pop();
        String s1 = String.valueOf(f);
        if(isnum(s1))
            return s1;
        else return "error";

    }
    public static boolean isnum(String s)
    {
        try{
            Float.parseFloat(s);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        catch(NullPointerException e)
        {
            return false;
        }

        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
