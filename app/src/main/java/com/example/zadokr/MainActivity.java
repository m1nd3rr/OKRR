package com.example.zadokr;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCount(View view) {
        double a = Double.parseDouble(((EditText)findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble(((EditText)findViewById(R.id.b)).getText().toString());
        int alpha = Integer.parseInt(((EditText)findViewById(R.id.alpha)).getText().toString());

        if (a < 0 || b < 0 || alpha > 90) {
            Toast.makeText(this, "Неверный формат данных", Toast.LENGTH_LONG).show();
            return;
        }
        double alphaInRadians = Math.toRadians(alpha);
        double result = a * b * Math.sin(alphaInRadians);
        ((TextView)findViewById(R.id.answer)).setText(String.valueOf(result));
    }
}