package za.ac.cput.covid19tracker;

/**
 * @author Ruphin Bolonda
 * Student Number : 218321392.
 * Description : Model Class used in my Covid19Tracker App
 */

public class Student {
    private String name;
    private String surname;
    private String studentNumber;
    private String email;
    private int age;
    private boolean infected;


    public Student(String name, String surname, String studentNumber, String email, int age, boolean infected) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        this.email = email;
        this.age = age;
        this.infected = infected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }
}
