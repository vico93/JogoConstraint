package com.vico.jogoconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView btnJogoDaVelha;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogoDaVelha = findViewById(R.id.btnJogoDaVelha);

        btnJogoDaVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirJogoDaVelha();
            }
        });
    }

    private void abrirJogoDaVelha()
    {
        Intent janelaVelha = new Intent(this, JogoVelha.class);
        startActivity(janelaVelha);
        finish();
    }
}