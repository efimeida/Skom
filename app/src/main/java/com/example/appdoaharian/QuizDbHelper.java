package com.example.appdoaharian;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.appdoaharian.Quiz_Contract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Database_Quiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase sqLiteDatabase;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        this.sqLiteDatabase = sqLiteDatabase;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE "+
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        sqLiteDatabase.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    private void fillQuestionsTable(){
        Question q1 = new Question("Sebelum makan sebaiknya ?", "Berdoa", "Berkumur", "Berbaris", "Bernyanyi",1);
        addQuestion(q1);
        Question q2 = new Question("Makan sebaiknya menggunakan tangan ?", "Kiri", "Kanan", "Kiri dan Kanan", "Disuapin Ibu",2);
        addQuestion(q2);
        Question q3 = new Question("Bahasa inggrisnya 'Berdoa' adalah ", "Eat", "Sleep", "Pray", "Angry",3);
        addQuestion(q3);
        Question q4 = new Question("Hasil dari 2 + 4 = ", "6", "5", "4", "3",1);
        addQuestion(q4);
        Question q5 = new Question("Makan dan minum sebaiknya sambil ?", "Berdiri", "Duduk", "Bergurau", "Berbaring",2);
        addQuestion(q5);
        Question q6 = new Question("Kitab suci umat Islam yaitu ?", "Injil", "Al-Quran", "Zabur", "Taurat",2);
        addQuestion(q6);
        Question q7 = new Question("Kitab Al-Quran diturunkan kepada Nabi ?", "Nabi Muhammad", "Nabi Musa", "Nabi Isa", "Nabi Daud",1);
        addQuestion(q7);
        Question q8 = new Question("Bahasa Inggrisnya 'Makan' adalah ?", "Sleep", "Home", "School", "Eat",4);
        addQuestion(q8);
        Question q9 = new Question("Masuk Kamar Mandi / Toilet hendaknya mendahulukan kaki ?", "Kanan dan Kiri", "Kanan", "Kiri", "Semuanya benar",3);
        addQuestion(q9);
        Question q10 = new Question("Masuk Masjid hendaknya mendahulukan kaki ?", "Kanan dan Kiri", "Kanan", "Kiri", "Semuanya benar",2);
        addQuestion(q10);
    }
    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        sqLiteDatabase.insert(QuestionsTable.TABLE_NAME,null, cv);
    }

    public List<Question> getAllQuestions(){
        List<Question> questionList = new ArrayList<>();
        sqLiteDatabase = getReadableDatabase();
        Cursor c = sqLiteDatabase.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()){
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            }while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
