package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Smith"));
        list.add(new Teacher("María", "Montessori", "Educación"));
        list.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        list.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        return list;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList) {
            person.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
