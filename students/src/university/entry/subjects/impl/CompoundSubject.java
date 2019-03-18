package university.entry.subjects.impl;

import university.entry.subjects.Subjects;
import university.entry.subjects.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundSubject implements Subjects {
    public List<Subjects> children = new ArrayList<>();

    @Override
    public String printSubjects() {
        return "Student visits subjects: ";
        //throw new UnsupportedOperationException();
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundSubject(this);
    }

    public void add(Subjects subjects) {
        children.add(subjects);
    }
}
