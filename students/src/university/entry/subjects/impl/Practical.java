package university.entry.subjects.impl;

import university.entry.subjects.Subjects;
import university.entry.subjects.visitor.Visitor;

public class Practical implements Subjects {
    private final String subjects;

    public Practical(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String printSubjects() {
        return "[visit " + subjects + " practical]";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitPractical(this);
    }
}
