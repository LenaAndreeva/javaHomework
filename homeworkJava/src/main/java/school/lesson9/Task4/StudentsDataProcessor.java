package school.lesson9.Task4;
import java.util.*;

public class StudentsDataProcessor {

    public static double findAvgAgeOfMaleStudents(Collection<StudentsList.Student> students) {
        return students.stream()
                .filter(s -> s.getGender() == StudentsList.Gender.MAN)
                .mapToInt(StudentsList.Student::getAge)
                .average()
                .orElse(0);
    }

    public static void findStudentsReceivingTheSummons(Collection<StudentsList.Student> students) {
        students.stream()
                .filter(s -> s.getAge() >= 18 && s.getAge() <= 27)
                .filter(s -> s.getGender() == StudentsList.Gender.MAN)
                .forEach(s -> {
                    System.out.println("The following students will receive the summons: " + s.toString());
                });
    }
}
