package university.entry.faculty.impl;

import university.entry.faculty.Faculty;
import university.entry.state.State;
import university.entry.subjects.impl.CompoundSubject;
import university.entry.subjects.impl.Lectures;
import university.entry.subjects.impl.Practical;
import university.entry.subjects.visitor.impl.SubjectsVisitor;

public class MedicalFaculty implements Faculty {

    @Override
    public void use(State state) {
        System.out.println("MedicalFaculty used");
        System.out.println(state.toString());
        if(state.isStudy()){
            studying();
            System.out.println("оценка 5");
        }else{
            System.out.println("оценка 2");
        }
        System.out.println("--------------------");
    }

    @Override
    public void studying() {
        System.out.println("MedicalFaculty studying");
        Lectures lectures = new Lectures("medical");
        Practical practical = new Practical("medical");
        CompoundSubject compoundSubject = new CompoundSubject();
        compoundSubject.add(lectures);
        compoundSubject.add(practical);
        export(compoundSubject);
    }
    public static void export(CompoundSubject compoundSubject) {
        SubjectsVisitor subjectsVisitor = new SubjectsVisitor();
        System.out.println(subjectsVisitor.export(compoundSubject));
    }
}
