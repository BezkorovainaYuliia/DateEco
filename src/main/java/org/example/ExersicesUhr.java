package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExersicesUhr {

    public void printAktuelleDarumUndUhrzeit(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(formatter);
        System.out.println(format);
    }

    public void printDatumin2Wochen(){
        LocalDateTime now = LocalDateTime.now();
        now = now.plusDays(14);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = now.format(formatter);
        System.out.println(format);
    }

    public void printDifferenceZwischeDaten(LocalDateTime dateTime){
        //actual
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String nowFormat = now.format(formatter);
        String dateFormat = dateTime.format(formatter);
        System.out.println(nowFormat);
        System.out.println(dateFormat);
        long diffTage = ChronoUnit.DAYS.between(now, dateTime);
        if(diffTage > 0){
            System.out.println("das aktuelle Datum liegt nach dem angegebenen Datum");
        }
        if(diffTage < 0){
            System.out.println("das aktuelle Datum liegt vor dem angegebenen Datum");
        }
        if(diffTage == 0){
            System.out.println("Es gibt kein Unterschied. Das ist heute");
        }

    }

    public void printUnteschiedZwischenDaten(LocalDateTime start, LocalDateTime end){
        long diffTage = ChronoUnit.DAYS.between(start, end);
        System.out.println(diffTage);
    }
}
