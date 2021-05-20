package com.example.parcial3_room.entidades.categoria;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.parcial3_room.R;
import java.util.List;

public class CategoriaAdapter extends BaseAdapter {
    public List<Categoria>categorias;
    public Context context;

    public  CategoriaAdapter(Context context, List<Categoria> categorias) {
        this.context = context;
        this.categorias = categorias;
    }

    @Override
    public int getCount() {
        return categorias.size();
    }

    @Override
    public Object getItem(int i) {
        return categorias.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Categoria c = categorias.get(i);
        view =  LayoutInflater.from(this.context).inflate(R.layout.item_c_list, null);
        return view;
    }
}