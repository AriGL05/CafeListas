package com.example.cafelistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cafelistas.adapters.CafeAdapter;
import com.example.cafelistas.models.Cafe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Cafe> ListaCafe = new ArrayList<>();
        ListaCafe.add(new Cafe("Cappuccino Vanilla","Caliente",54));
        ListaCafe.add(new Cafe("Frappe Oreo","Frio",60));

        CafeAdapter ca = new CafeAdapter(ListaCafe);
        RecyclerView rv = findViewById(R.id.rcCafe);
        rv.setAdapter(ca);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}