package com.mhdarslan.roomdatabaselibrary;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "expense")  // use annotation @Entity
public class Expense {

    @PrimaryKey(autoGenerate = true)  // column-1
    private int id;

    @ColumnInfo(name = "title") // column-2
    private String title;

    @ColumnInfo(name = "amount")  // column-3
    private String amount;
}
