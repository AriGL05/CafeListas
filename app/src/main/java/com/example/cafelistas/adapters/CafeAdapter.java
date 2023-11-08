package com.example.cafelistas.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cafelistas.R;
import com.example.cafelistas.models.Cafe;

import java.util.List;

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.CafeHolder> {
    private List<Cafe> listCafe;
    public CafeAdapter(List<Cafe> listCafe){this.listCafe=listCafe;}

    @NonNull
    @Override
    public CafeAdapter.CafeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View view = ly.inflate(R.layout.itemscafe,parent,false);
        return new CafeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CafeAdapter.CafeHolder holder, int position) {
        Cafe c= listCafe.get(position);
        holder.setData(c);
    }

    @Override
    public int getItemCount() {
        return listCafe.size();
    }

    public class CafeHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        Cafe cafe;
        TextView tvnombre;
        TextView tvTemp;
        TextView tvPrecio;

        public CafeHolder(View view) {
            super(view);
            tvnombre=view.findViewById(R.id.tvNombre);
            tvTemp=view.findViewById(R.id.tvTemp);
            tvPrecio=view.findViewById(R.id.tvPrecio);
        }

        public void setData(Cafe c) {
            cafe=c;
            tvnombre.setText(c.getNombre());
            tvTemp.setText(c.getTemperatura());
            tvPrecio.setText(c.getPrecio());
        }

        @Override
        public void onClick(View view) {

        }
    }
}
