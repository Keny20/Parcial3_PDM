package com.example.parcial3_room.DataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.parcial3_room.entidades.categoria.Categoria;
import com.example.parcial3_room.entidades.categoria.CategoriaDao;

import java.security.Provider;

@Database(entities = {Categoria.class}, version = 1, exportSchema = false)
public abstract class DB extends RoomDatabase {
    public abstract CategoriaDao categorias();
}