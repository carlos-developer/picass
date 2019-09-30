package com.gopenux.testgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Views();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               pasartexto();
            }
        });
    }

    private void pasartexto() {
        String textoEnviar = editText.getText().toString();
        textView.setText(textoEnviar);
    }

    private void Views() {
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }
}
