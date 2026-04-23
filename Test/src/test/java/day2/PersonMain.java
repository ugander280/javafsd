package day2;

public class PersonMain {
    public static void main(String[] args) {
        // Using parameterized constructor
        Person p1 = new Person("Divya", "Bharathi", 'F', 20, 85.55);
        p1.displayDetails();

        // Using default constructor + setters
        Person p2 = new Person();
        p2.setFirstName("Ugander");
        p2.setLastName("Reddy");
        p2.setGender('M');
        p2.setAge(25);
        p2.setWeight(70.5);
        p2.displayDetails();
    }
}
