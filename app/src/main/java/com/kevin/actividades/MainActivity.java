package com.kevin.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeText(View view){
        EditText newText = findViewById(R.id.new_text); //Declaramos e inicializamos nuestros objetoss
        TextView showText = findViewById(R.id.text);

        showText.setText(newText.getText());
    }
}
