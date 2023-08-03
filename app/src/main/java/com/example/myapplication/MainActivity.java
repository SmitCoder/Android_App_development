package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText name , pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);

        login = findViewById(R.id.btn);
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(name.getText().toString().trim().equals(""))
                        {
                            name.setError("Name is required");
                        }
                        else if (pass.getText().toString().trim().equals(""))
                        {
                            pass.setError("password is required");
                        } else if (pass.getText().toString().trim().length()<=6)
                        {
                         pass.setError("min length should be 6");
                        } else {
                            System.out.println("login successfully");
                            Snackbar.make(view, "Login", Snackbar.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this , HomeActivity.class);
                            startActivity(intent);
                        }
                    }
                });
    }
}