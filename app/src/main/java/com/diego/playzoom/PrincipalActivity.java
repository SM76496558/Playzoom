package com.diego.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import com.diego.playzoom.databinding.ActivityPrincipalBinding;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fabAddMovie.setOnClickListener(v -> {
            Snackbar.make(binding.getRoot(), "Add a movie", Snackbar.LENGTH_SHORT).show();
        });
        binding.tbPlayzoom.setTitle("Bienvenido(a) Jennifer");
        setSupportActionBar(binding.tbPlayzoom);

    }
}