package com.loanprocessingsystem.app.loanprocessingsystem;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.loanprocessingsystem.app.loanprocessingsystem.adapters.CustomerAdapter;
import com.loanprocessingsystem.app.loanprocessingsystem.adapters.UserAdapter;

import java.util.ArrayList;

import Domain.User;

/**
 * Created by Riaan on 9/1/2016.
 */
public class UserFragment extends ListFragment {
    private ArrayList<User> users;
    private UserAdapter userAdapter;

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);

        String[] values = new String[]{"I'm","Doing","This!!!"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(),android.R.layout.simple_list_item_1,values);

        users= new ArrayList<User>();
        users.add(new User.Builder().name("James").lastName("Peters").userNo(1L)
                .build());
        users.add(new User.Builder().name("Andy").lastName("Camp").userNo(2L)
                .build());
        users.add(new User.Builder().name("Dave").lastName("Patt").userNo(3L)
                .build());
        users.add(new User.Builder().name("Angus").lastName("Titus").userNo(4L)
                .build());
        users.add(new User.Builder().name("Damian").lastName("Long").userNo(5L)
                .build());

        userAdapter = new UserAdapter(getActivity(),users);


        setListAdapter(userAdapter);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

    }
}

