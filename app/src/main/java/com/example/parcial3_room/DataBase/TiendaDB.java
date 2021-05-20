package com.example.parcial3_room.DataBase;

import android.content.Context;

import androidx.room.Room;

public class TiendaDB {
    private  final String databaseName = "tienda";
    private static TiendaDB instance;
    public DB db;

    public static TiendaDB getInstance(Context context) {
        if (instance == null) {
            instance = new TiendaDB(context);
        }
        return instance;
    }

    private TiendaDB (Context context) {
        this.db = Room.databaseBuilder(context, DB.class, this.databaseName)
                .allowMainThreadQueries()
                .build();
    }
}