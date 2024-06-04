package de.neuefische;

public class Main {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Max", "1", 15);
        //Feld auslesen in Klasse
        studentClass.getAge();

        //Felder beschreiben in Klasse
        studentClass.setAge(34);

        StudentRecord studentRecord = new StudentRecord("Maxi", "5", 21);
        //Feld auslesen im Record
        studentRecord.age();

        //Felder beschreiben im Record -> nicht möglich weil:
        //Record macht jedes Feld private final -> immutability
        studentRecord = new StudentRecord(studentRecord.name(), studentRecord.id(), 33);

        System.out.println(studentRecord);
    }
}