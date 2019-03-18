
import university.entry.faculty.factory.impl.LawDistributor;
import university.entry.faculty.factory.impl.MedicalDistributor;
import university.entry.models.Abiturient;
import university.entry.models.University;

public class Entry {
    public  static void main(String[] args){

        University university = new University();
        university.addAbiturientToUniversity(new Abiturient("Владимир", "Петров",new LawDistributor()));
        university.addAbiturientToUniversity(new Abiturient("Владимир", "Иванов",new MedicalDistributor()));

        university.distributeStudentByFaculty();

}}