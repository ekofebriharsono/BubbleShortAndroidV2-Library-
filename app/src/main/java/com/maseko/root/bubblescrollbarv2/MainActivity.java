package com.maseko.root.bubblescrollbarv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.turingtechnologies.materialscrollbar.AlphabetIndicator;
import com.turingtechnologies.materialscrollbar.DragScrollBar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    List<String> listData = new ArrayList<>();

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, linearLayoutManager.getOrientation()));

        initData();
        Collections.sort(listData);

        recyclerView.setAdapter(new Adapter(listData));

        ((DragScrollBar) findViewById(R.id.dragScrollBar))
                .setIndicator(new AlphabetIndicator(this), true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_touch) {
            Intent i = new Intent(this, Main2Activity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
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
