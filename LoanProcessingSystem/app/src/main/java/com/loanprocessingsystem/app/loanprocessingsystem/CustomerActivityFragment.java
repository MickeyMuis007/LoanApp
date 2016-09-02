package com.loanprocessingsystem.app.loanprocessingsystem;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.loanprocessingsystem.app.loanprocessingsystem.adapters.CustomerAdapter;

import java.util.ArrayList;

import Domain.Customer;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerActivityFragment extends ListFragment {
    private ArrayList<Customer> customers;
    private CustomerAdapter customerAdapter;

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);

        String[] values = new String[]{"I'm","Doing","This!!!"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(),android.R.layout.simple_list_item_1,values);

        customers = new ArrayList<Customer>();
        customers.add(new Customer.Builder().name("Michael Alan").lastName("Hendricks").customerId(1L)
                .build());
        customers.add(new Customer.Builder().name("Josh").lastName("Camp").customerId(2L)
                .build());
        customers.add(new Customer.Builder().name("Alan").lastName("Adam").customerId(3L)
                .build());
        customers.add(new Customer.Builder().name("Matt").lastName("Daimon").customerId(4L)
                .build());
        customers.add(new Customer.Builder().name("Damian").lastName("Malgas").customerId(5L)
                .build());

        customerAdapter = new CustomerAdapter(getActivity(),customers);


        setListAdapter(customerAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

    }

}
