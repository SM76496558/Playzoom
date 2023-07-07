package com.diego.playzoom;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.diego.playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private Button btnGetStarted;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnGetStarted.setOnClickListener(v -> {
            //Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        binding.txtMovie.setText("Mira tu pelicula \n " +
                "favorita");
    }
}