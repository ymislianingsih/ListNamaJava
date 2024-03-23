package com.example.listnamajava;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.listnamajava.RecycleAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item>items = new ArrayList<Item>();
        items.add(new Item("Nama: Yuliana Mislianingsih","Nim: 12250123497\n",R.drawable.yana));
        items.add(new Item("Nama: M Farhan Aulia Pratama","Nim: 12250113521\n",R.drawable.farhan2));
        items.add(new Item("Nama: Ready Malik Putra","Nim: 12250113761\n",R.drawable.ready));
        items.add(new Item("Nama: Rifki Faiz Azurananda","Nim: 12250113451\n",R.drawable.pais));
        items.add(new Item("Nama: Restu Kharrisa Andini","Nim: 12250124591\n",R.drawable.andin));
        items.add(new Item("Nama: Nur Delifah","Nim: 12250123957\n",R.drawable.deli));
        items.add(new Item("Nama: Farhan Fadhila","Nim: 12250113444\n",R.drawable.farhan1));
        items.add(new Item("Nama: Aqmal Syarif Fadhilah","Nim: 12250113564\n",R.drawable.aqmal));
        items.add(new Item("Nama: Fadlan Nur Ramadhan","Nim: 12250113820\n",R.drawable.fadlan));
        items.add(new Item("Nama: Harry Finaldhi","Nim: 12250113594\n",R.drawable.harry));
        items.add(new Item("Nama: Muhammad Ilham Akbar","Nim: 12250113387\n",R.drawable.akbar));
        items.add(new Item("Nama: Muhammad Raja Fahrezy","Nim: 12250113812\n",R.drawable.unknown));
        items.add(new Item("Nama: Salsabila Aurelia Rickardo","Nim: 12250121918\n",R.drawable.caca));
        items.add(new Item("Nama: Tasya Dwi Yanti","Nim: 12250123081\n",R.drawable.tasya));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecycleAdapter (getApplicationContext(),items));

    }
}