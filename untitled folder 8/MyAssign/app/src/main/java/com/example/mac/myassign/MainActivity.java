package com.example.mac.myassign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView1);
        List<Book> employees = null;
        try {
            XmlPullParserHandler parser = new XmlPullParserHandler();
            InputStream is=
                    getApplicationContext().getAssets().open("books.xml");
            employees = parser.parse(is);
            //   employees1 = parser.parse(is);
            String name=null;
            for(int i=0; i<employees.size(); i++)
            {
                name = name + " " +employees.get(i).getName();
            }
            Toast.makeText(getApplicationContext(), "Name is: "+ name, Toast.LENGTH_SHORT).show();
            ArrayAdapter<Book> adapter =new ArrayAdapter<Book>(this,android.R.layout.simple_list_item_1, employees);
            listView.setAdapter(adapter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
