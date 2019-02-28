package com.nyka.together;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {
    private ImageButton mBackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mBackButton=(ImageButton) findViewById(R.id.btnBack);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }

    private void openLoginActivity(){
        Intent intent =new Intent(this,Log_in_Activity.class);
        startActivity(intent);
    }

}
