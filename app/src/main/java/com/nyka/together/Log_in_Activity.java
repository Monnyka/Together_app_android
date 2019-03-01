package com.nyka.together;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Log_in_Activity extends AppCompatActivity {

    private Button mRegister;
    private TextView mRegisterNow;
    private EditText mEdtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_);
        mRegister=(Button) findViewById(R.id.btnStart);
        mRegisterNow=(TextView)findViewById(R.id.txtRegister);
        mEdtEmail=(EditText)findViewById(R.id.edtEmail);


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChatActivity();
            }
        });
        mRegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });


    }

    //Call Register Activity
    private void openRegisterActivity(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    private  void openChatActivity(){
        Intent intent = new Intent(this,activity_chat.class);
        startActivity(intent);
    }

}
