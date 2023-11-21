package school.lesson9.Task4;
import java.util.*;
public class StudentsList {

    Collection<Student> students = Arrays.asList(
            new Student("Dmitriy", 17, Gender.MAN),
            new Student("Maksim", 20, Gender.MAN),
            new Student("Ekaterina", 20, Gender.WOMAN),
            new Student("Mikhail", 28, Gender.MAN)
    );

    public enum Gender {
        MAN,
        WOMAN
    }

    public static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        public int hashCode() {
            return Objects.hash(name, age, gender);
        }

    }
}
