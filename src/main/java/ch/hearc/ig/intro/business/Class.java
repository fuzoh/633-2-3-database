package ch.hearc.ig.intro.business;

import java.util.ArrayList;
import java.util.Objects;

public class Class {

    private String code;

    private final ArrayList<Student> students = new ArrayList<>();

    public Class() {

    }

    public Class(String code) {

        this.code = code;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public void addStudent(Student student) {

        Objects.requireNonNull(student);
        this.students.add(student);
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

}
