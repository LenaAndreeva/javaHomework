package school.lesson9.Task4;

public class Main {
    public static void main(String[] args) {

        StudentsList studentsList = new StudentsList();

        double averageAgeOfMaleStudents = StudentsDataProcessor.findAvgAgeOfMaleStudents(studentsList.students);
        System.out.println("Average age of male students: " + averageAgeOfMaleStudents);

        StudentsDataProcessor.findStudentsReceivingTheSummons(studentsList.students);

    }
}
