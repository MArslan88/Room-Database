package com.mhdarslan.roomdatabaselibrary;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")  // use annotation @Entity
public class Expense {

    @PrimaryKey(autoGenerate = true)  // column-1
    private int id;

    @ColumnInfo(name = "title") // column-2
    private String title;

    @ColumnInfo(name = "amount")  // column-3
    private String amount;

    // this one is our main constructor
    Expense(int id, String title, String amount){
        this.id =  id;
        this.title = title;
        this.amount = amount;
    }

    @Ignore  // because this one is not our main constructor
    Expense(String title, String amount){
        this.title = title;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
