package labWork_2_11_3;

/**
 * Created by Bulik on 06.08.2016.
 */
public class Person {
    private String firstName, lastName;
    private int age;

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
        if (age < 1 || age > 120 ){
            throw new InvalidAgeException();
        }
        this.age = age;
    }
}
