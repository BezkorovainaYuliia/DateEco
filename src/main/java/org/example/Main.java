package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        System.out.println("Datum & Uhrzeit\n" + zonedDateTime);

        Instant instant = zonedDateTime.toInstant();
        System.out.println("Zulu-Zeit\n" + instant);


        ZoneId zoneID = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneID);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneID);
        System.out.println("Datum & Uhrzeit\n" + localDateTime);


        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        Instant convertedInstant = localDateTime.atZone(zoneId).toInstant();
        System.out.println("Zulu-Zeit\n" + convertedInstant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy EEEE");
        String formattedDate = localDateTime.format(formatter);
        System.out.println(formattedDate);

        String time = "12.08.2024 : 11:11:11";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy : HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(time, formatter2);
        System.out.println(localDateTime2);

       LocalDateTime start = LocalDateTime.of(2025, 2, 1, 11,11,11);
        LocalDateTime end = LocalDateTime.of(2025, 3, 1, 11,11,11);
        long diffHours = ChronoUnit.HOURS.between(start, end);
        long diffMinutes = ChronoUnit.MINUTES.between(start, end);
        long diffSeconds = ChronoUnit.SECONDS.between(start, end);
        System.out.println(diffHours);
        System.out.println(diffMinutes);
        System.out.println(diffSeconds);



        /// /////
        ExersicesUhr ex = new ExersicesUhr();
        ex.printAktuelleDarumUndUhrzeit();
        ex.printDatumin2Wochen();
        ex.printDifferenceZwischeDaten(LocalDateTime.of(2025, 7, 13, 0, 0));
        LocalDateTime start1 = LocalDateTime.of(2025, 7, 13, 0, 0);
        LocalDateTime end1 = LocalDateTime.of(2025, 7, 18, 0, 0);
        ex.printUnteschiedZwischenDaten(start1, end1);


    }
    }
