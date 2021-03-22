package ch.hearc.ig.intro.business;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Class {

    private final ArrayList<Student> students = new ArrayList<>();

    private String code;

    public Class() {

    }

    public Class(String code) {

        this.code = code;
    }

    @Override
    public String toString() {

        return "Code de la classe : " + code + System.lineSeparator()
                + "Les étudiants : " + System.lineSeparator() +
                students.stream()
                        .map(Objects::toString)
                        .collect(Collectors.joining(System.lineSeparator()));
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
