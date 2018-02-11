package org.wordlist.navneet.wordapplication;

/**
 * Created by Navneet on 7/14/2015.
 */
public class StudentsModel {

    public int id;
    public String word;
    public String meaning;
    public String sentence;

    public StudentsModel(int id, String word, String meaning,String sentence) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.word = word;
        this.meaning = meaning;
        this.sentence=sentence;
    }
    public StudentsModel(){

    }
}
