package university.entry.faculty.factory.impl;

import university.entry.faculty.Faculty;
import university.entry.faculty.factory.FacultyDistributor;
import university.entry.faculty.impl.LawFaculty;

public class LawDistributor extends FacultyDistributor {

    @Override
    public Faculty createFaculty() {
        return new LawFaculty();
    }
}
