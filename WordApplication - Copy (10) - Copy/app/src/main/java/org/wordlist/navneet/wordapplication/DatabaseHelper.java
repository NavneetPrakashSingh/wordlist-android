package org.wordlist.navneet.wordapplication;

/**
 * Created by Navneet on 7/14/2015.
 */
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper{
    // Database Name
    public static String DATABASE_NAME = "student_database";

    // Current version of database
    private static final int DATABASE_VERSION = 2;

    // Name of table
    private static final String TABLE_STUDENTS = "students0";

    // All Keys used in table
    private static final String KEY_ID = "id";
    private static final String KEY_WORD = "name";
    private static final String KEY_MEANING = "word";
    private static final String KEY_SENTENCE = "sentence";

    public static String TAG = "tag";

    // Students Table Create Query
    /**
     * CREATE TABLE students ( id INTEGER PRIMARY KEY AUTOINCREMENT, name
     * TEXT,phone_number TEXT);
     */

    private static final String CREATE_TABLE_STUDENTS = "CREATE TABLE "
            + TABLE_STUDENTS + "(" + KEY_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_WORD + " TEXT,"
            + KEY_MEANING + " TEXT,"+ KEY_SENTENCE +" TEXT );";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This method is called by system if the database is accessed but not yet
     * created.
     */

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_STUDENTS); // create students table

    }

    /**
     * This method is called when any modifications in database are done like
     * version is updated or database schema is changed
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CREATE_TABLE_STUDENTS); // drop table if exists

        onCreate(db);
    }

    /**
     *
     * This method is used to add students detail in students Table
     *
     * @param student
     * @return
     */

    public long addStudentDetail(StudentsModel student) {
        SQLiteDatabase db = this.getWritableDatabase();

        // Creating content values
        ContentValues values = new ContentValues();
        values.put(KEY_WORD, student.word);
        values.put(KEY_MEANING, student.meaning);
        values.put(KEY_SENTENCE,student.sentence);


        // insert row in students table

        long insert = db.insert(TABLE_STUDENTS, null, values);

        return insert;
    }

    /**
     * This method is used to update particular student entry
     *
     * @param student
     * @return
     */
    public int updateEntry(StudentsModel student) {
        SQLiteDatabase db = this.getWritableDatabase();

        // Creating content values
        ContentValues values = new ContentValues();
        values.put(KEY_WORD, student.word);
        values.put(KEY_MEANING, student.meaning);
        values.put(KEY_SENTENCE,student.sentence);

        // update row in students table base on students.is value
        return db.update(TABLE_STUDENTS, values, KEY_ID + " = ?",
                new String[] { String.valueOf(student.id) });
    }

    /**
     * Used to delete particular student entry
     *
     * @param id
     */
    public void deleteEntry(long id) {

        // delete row in students table based on id
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_STUDENTS, KEY_ID + " = ?",
                new String[] { String.valueOf(id) });
    }

    public void deleteme(String str)
    {

//            String selectQuery = "Delete from students1 where name= " + str;
        SQLiteDatabase db = this.getWritableDatabase();
//            db.execSQL(selectQuery);

        db.delete(TABLE_STUDENTS,KEY_WORD + " = ?",new String[] { String.valueOf(str) }); //most important step was to place the ?, still dont know how it worked :P
        //db.d

    }

    /**
     * Used to get particular student details
     *
     * @param id
     * @return
     */

    public StudentsModel getStudent(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        // SELECT * FROM students WHERE id = ?;
        String selectQuery = "SELECT  * FROM " + TABLE_STUDENTS + " WHERE "
                + KEY_ID + " = " + id;
        Log.d(TAG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        StudentsModel students = new StudentsModel();
        students.id = c.getInt(c.getColumnIndex(KEY_ID));
        students.word = c.getString(c.getColumnIndex(KEY_WORD));
        students.meaning = c.getString(c.getColumnIndex(KEY_MEANING));
        students.sentence=c.getString(c.getColumnIndex(KEY_SENTENCE));

        return students;
    }

    /**
     * Used to get detail of entire database and save in array list of data type
     * StudentsModel
     *
     * @return
     */
    public List<StudentsModel> getAllStudentsList() {
        List<StudentsModel> studentsArrayList = new ArrayList<StudentsModel>();

        String selectQuery = "SELECT  * FROM " + TABLE_STUDENTS;
        Log.d(TAG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {

                StudentsModel students = new StudentsModel();
                students.id = c.getInt(c.getColumnIndex(KEY_ID));
                students.word = c.getString(c
                        .getColumnIndex(KEY_WORD));
                students.meaning = c.getString(c.getColumnIndex(KEY_MEANING));
                students.sentence=c.getString(c.getColumnIndex(KEY_SENTENCE));

                // adding to Students list
                studentsArrayList.add(students);
            } while (c.moveToNext());
        }

        return studentsArrayList;
    }
}