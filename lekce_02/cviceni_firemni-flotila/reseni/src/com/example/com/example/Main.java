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

        listOfMissions.add(new Mission(listOfCars.get(0), "Praha", LocalDate.of(2021, 5, 14), 325, 325 / 100 * 6.5));
        listOfMissions.add(new Mission(listOfCars.get(1), "Brno", LocalDate.of(2021, 5, 14), 215, 215 / 100 * 6.45));
        listOfMissions.add(new Mission(listOfCars.get(0), "Ostrava", LocalDate.of(2021, 5, 14), 421, 421 / 100 * 5.84));

        //  Vypisme pracovni cesty s delkou pres 300 km:
        for (Mission mission : listOfMissions) {
            int missionDistance = mission.getDistance();
            if (missionDistance > 300) {
                System.out.println(mission.getDescription() + " (" + missionDistance + " km)");
            } else if (missionDistance == 215) {
                // Porovnani cisel ... je rovno ... se zapise dvojitym rovnitkem : ==
                System.out.println(mission.getDescription() + " (presne 215 km)");
            }
        }

//        Porovnani textu ... dela se pres metodu: equals ... stejne tak i u ostatnich wrappovanych typu
        String target = "Brno";
        if (target.equals("Brno")) {
            System.out.println("Zajed si i do Engeta! ;)");
        }
        Car car1 = new Car("Skoda", "3Z1 52 13", LocalDate.of(2021, 5, 21));
        System.out.println(car1.getDescription() + " pouziva palivo " + car1.getFuelType().toString());


        Integer value = 0;
        switch (value) {
            case 0:
                System.out.println("Nula");
                break;
            case 1:
                System.out.println("Jedna");
                break;
            case 11:
                System.out.println("Eso");
                break;  // NESMIM ZAPOMINAT !!! na break, ale od Javy 12 uz muzu pouzit elegantnejsi zapis
            default:
                System.out.println("Neco jineho!");
        }

        // zkusit si to prepsat do noveho Switch Expression - 12kove pohodlnejsi syntaxe
        // case neco -> neco;  ...  a neni nutne psat uz ty breaky
    }
}


