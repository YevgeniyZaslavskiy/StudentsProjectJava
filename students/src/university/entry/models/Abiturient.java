package university.entry.models;

import university.entry.faculty.factory.FacultyDistributor;
import university.entry.state.Context;

import static university.entry.models.Student.builder;

public class Abiturient {
    public String name;
    public String lastName;
    public FacultyDistributor facultyDistributor;

    public Abiturient(String name, String lastName, FacultyDistributor facultyDistributor) {
        this.name = name;
        this.lastName = lastName;
        this.facultyDistributor = facultyDistributor;
    }

    public Student toStudent() {
        return builder().name(name).lastName(lastName).faculty(facultyDistributor.distribute()).state(new Context()).build();
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
