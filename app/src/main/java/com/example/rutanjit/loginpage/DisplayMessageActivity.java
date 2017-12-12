package com.example.rutanjit.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {
        Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent1 = getIntent();
        btn= (Button) findViewById(R.id.exit);
        btn.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                //  finish();
                exit(v);
            }
        });
    }
    public void exit(View view) {
        Toast.makeText(this,"Redirecting...",
                Toast.LENGTH_LONG).show();
         finish();

    }
}
