package OOP2;

import OOP.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("nguyen the phuong nam", 18, "112233");
        System.out.println(student);
        System.out.println(student.getFullName());
        System.out.println(student.getYearOfBirth());


    }
}
