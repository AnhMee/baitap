package OOP;

public class Student {
    private String masv;
    private String name;
    private int age;

    public Student(String name, int age, String masv) {
        this.name = name;
        this.age = age;
        this.masv = masv;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getYearOfBirth(){
        java.time.Year year = java.time.Year.now();
        return year.getValue() - age;
    }

    public String getFullName(){
        return name.toUpperCase();
    }
}
