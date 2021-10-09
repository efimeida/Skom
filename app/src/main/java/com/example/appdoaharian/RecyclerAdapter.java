package com.example.appdoaharian;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private ArrayList<Ashus_Item_Listview> items;
    private ArrayList<Ashus_Item_Listview> originalItems;

    public RecyclerAdapter(ArrayList<Ashus_Item_Listview> items) {
        this.items = items;
        this.originalItems = new ArrayList<>();
        originalItems.addAll(items);
    }

    @NonNull
    @Override
    public RecyclerAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_ashus__item__listview, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerHolder holder, int position) {
        holder.tv_No.setText(items.get(position).getNo());
        holder.tv_Description.setText(items.get(position).getDescription());
        holder.tv_ListAsmaulHusna.setText(items.get(position).getListAsmaulHusna());
        holder.tv_Arab.setText(items.get(position).getArab());
    }

    @Override
    public int getItemCount() {
        return (items!= null) ? items.size() :0;
    }

    public void filter(final String strSearch){
        if (strSearch.length()== 0){
            items.clear();
            items.addAll(originalItems);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                items.clear();
                List<Ashus_Item_Listview> collect = originalItems.stream()
                        .filter(i -> i.getListAsmaulHusna().toLowerCase().contains(strSearch))
                        .collect(Collectors.toList());

                items.addAll(collect);
            }
            else {
                items.clear();
                for (Ashus_Item_Listview i : originalItems){
                    if (i.getListAsmaulHusna().toLowerCase().contains(strSearch)){
                        items.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }
    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private TextView tv_No, tv_ListAsmaulHusna, tv_Description, tv_Arab;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            tv_No = itemView.findViewById(R.id.tv_no);
            tv_ListAsmaulHusna = itemView.findViewById(R.id.tv_asmaulhusna);
            tv_Description = itemView.findViewById(R.id.tv_arti);
            tv_Arab = itemView.findViewById(R.id.tv_ayat);
        }
    }
}
