package com.example.rutanjit.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        Intent intent2 = getIntent();
        btn = (Button) findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                sub(v);
            }
        });
    }

    public void sub(View view) {
        EditText editText = (EditText) findViewById(R.id.email);
        String email = editText.getText().toString();
        Toast.makeText(this,"Recovery Email sent to " + email,
                Toast.LENGTH_LONG).show();
        finish();
    }
}