package com.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        MaturitaResult student1 =
                new MaturitaResult("Karel", "Vavřík",
                        LocalDate.of(2005, 10, 15),
                        'A',
                        1, 3, 4, 2
                    );
        System.out.print("Žák(yně): ");
        System.out.print(student1.getDescription());
        System.out.print(" absolvoval(a) maturitu ");
        if (student1.isSuccessful()) {
            System.out.print("úspěšně");
        } else {
            System.out.print("neúspěšně");
        }
        System.out.print(" s výsledky: ");
        System.out.println(student1.getResults());
        System.out.println();
    }
}
