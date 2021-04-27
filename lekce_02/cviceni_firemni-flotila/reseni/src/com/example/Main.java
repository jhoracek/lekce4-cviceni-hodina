package com.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> listOfCars = new ArrayList<>();
        ArrayList<Mission> listOfMissions = new ArrayList<>();

        listOfCars.add(new Car("Škoda", "3Z1 52 13", LocalDate.of(2021, 5, 12)));
        listOfCars.add(new Car("Škoda", "3Z1 52 14", LocalDate.of(2021, 4, 15)));
        listOfCars.add(new Car("Škoda", "3Z1 52 14", LocalDate.of(2021, 4, 15)));

        listOfMissions.add(new Mission(listOfCars.get(0), 325, 325/100*6.5));
        listOfMissions.add(new Mission(listOfCars.get(1), 215, 215/100*6.45));
        listOfMissions.add(new Mission(listOfCars.get(0), 421, 421/100*5.84));
    }
}
