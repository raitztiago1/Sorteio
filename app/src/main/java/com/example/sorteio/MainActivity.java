package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionaBotao(View view) {

        int numRand = new Random().nextInt(100);

        TextView tfSort = findViewById(R.id.tvSorteio);
        tfSort.setText("O Número Sorteado foi: " + numRand);
    }
}