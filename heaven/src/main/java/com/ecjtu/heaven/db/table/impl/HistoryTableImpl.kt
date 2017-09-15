package com.ecjtu.heaven.db.table.impl

import android.database.sqlite.SQLiteDatabase

/**
 * Created by Ethan_Xiang on 2017/9/15.
 */
class HistoryTableImpl:BaseTableImpl(){
    override val sql: String
        get() = "CREATE TABLE tb_history (\n" +
                "    _id           INTEGER PRIMARY KEY ASC AUTOINCREMENT,\n" +
                "    time          STRING,\n" +
                "    id_class_page INTEGER REFERENCES tb_class_page (_id) ON DELETE CASCADE\n" +
                "                                                         ON UPDATE CASCADE\n" +
                ");"

    override fun createTable(sqLiteDatabase: SQLiteDatabase) {
        sqLiteDatabase.execSQL(sql)
    }

    override fun deleteTable(sqLiteDatabase: SQLiteDatabase) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateTable(sqLiteDatabase: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        createTable(sqLiteDatabase)

    }

}