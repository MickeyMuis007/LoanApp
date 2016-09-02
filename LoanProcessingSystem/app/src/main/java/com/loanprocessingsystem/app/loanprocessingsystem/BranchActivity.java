package com.loanprocessingsystem.app.loanprocessingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BranchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        
    }

    public void clickBranchAdd(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);

        startActivity(intent);
    }

    public void clickBranchUpdate(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);
        startActivity(intent);
    }

    public void clickBranchDelete(View view){
        Intent intent = new Intent(getApplicationContext(),CustomerAddActivity.class);
        startActivity(intent);
    }
}
