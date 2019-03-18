package university.entry.subjects.impl;

import university.entry.subjects.Subjects;
import university.entry.subjects.visitor.Visitor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lectures implements Subjects {
    private final String subjects;
    private final Map<String,List<String>> lecture;

    public Lectures(String subjects) {
        this.subjects = subjects;
        this.lecture = new HashMap(){{
            put("law",Arrays.asList("профессор: Маркеев П.H."));
            put("medical",Arrays.asList("профессор: Авдеев С.H."));
        }};
    }

    @Override
    public String printSubjects() {
        return "[visit " + subjects + " lectures "+lecture.get(subjects).toString()+"]";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitLectures(this);
    }
}
