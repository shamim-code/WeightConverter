package com.example.simpleinteraction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText var;
    private TextView disvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        var=findViewById(R.id.editText);
        disvar=findViewById(R.id.display);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s=var.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                disvar.setText("The corresponding value in Pound: "+pound);
            }
        });
    }
}