package com.dreamteam.app.exercise1.db;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

/**
 * Created by flyingleafe on 10.11.14.
 */
public class ChannelsTable implements BaseColumns {
    public static final String TABLE_NAME = "channels";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_DESCRIPTION = "description";
    public static final String COLUMN_NAME_URL = "url";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_CHANNELS =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    COLUMN_NAME_DESCRIPTION + TEXT_TYPE + COMMA_SEP +
                    COLUMN_NAME_URL + TEXT_TYPE + " UNIQUE ON CONFLICT IGNORE" +
            " );";

    private static final String SQL_DELETE_CHANNELS =
            "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public static void create(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_CHANNELS);
    }

    public static void delete(SQLiteDatabase db) {
        db.execSQL(SQL_DELETE_CHANNELS);
    }
}
