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

import Domain.Branch;
import Domain.Customer;

/**
 * Created by Riaan on 9/2/2016.
 */
public class BranchAdapter  extends ArrayAdapter<Branch> {



    public BranchAdapter(Context context, ArrayList<Branch> branch){
        super(context,0,branch);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Branch branch = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_rows, parent, false);
        }

        TextView names = (TextView)convertView.findViewById(R.id.listRowsTitle);
        TextView details = (TextView)convertView.findViewById(R.id.listRowsBody);
        ImageView icon = (ImageView)convertView.findViewById(R.id.listRowsImageView);

        names.setText(branch.getName());
        details.setText(branch.getBranchNo() + "");

        return convertView;
    }
}