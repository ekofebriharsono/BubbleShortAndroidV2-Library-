package com.maseko.root.bubblescrollbarv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.turingtechnologies.materialscrollbar.AlphabetIndicator;
import com.turingtechnologies.materialscrollbar.DragScrollBar;
import com.turingtechnologies.materialscrollbar.TouchScrollBar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<String> listData = new ArrayList<>();

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, linearLayoutManager.getOrientation()));

        initData();
        Collections.sort(listData);

        recyclerView.setAdapter(new Adapter(listData));

        ((TouchScrollBar) findViewById(R.id.touchScrollBar))
                .setIndicator(new AlphabetIndicator(this), true);
    }

    public void initData() {
        listData.add("Adi");
        listData.add("+629787878");
        listData.add("#%^%bhbh");
        listData.add("Adi");
        listData.add("Bobi");
        listData.add("Rijal");
        listData.add("Emma");
        listData.add("Irvan");
        listData.add("Hasan");
        listData.add("Tejo");
        listData.add("Pari");
        listData.add("Sabyan");
        listData.add("Diini");
    }
}
