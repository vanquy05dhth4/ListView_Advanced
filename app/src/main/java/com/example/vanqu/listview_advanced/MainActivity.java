package com.example.vanqu.listview_advanced;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vanqu.listview_advanced.adapter.CustomAdapter;
import com.example.vanqu.listview_advanced.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lstConTact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Contact> arrContact=new ArrayList<>();
        Contact contact0=new Contact(Color.BLUE,"Nguyen Van A","0909123123");
        Contact contact1=new Contact(Color.BLACK,"Nguyen Van B","0909123123");
        Contact contact2=new Contact(Color.CYAN,"Nguyen Van C","0909123123");
        Contact contact3=new Contact(Color.YELLOW,"Nguyen Van D","0909123123");
        Contact contact4=new Contact(Color.RED,"Nguyen Van E","0909123123");
        Contact contact5=new Contact(Color.GRAY,"Nguyen Van F","0909123123");
        Contact contact6=new Contact(Color.WHITE,"Nguyen Van G","0909123123");
        Contact contact7=new Contact(Color.LTGRAY,"Nguyen Van H","0909123123");

        arrContact.add(contact0);
        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);
        arrContact.add(contact5);
        arrContact.add(contact6);
        arrContact.add(contact7);

        CustomAdapter customAdapter=new CustomAdapter(this,R.layout.row_item_contact,arrContact);
        lstConTact= (ListView) findViewById(R.id.lstContact);
        lstConTact.setAdapter(customAdapter);
    }
}
