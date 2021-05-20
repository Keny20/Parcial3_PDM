package com.example.parcial3_room.entidades.categoria;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CategoriaDao {
    @Insert
    public long insert(Categoria categoria);
    
    @Query("SELECT * FROM categorias")
    public List<Categoria> getAll();
    
    @Query("SELECT * FROM categorias WHERE id = :id")
    public Categoria getById(int id);
    
    @Update
    public void update(Categoria... categorias);
    
    @Delete
    public void delete(Categoria categorias);
    
}