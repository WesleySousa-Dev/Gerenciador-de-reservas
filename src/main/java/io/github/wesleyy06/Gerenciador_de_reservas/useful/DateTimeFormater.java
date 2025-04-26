package io.github.wesleyy06.Gerenciador_de_reservas.useful;

import java.text.ParseException;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormater {

    public static LocalTime dateTimerFormater(String _dateTime){

        LocalTime hour = null;
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            hour = LocalTime.parse(_dateTime, formatter);
        }
        catch (Exception e) {
            throw  new RuntimeException(e.getMessage());
        }
        return hour;
    }
}
