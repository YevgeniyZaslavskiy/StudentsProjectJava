package university.entry.models;

import university.entry.faculty.Faculty;
import university.entry.state.Context;

//Use pattern builder
public class Student {
    private String name;
    private String lastName;

    private Faculty faculty;

    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private Student() {
    }

    public Faculty getFaculty() {
        return faculty;
    }

    private void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Builder builder() {
        return new Student().new Builder();
    }


    public class Builder {

        public Builder() {
        }

        public Builder name(String name) {
            Student.this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            Student.this.lastName = lastName;
            return this;
        }
        public Builder faculty(Faculty faculty) {
            Student.this.faculty = faculty;
            return this;
        }
        public Builder state(Context state) {
            Student.this.context = state;
            return this;
        }
        public Student build() {
            return Student.this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
