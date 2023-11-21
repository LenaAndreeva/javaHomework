package school.lesson9.Task4;
import java.util.*;

public class StudentsDataProcessor {

    public static double findAvgAgeOfMaleStudents(Collection<StudentsList.Student> students) {
        return students.stream()
                .filter(student -> student.getGender() == StudentsList.Gender.MAN)
                .mapToInt(StudentsList.Student::getAge)
                .average()
                .orElse(0);
    }

    public static void findStudentsReceivingTheSummons(Collection<StudentsList.Student> students) {
        students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .filter(student -> student.getGender() == StudentsList.Gender.MAN)
                .forEach(student -> {
                    System.out.println("The following students will receive the summons: " + student.toString());
                });
    }
}
