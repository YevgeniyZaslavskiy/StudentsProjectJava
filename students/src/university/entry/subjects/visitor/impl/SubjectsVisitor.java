package university.entry.subjects.visitor.impl;

import university.entry.subjects.Subjects;
import university.entry.subjects.impl.CompoundSubject;
import university.entry.subjects.impl.Lectures;
import university.entry.subjects.impl.Practical;
import university.entry.subjects.visitor.Visitor;

public class SubjectsVisitor implements Visitor {
    @Override
    public String visitPractical(Practical practical) {
        return practical.printSubjects();
    }

    @Override
    public String visitLectures(Lectures lectures) {
        return lectures.printSubjects();
    }

    @Override
    public String visitCompoundSubject(CompoundSubject compoundSubject) {
        return compoundSubject.printSubjects() + _visitCompoundSubject(compoundSubject);
    }

    private String _visitCompoundSubject(CompoundSubject compoundSubject) {
        StringBuilder sb = new StringBuilder();
        for (Subjects subjects : compoundSubject.children) {
            String obj = subjects.accept(this);
            obj = " " + obj;
            sb.append(obj);
        }
        return sb.toString();
    }

    public String export(Subjects... args) {
        StringBuilder sb = new StringBuilder();
        for (Subjects subjects : args) {
            sb.append(subjects.accept(this));
        }
        return sb.toString();
    }
}
