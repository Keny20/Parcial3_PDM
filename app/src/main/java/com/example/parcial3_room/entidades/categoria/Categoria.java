package com.example.parcial3_room.entidades.categoria;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "categorias")
public class Categoria {
    @PrimaryKey(autoGenerate = true)
    public  int id;

    public String name;
}