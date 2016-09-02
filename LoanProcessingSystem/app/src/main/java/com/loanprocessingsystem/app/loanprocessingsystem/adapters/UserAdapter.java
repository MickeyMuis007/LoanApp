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

import Domain.User;

/**
 * Created by Riaan on 9/2/2016.
 */
public class UserAdapter  extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User> user){
        super(context,0,user);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_rows, parent, false);
        }

        TextView names = (TextView)convertView.findViewById(R.id.listRowsTitle);
        TextView details = (TextView)convertView.findViewById(R.id.listRowsBody);
        ImageView icon = (ImageView)convertView.findViewById(R.id.listRowsImageView);

        names.setText(user.getName() + " " + user.getLastName());
        details.setText(user.getUserNo() + " " + user.getType());

        return convertView;
    }
}