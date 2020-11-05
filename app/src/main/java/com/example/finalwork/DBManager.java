package com.example.finalwork;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private DBHelper dbHelper;
    private String TBNAME;

    public DBManager(Context context) {
        dbHelper = new DBHelper(context);
        TBNAME = DBHelper.TB_NAME;
    }


    public void addAll(List<Item> list){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        for (Item item : list) {
            ContentValues values = new ContentValues();
            values.put("time", item.getTime());
            values.put("kind", item.getKind());
            values.put("num", item.getNum());
            db.insert(TBNAME, null, values);
        }
        db.close();
    }



    public ArrayList<Item> listAll(){
        ArrayList<Item> rateList = null;
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(TBNAME, null, null, null, null, null, null);
        if(cursor!=null){
            rateList = new ArrayList<Item>();
            while(cursor.moveToNext()){
                Item item = new Item();
                item.setTime(cursor.getString(cursor.getColumnIndex("time")));
                item.setKind(cursor.getString(cursor.getColumnIndex("kind")));
                item.setNum(cursor.getString(cursor.getColumnIndex("num")));

                rateList.add(item);
            }
            cursor.close();
        }
        db.close();
        return rateList;

    }
}
