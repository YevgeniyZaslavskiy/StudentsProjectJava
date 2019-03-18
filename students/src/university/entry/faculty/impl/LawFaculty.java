package university.entry.faculty.impl;

import university.entry.faculty.Faculty;
import university.entry.state.State;
import university.entry.subjects.impl.CompoundSubject;
import university.entry.subjects.impl.Lectures;
import university.entry.subjects.impl.Practical;
import university.entry.subjects.visitor.impl.SubjectsVisitor;

public class LawFaculty implements Faculty {
    @Override
    public void use(State state) {
        System.out.println("LawFaculty used");
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
        System.out.println("LawFaculty studying");
        Lectures lectures = new Lectures("law");
        Practical practical = new Practical("law");
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
