package com.example.parent_app;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class SQLiteDataBaseHelper extends SQLiteOpenHelper {
    String TAG = SQLiteDataBaseHelper.class.getSimpleName();
    String TableName;

    public SQLiteDataBaseHelper(@Nullable Context context
            , @Nullable String name
            , @Nullable SQLiteDatabase.CursorFactory factory, int version, String TableName) {
        super(context, name, factory, version);
        this.TableName = TableName;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQLTable = "CREATE TABLE IF NOT EXISTS parent  ( " +
                "parent_id varchar(50) PRIMARY KEY , " +
                "password varchar(50), " +
                "child varchar(50)," +
                "parent_name varchar(10)" +
                ");";

        db.execSQL(SQLTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        final String SQL = "DROP TABLE " + TableName;
        db.execSQL(SQL);
    }

    //判斷parent帳號密碼
    public String checkparent(String parent_id, String password) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(" SELECT * FROM parent"
                + " WHERE parent_id =" + "'" + parent_id + "'"
                + " AND password =" + "'" + password + "'", null);
        String count = "";
        if (c.moveToNext()) {
            count = "T";
        } else {
            count = "F";
        }
        return count;
    }

    //取得parent
    public ArrayList<HashMap<String, String>> parent(String parent_id) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(" SELECT * FROM parent"
                + " WHERE parent_id =" + "'" + parent_id + "'", null);
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        while (c.moveToNext()) {
            HashMap<String, String> hashMap = new HashMap<>();

            String id = c.getString(0);
            String password = c.getString(1);
            String chlid = c.getString(2);
            String parent_name = c.getString(8);

            hashMap.put("id", id);
            hashMap.put("password", password);
            hashMap.put("chlid", chlid);
            hashMap.put("parent_name", parent_name);

            arrayList.add(hashMap);
        }
        return arrayList;
    }
}
