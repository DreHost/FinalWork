package com.example.finalwork;

import android.app.ListActivity;
import android.app.Person;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class History extends ListActivity {

    Button but_c1,but_c2,but_c3;

    private ArrayList<HashMap<String, String>> listItems;
    private SimpleAdapter listItemAdapter;
    private int msgWhat = 5;
    private  DBManager dbm;
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_history);
        dbm = new DBManager(getApplicationContext());
        listView = findViewById(R.id.listView);

       /* but_c1 = findViewById(R.id.h_but_c1);
        but_c2 = findViewById(R.id.h_but_c2);
        but_c3 = findViewById(R.id.h_but_c3);

        but_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this,MainActivity.class);
                startActivity(intent);
            }
        });

        but_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this,Science.class);
                startActivity(intent);
            }
        });

        but_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History.this,Financial.class);
                startActivity(intent);
            }
        });*/

        show();
        this.setListAdapter(listItemAdapter);
    }

    private void show(){
        List<Item> item = dbm.listAll();
        List<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
        for(Item item1 : item){
            HashMap<String, String> it = new HashMap<String, String>();
            it.put("time", item1.getTime());
            it.put("kind", item1.getKind());
            it.put("mun", item1.getNum());
            data.add(it);
        }
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), data, R.layout.history, new String[]{"time", "kind", "mun"}, new int[]{R.id.time, R.id.kind, R.id.mun});
    }

}