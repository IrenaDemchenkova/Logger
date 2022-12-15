package ru.IrenDemchenkova;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    protected int num = 1;
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' hh:mm:ss a zzz ");

    private Logger () {
    }

    public void log (String msg) {
        System.out.println("[" +formatForDateNow.format(dateNow)+ num++ + "] " + msg);
    }

    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();
        return instance;

    }
}
