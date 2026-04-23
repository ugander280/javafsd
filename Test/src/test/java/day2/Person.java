package day2;

public class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;
    private double weight;

    // Default constructor
    public Person() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.gender = 'U';
        this.age = 0;
        this.weight = 0.0;
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, char gender, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    // Getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    // Display method
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("_____________________");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}
