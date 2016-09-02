package com.loanprocessingsystem.app.loanprocessingsystem;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.loanprocessingsystem.app.loanprocessingsystem.adapters.BranchAdapter;
import com.loanprocessingsystem.app.loanprocessingsystem.adapters.LoanAdapter;

import java.util.ArrayList;

import Domain.Loan;

/**
 * Created by Riaan on 9/2/2016.
 */
public class LoanFragment extends ListFragment {
    private ArrayList<Loan> loans;
    private LoanAdapter loanAdapter;

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);

        loans = new ArrayList<Loan>();
        loans.add(new Loan.Builder().type("Car").loanReferenceNo(1L)
                .build());
        loans.add(new Loan.Builder().type("House").loanReferenceNo(2L)
                .build());
        loans.add(new Loan.Builder().type("Instant").loanReferenceNo(3L)
                .build());
        loans.add(new Loan.Builder().type("Hospital").loanReferenceNo(4L)
                .build());
        loans.add(new Loan.Builder().type("Store").loanReferenceNo(5L)
                .build());
        loans.add(new Loan.Builder().type("Credit").loanReferenceNo(6L)
                .build());
        loans.add(new Loan.Builder().type("Mobile").loanReferenceNo(7L)
                .build());

        loanAdapter = new LoanAdapter(getActivity(),loans);


        setListAdapter(loanAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);

    }
}