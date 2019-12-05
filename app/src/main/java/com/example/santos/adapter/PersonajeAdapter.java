package com.example.santos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.santos.R;
import com.example.santos.model.Personaje;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeAdapterHolder> {

    private List<Personaje> personajes;

    public PersonajeAdapter(List<Personaje> personajes){
        this.personajes = personajes;
    }

    @NonNull
    @Override
    public PersonajeAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_personaje, parent, false);

        return new PersonajeAdapterHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeAdapterHolder holder, int position) {
        Personaje personaje = personajes.get(position);
        holder.tvName.setText(personaje.getTitle());
        holder.tvHeight.setText(personaje.getDescription());
        holder.tvEyeColor.setText(personaje.getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return personajes.size();
    }

    public void setData(List<Personaje> personajes){
        this.personajes = personajes;
        notifyDataSetChanged();
    }

    public class PersonajeAdapterHolder extends RecyclerView.ViewHolder{
        private TextView tvName;
        private TextView tvHeight;
        private TextView tvEyeColor;


        public PersonajeAdapterHolder (@NonNull View itemView){
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvHeight = itemView.findViewById(R.id.tvHeight);
            tvEyeColor = itemView.findViewById(R.id.tvEyeColor);

        }
    }
}
