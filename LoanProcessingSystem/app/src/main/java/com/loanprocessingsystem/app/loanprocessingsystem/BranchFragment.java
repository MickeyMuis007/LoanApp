package com.loanprocessingsystem.app.loanprocessingsystem;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.loanprocessingsystem.app.loanprocessingsystem.adapters.BranchAdapter;
import com.loanprocessingsystem.app.loanprocessingsystem.adapters.CustomerAdapter;

import java.util.ArrayList;

import Domain.Branch;

/**
 * Created by Riaan on 9/2/2016.
 */
public class BranchFragment extends ListFragment{
    private ArrayList<Branch> branches;
    private BranchAdapter branchAdapter;

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);

        branches = new ArrayList<Branch>();
        branches.add(new Branch.Builder().name("N1").branchNo(1L)
                .build());
        branches.add(new Branch.Builder().name("Cape Point").branchNo(2L)
                .build());
        branches.add(new Branch.Builder().name("Goodwood").branchNo(3L)
                .build());
        branches.add(new Branch.Builder().name("Camps Bay").branchNo(4L)
                .build());
        branches.add(new Branch.Builder().name("Durban").branchNo(5L)
                .build());

        branchAdapter = new BranchAdapter(getActivity(),branches);


        setListAdapter(branchAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

    }
}
