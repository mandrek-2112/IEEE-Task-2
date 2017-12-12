package com.example.rutanjit.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.login);
        btn2=(Button) findViewById(R.id.fp);
        btn3=(Button) findViewById(R.id.su);

        btn1.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
              //  finish();
                login(v);
            }
        });

        btn2.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                //  finish();
                fp(v);
            }
        });

        btn3.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                //  finish();
                su(v);
            }
        });
    }


    public void login(View view) {
        Intent intent1 = new Intent(this, DisplayMessageActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String username = editText1.getText().toString();
        String pass = editText2.getText().toString();
        if (username.equals("admin") && pass.equals("admin")) {
            startActivity(intent1);
        }
      else{
            Toast.makeText(this, "Incorrect Credentials",
                   Toast.LENGTH_LONG).show();
       }
    }

    public void fp(View view) {
        Intent intent2 = new Intent(this, ForgotPasswordActivity.class);
            startActivity(intent2);


    }

    public void su(View view) {
        Intent intent3 = new Intent(this, SignUpActivity.class);
        startActivity(intent3);


    }


}
