package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

@Data
@NoArgsConstructor
public class Animal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Miura";
        animal.dateBirth = LocalDate.of(2020, 7, 17);
        System.out.println(animal);
       animal.zumNaecstenGeburstag();

    }

    String name;
    LocalDate  dateBirth;

    public void zumNaecstenGeburstag(){
        MonthDay geburtstag = MonthDay.of(dateBirth.getMonth(), dateBirth.getDayOfMonth());
        LocalDate naechsterGeburtstag = geburtstag.atYear(LocalDate.now().getYear());
        if (!naechsterGeburtstag.isAfter(LocalDate.now())) {
            naechsterGeburtstag = naechsterGeburtstag.plusYears(1);
        }


        long tageBisGeburtstag = ChronoUnit.DAYS.between(LocalDate.now(), naechsterGeburtstag);


        System.out.println("Noch " + tageBisGeburtstag + " Tage bis zum nächsten Geburtstag des Tieres.");
    }
}
