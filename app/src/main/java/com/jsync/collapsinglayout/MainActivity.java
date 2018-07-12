package com.jsync.collapsinglayout;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        collapsingToolbar = findViewById(R.id.collapsingtoolbar);

        toolbar.setTitle("Toolbar Title");

        collapsingToolbar.setTitle("Collapsing Title");

        setSupportActionBar(toolbar);

    }
}
