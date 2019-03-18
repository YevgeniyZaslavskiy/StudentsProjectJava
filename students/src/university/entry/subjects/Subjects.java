package university.entry.subjects;

import university.entry.subjects.visitor.Visitor;

public interface Subjects {
    String printSubjects();
    String accept(Visitor visitor);
}
