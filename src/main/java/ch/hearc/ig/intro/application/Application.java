package ch.hearc.ig.intro.application;

import ch.hearc.ig.intro.business.Class;
import ch.hearc.ig.intro.business.Student;
import ch.hearc.ig.intro.presentation.ClassConsole;

public class Application {

    private final String GOAL = "Gestion scolaire";

    public Application() {

    }

    public static void main(String[] args) {

        new Application().run();

    }

    private void run() {

        System.out.println(GOAL);
        var myClass = new Class("ig_tpart");
        myClass.addStudent(new Student(
                1,
                "Toto",
                "Tutu",
                23,
                true,
                "Homme")
        );

        new ClassConsole().print(myClass);

    }

}
