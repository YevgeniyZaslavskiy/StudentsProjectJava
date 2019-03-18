package university.entry.subjects.visitor;

import university.entry.subjects.impl.CompoundSubject;
import university.entry.subjects.impl.Lectures;
import university.entry.subjects.impl.Practical;

public interface Visitor {
    String visitPractical(Practical practical);

    String visitLectures(Lectures lectures);

    String visitCompoundSubject(CompoundSubject compoundSubject);
}
