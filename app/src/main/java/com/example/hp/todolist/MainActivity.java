package com.example.hp.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems=(ListView)findViewById(R.id.lvItems);
        items=new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        items.add("First Item");
        items.add("Second Item");

    }
    public void addItems(View v){
        EditText et=(EditText)findViewById(R.id.etNewItem);
        String text=et.getText().toString();
        itemsAdapter.add(text);
        et.setText("");

    }

    public void onButtonTap(View v){
        Toast myToast=Toast.makeText(getApplicationContext(),"new Item added",Toast.LENGTH_LONG);
        myToast.show();
    }

}
