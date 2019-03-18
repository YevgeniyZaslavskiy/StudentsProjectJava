package university.entry.faculty.factory.impl;

import university.entry.faculty.factory.FacultyDistributor;
import university.entry.faculty.Faculty;
import university.entry.faculty.impl.MedicalFaculty;

public class MedicalDistributor extends FacultyDistributor {
    @Override
    public Faculty createFaculty() {
        return new MedicalFaculty();
    }
}
