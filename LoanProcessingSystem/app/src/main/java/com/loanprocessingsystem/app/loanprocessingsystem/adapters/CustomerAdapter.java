package com.loanprocessingsystem.app.loanprocessingsystem.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.loanprocessingsystem.app.loanprocessingsystem.R;

import java.util.ArrayList;

import Domain.Customer;

/**
 * Created by Riaan on 8/30/2016.
 */
public class CustomerAdapter extends ArrayAdapter<Customer> {
    public CustomerAdapter(Context context, ArrayList<Customer> customers){
        super(context,0,customers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Customer customer = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_rows, parent, false);
        }

        TextView names = (TextView)convertView.findViewById(R.id.listRowsTitle);
        TextView details = (TextView)convertView.findViewById(R.id.listRowsBody);
        ImageView icon = (ImageView)convertView.findViewById(R.id.listRowsImageView);

        names.setText(customer.getName() + " " + customer.getLastName());
        details.setText(customer.getCustomerId() + "");

        return convertView;
    }
}
