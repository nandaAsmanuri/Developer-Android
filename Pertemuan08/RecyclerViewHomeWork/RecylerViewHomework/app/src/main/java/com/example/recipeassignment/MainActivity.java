package com.example.recipeassignment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<Recipe> recipes;
    private RecyclerView rcView;
    private RecipeAdapter adapter;
    public static final String EXTRA_REPLY = "com.example.recipeassignment.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        recipes = DataProvider.getRecipes();

        rcView = findViewById(R.id.recyclerview);

        adapter = new RecipeAdapter(this, recipes);

        rcView.setAdapter(adapter);

        rcView.setLayoutManager(new LinearLayoutManager(this));
    }




}
