package com.example.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// MainActivity.java
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<Figure> figures = new ArrayList<>();
        figures.add(new Square(5)); // Agrega instancias de otras figuras

        CustomListAdapter adapter = new CustomListAdapter(this, figures);
        listView.setAdapter(adapter);
    }
}
