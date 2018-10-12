public class Person {
    private String firstName;
    private String lastName;
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
        this.age = age;
    }


    static void firstNameCorrect(String firstName)  {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException();
        }
    }

    static void lastNameCorrect(String lastName)  {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
    }

    static void ageCorrect(int age)  {
        if (age <= 1) {
            throw new IncorrectAgeException();

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
