package com.example.vanqu.listview_advanced.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.vanqu.listview_advanced.R;
import com.example.vanqu.listview_advanced.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vanqu on 07/18/17.
 */

public class CustomAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;
    private ArrayList<Contact> arrayContact;
    private  final String TAG =getClass().getSimpleName();

    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrayContact=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null)
        {
            viewHolder=new ViewHolder();

            convertView= LayoutInflater.from(context).inflate(R.layout.row_item_contact,parent,false);
            viewHolder.txt_Color= (TextView) convertView.findViewById(R.id.txt_Color);
            viewHolder.txt_Name= (TextView) convertView.findViewById(R.id.txtname);
            viewHolder.txt_Number= (TextView) convertView.findViewById(R.id.txtnumber);
            convertView.setTag(viewHolder);
          //  Log.d(TAG,"getView"+(position+1));
        }
        else
        {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Contact contact=arrayContact.get(position);

        viewHolder.txt_Color.setBackgroundColor(contact.getMcolor());
        viewHolder.txt_Color.setText((position+1)+"");
        viewHolder.txt_Name.setText(contact.getMname());
        viewHolder.txt_Number.setText(contact.getmNumber());
        return convertView;
    }
    public class ViewHolder
    {
        TextView txt_Color;
        TextView txt_Name;
        TextView txt_Number;
    }
}
