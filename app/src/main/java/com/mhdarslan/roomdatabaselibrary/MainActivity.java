package com.mhdarslan.roomdatabaselibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtTitle, edtAmount;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialization
        edtTitle = findViewById(R.id.edtName);
        edtAmount = findViewById(R.id.edtAmount);
        btnAdd = findViewById(R.id.btnAdd);

        DatabaseHelper databaseHelper = DatabaseHelper.getDB(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edtTitle.getText().toString();
                String amount = edtAmount.getText().toString();
                databaseHelper.expenseDao().addTx(
//                        new Expense("Food","100")
                        new Expense(title,amount)
                );

                ArrayList<Expense> arrayExpenses = (ArrayList<Expense>) databaseHelper.expenseDao().getAllExpense();
                for(int i=0; i<arrayExpenses.size(); i++){
                    Log.d("Data","Titile: "+arrayExpenses.get(i).getTitle() + " Amount: "+arrayExpenses.get(i).getAmount());
                }
            }
        });

    }
}