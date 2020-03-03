package oop.Student;

import java.time.LocalDate;

public class StudentRunner {
    public static void main(String[] args) {
        Students students = createStudents();

        Students studentsFromFICS = students.findByFaculty("FICS");
        System.out.println("Students from FICS: " + studentsFromFICS);

        Students studentsFromCourse4 = students.findByCourse(4);
        System.out.println("Students from course 4: " + studentsFromCourse4);

        Students studentByBirthDate = students.findByBirthDate(LocalDate.of(1994, 10, 10));
        System.out.println("Student by birth date: " + studentByBirthDate);
    }

    private static Students createStudents() {
        Student john = new Student("John", "Smith");
        john.setAddress("John's Address");
        john.setPhoneNumber("+38 (095) 111-11-11");
        john.setBirthDate(LocalDate.of(1995, 1, 20));
        john.setFaculty("FICS");
        john.setCourse(4);
        john.setGroup(3);

        Student bob = new Student("Bob", "Huston");
        bob.setAddress("Bob's Address");
        bob.setPhoneNumber("+38 (065) 222-22-22");
        bob.setBirthDate(LocalDate.of(1993, 5, 2));
        bob.setFaculty("ACTS");
        bob.setCourse(4);
        bob.setGroup(5);

        Students students = new Students();
        students.add(john);
        students.add(bob);

        return students;
    }
}
