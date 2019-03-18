package university.entry.faculty.factory;

import university.entry.faculty.Faculty;

public abstract class FacultyDistributor {
    public Faculty distribute() {
        Faculty faculty = createFaculty();
       // faculty.use();
        return faculty;
    }

    public abstract Faculty createFaculty();
}
