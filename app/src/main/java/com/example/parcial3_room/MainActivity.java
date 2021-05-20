package com.example.parcial3_room;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.parcial3_room.DataBase.TiendaDB;
import com.example.parcial3_room.entidades.categoria.Categoria;
import com.example.parcial3_room.entidades.categoria.CategoriaAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TiendaDB tienda;
    List<Categoria> categorias;
    CategoriaAdapter adapter;
    ListView listCategorias;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listCategorias = (ListView)findViewById(R.id.list_categoria);
        tienda = TiendaDB.getInstance(this);
       insertCategoria();
        this.load();

    }

    private void load(){
        context = getApplicationContext();
        categorias = tienda.db.categorias().getAll();
        adapter = new CategoriaAdapter(context, categorias);
        listCategorias.setAdapter(adapter);
    }
    private void insertCategoria() {
        Categoria c = new Categoria();
        c.name = "Hola";
        long res = tienda.db.categorias().insert(c);
        Toast.makeText(context, "Nueva categoria agregada", Toast.LENGTH_SHORT).show();
       // Navigation.findNavController(view).navigate(R.id.action_newCategoryFragment_to_categoriesFragment);
    }
}