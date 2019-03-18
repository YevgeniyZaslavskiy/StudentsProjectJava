package university.entry.models;

import university.entry.faculty.Faculty;
import university.entry.state.State;
import university.entry.state.impl.StartStudyState;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    private final List<Abiturient> abiturients = new ArrayList<>();

    public void addAbiturientToUniversity(Abiturient student){
        abiturients.add(student);
    }

    public void distributeStudentByFaculty(){
        List<Student>students =abiturients.stream().map(Abiturient::toStudent).collect(Collectors.toList());
        students.stream().forEach(student ->setStudentState(student, new StartStudyState()) );
        students.stream().forEach(student -> {
            Faculty faculty = student.getFaculty();
            System.out.println(student);
            faculty.use(student.getContext().getState());
        });

    }
    public void setStudentState(Student student, State state){
        state.doAction(student.getContext());
    }
    public void printStudent(Student student){
        System.out.println(student);
    }
}
