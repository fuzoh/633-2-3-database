package ch.hearc.ig.intro.business;

public class Student {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private boolean maried;

    private String sex;

    public Student(int id, String firstName, String lastName, int age, boolean maried, String sex) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.maried = maried;
        this.sex = sex;
    }

    public Student() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public boolean isMaried() {

        return maried;
    }

    public String isMariedInFrench() {
        return maried ? "Oui" : "Non";
    }

    public void setMaried(boolean maried) {

        this.maried = maried;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    @Override
    public String toString() {

        return "Etudiant numéro : " + getId() + System.lineSeparator() +
                "Prénom : " + getFirstName() + System.lineSeparator() +
                "Nom : " + getLastName() + System.lineSeparator() +
                "Age : " + getAge() +System.lineSeparator() +
                "Marié : " + isMariedInFrench() + System.lineSeparator() +
                "Sexe : " + getSex() + System.lineSeparator();
    }

}
