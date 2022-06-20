package java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HW {
    public static List<Student> getStudents(){
        Course course1 = new Course("Основы ручного тестирования");
        Course course2 = new Course("Основы тест-аналитики");
        Course course3 = new Course("Linux. Рабочая станция");
        Course course4 = new Course("HTML/CSS для тестировщиков");
        Course course5 = new Course("Тестирование веб-приложений");
        Course course6 = new Course("Java. Уровень 1");
        Course course7 = new Course("Java Core для тестировщиков");

        Student student1 = new Student("Kate", Arrays.asList(course1));
        Student student2 = new Student("Nik", Arrays.asList(course1, course2));
        Student student3 = new Student("Olga", Arrays.asList(course1, course2, course3));
        Student student4 = new Student("Den", Arrays.asList(course1, course6));
        Student student5 = new Student("Irina", Arrays.asList(course1, course5,course4,course6));
        Student student6 = new Student("Alex", Arrays.asList(course7));
        Student student7 = new Student("Sonya", Arrays.asList(course5));

        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7);
    }
    public static Course getRandomCourse(){
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }
    private static List<Course> getListCourses(){
        return Arrays.asList(new Course("Основы ручного тестирования"),
                new Course("Основы тест-аналитики"),
                new Course("Linux. Рабочая станция"),
                new Course("HTML/CSS для тестировщиков"),
                new Course("Тестирование веб-приложений"),
                new Course("Java. Уровень 1"),
                new Course("Java Core для тестировщиков"));
    }
}
