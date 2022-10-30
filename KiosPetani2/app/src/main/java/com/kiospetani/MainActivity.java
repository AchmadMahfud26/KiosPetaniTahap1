package com.kiospetani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    TextView txtemaildanpassword;
    EditText txtemail, txtpassword;
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtemaildanpassword = (TextView) findViewById(R.id.txtemaildanpassword);
        txtemail = (EditText) findViewById(R.id.txtemail);
        txtpassword = (EditText) findViewById(R.id.txtpassword);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        Login = (Button) findViewById(R.id.txtbutton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stremail = txtemail.getText().toString();
                String strpassword = txtpassword.getText().toString();

                txtemaildanpassword.setText(stremail + "\n" + strpassword);
            }
        });

    }
}