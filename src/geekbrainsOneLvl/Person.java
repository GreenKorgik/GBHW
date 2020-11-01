package geekbrainsOneLvl;
//
public class Person {
    private String lastName;
    private String name;
    private String middleName;
    private int age;

    public Person(String lastName, String name, String middleName, int age) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
    }
    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age= '" + age;
    }
}
