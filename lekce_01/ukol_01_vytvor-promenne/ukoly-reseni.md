```java
package com.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // 1. Jméno klienta &mdash; budeme ukládat jména a&nbsp;příjmení klientů
        String customerName;

        // 2. Počet nákupů &mdash; kolik zákazníků si koupilo tento výrobek
        int numberOfPurchases;

        // 3. Název města, kde firma sídlí.
        String city;

        // 4. Spotřeba vozidla v&nbsp;litrech na 100&nbsp;km.
        double vehicleConsumption;
        // ... Určitě bude dostačovat také rozsah `float`

        // 5. Množství kabelů &mdash; délka UTP kabelu na skladě v&nbsp;metrech.
        int cableQuantityMeters;
        // ... ale lze také:
        double cableQuantity; // Pokud chci ukládat i desetinnou část.

        // 6. Datum narození klienta.
        LocalDate birthDate;

        // 7. Registrační značka vozidla.
        String registrationPlateNumber;
        // Ale jsou zde další pravidla, která je třeba dodržet. Je to tedy kandidát na novou třídu,
        //  která tato pravidla zahrne (viz další hodiny).

        // 8. Rodné číslo klienta.
        // Zde můžeme zvážit:
        String birthCertificateNumber;
        // nebo:
        byte[] birthCertificateNumberAsArray;
        // nebo také:
        long birthCertificateNumberWithoutSlash = 7569214586l;
        // ... všimněte si, že za číslem musí následovat písmenko 'l' - číselné literály jsou
        // ... automaticky typu `int` a pro ten je tato hodnota příliš velká.
        // Volba záleží na tom, jaké operace s rodným číslem budeme provádět.
        // Ale jsou zde další pravidla, která je třeba dodržet. Je to tedy kandidát na novou třídu,
        //  která tato pravidla zahrne (viz další hodiny).
    }
}

```