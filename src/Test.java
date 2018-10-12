import java.util.Scanner;

public class Test {

    static String readName(Scanner scanner){
        while (true){
            System.out.println("Podaj imię");
            String firstName = scanner.nextLine();
            try {
                Person.firstNameCorrect(firstName);
                System.out.println("Twoje imię to " + firstName);
                return firstName;
            } catch (NameUndefinedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    static  String readLastName (Scanner scanner){
        while (true) {
            System.out.println("Podaj nazwisko");
            String lastName = scanner.nextLine();
            try {
                Person.lastNameCorrect(lastName);
                System.out.println("Twoje nazwisko to " + lastName);
                return lastName;
            } catch (NameUndefinedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static  int readAge (Scanner scanner){
        while (true) {
            System.out.println("Podaj wiek");
            int age = scanner.nextInt();
            try {
                Person.ageCorrect(age);
                System.out.println("Twój wiek to " + age);
                return age;
            } catch (IncorrectAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner scanner = new Scanner(System.in);

        String name = readName(scanner);
        person1.setFirstName(name);

        String lastName = readLastName(scanner);
        person1.setLastName(lastName);


        int age = readAge(scanner);
        person1.setAge(age);

        System.out.println(person1);
    }
}
