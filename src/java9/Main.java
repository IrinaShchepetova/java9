package java9;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = HW.getStudents();
        Course course = HW.getRandomCourse();
        System.out.println(getUnicCourse(students));
        System.out.println(inquisitiveStudents(students));
        System.out.println(getStudentsCourse(students, course));
    }
    public static List<Course> getUnicCourse(List<Student> students){
        return students.stream()
                .flatMap(student -> student.getCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }
    public static List<Student> getStudentsCourse(List<Student> students, Course course){
        System.out.println("Студенты, проходящие курс "+course);
        return students.stream()
                .filter(student -> student.getCourses().contains(course))
                .collect(Collectors.toList());
    }
    public static List<Student> inquisitiveStudents (List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> (s2.getCourses().size()) - (s1.getCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
    }
}
