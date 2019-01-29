package com.maseko.root.bubblescrollbarv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.turingtechnologies.materialscrollbar.ICustomAdapter;
import com.turingtechnologies.materialscrollbar.INameableAdapter;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> implements INameableAdapter {

    List<String> listData;

    public Adapter(List<String> listData) {
        this.listData = listData;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.text1.setText(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    @Override
    public Character getCharacterForElement(int element) {
        // Character c = AppData.pkgLabelList.get(element).charAt(0);
        Character c = listData.get(element).charAt(0);
        if (Character.isDigit(c)) {
            c = '#';
        }
        return c;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
        }
    }


}