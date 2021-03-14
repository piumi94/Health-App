package com.example.piumi.healthapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "BodyShapeCalculator.db";
    public static final String TABLE_NAME1 = "male";
    public static final String COL_1 = "mId";
    public static final String COL_2 = "Shoulders";
    public static final String COL_3= "Chest";
    public static final String COL_4 = "Waist";
    public static final String COL_5 = "Hip";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME1 +" (mId INTEGER PRIMARY KEY AUTOINCREMENT, Shoulders INTEGER,Chest INTEGER,Waist INTEGER,Hip INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        onCreate(sqLiteDatabase);
    }
}
