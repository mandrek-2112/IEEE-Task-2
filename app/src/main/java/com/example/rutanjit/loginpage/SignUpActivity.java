package com.example.rutanjit.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Intent intent3 = getIntent();
        btn = (Button) findViewById(R.id.susubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                susub(v);
            }
        });
    }

    public void susub(View view) {
        Toast.makeText(this, "Redirecting to login page...",
                Toast.LENGTH_LONG).show();
        finish();
    }
}

