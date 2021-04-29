package com.example;

import java.time.LocalDate;

public class MaturitaResult {
    String name;
    String surname;
    LocalDate birthdate;
    char schoolClass;
    int[] results;

    public MaturitaResult(String name, String surname, LocalDate birthdate, char schoolClass, int subject1, int subject2, int subject3, int subject4) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.schoolClass = schoolClass;
        setResults(subject1, subject2, subject3, subject4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public char getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(char schoolClass) {
        this.schoolClass = schoolClass;
    }

    public String getDescription() {
        return name +" "+ surname+" (4."+schoolClass+")";
    }


    public String getResults() {
        String studentResults = "";
        for (int subject : results) {
            studentResults += subject + ", ";
        }
        return studentResults;
    }

    public final void setResults(int subject1, int subject2, int subject3, int subject4) {
        this.results = new int[]{subject1, subject2, subject3, subject4};
    }

    public boolean isSuccessful() {
        boolean result = false;
        for (int subject : results) {
            result = result && subject < 5 && subject > 0;
        }
        return result;
    }
}
