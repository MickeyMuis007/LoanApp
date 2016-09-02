package com.loanprocessingsystem.app.loanprocessingsystem.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.loanprocessingsystem.app.loanprocessingsystem.R;

import java.util.ArrayList;

import Domain.Loan;

/**
 * Created by Riaan on 9/2/2016.
 */
public class LoanAdapter extends ArrayAdapter<Loan> {



    public LoanAdapter(Context context, ArrayList<Loan> Branch){
        super(context,0,Branch);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Loan loan = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_rows, parent, false);
        }

        TextView names = (TextView)convertView.findViewById(R.id.listRowsTitle);
        TextView details = (TextView)convertView.findViewById(R.id.listRowsBody);
        ImageView icon = (ImageView)convertView.findViewById(R.id.listRowsImageView);

        names.setText(loan.getLoanReferenceNo() + " " + loan.getType());
        details.setText(loan.getLoanReferenceNo() + "");

        return convertView;
    }
}
