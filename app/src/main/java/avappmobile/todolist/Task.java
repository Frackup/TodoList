package avappmobile.todolist;

import android.text.format.Time;

import java.util.Date;

/**
 * Created by Alexandre on 15/02/2015.
 */
public class Task {

    private String _title;
    private Date _date;
    private Time _time;

    public Task(String title, Date date, Time time) {
        _title = title;
        _date = date;
        _time = time;
    }

    public String getTitle(){
        return _title;
    }

    public Date getDate(){
        return _date;
    }

    public Time getTime() {
        return _time;
    }
}
