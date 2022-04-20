    /**
        * Consider a Teacher Object can be created from A Person Class.
        */
public class Teacher {
    public static void main(String[] args) {
    /**
        * Create a Teacher object from the Person Class
        * Print the Name, age, and address
        */

        // Create an object of Person
        Person person = new Person();

        // Set values of private variables
        person.setName("Ashton Cox");
        person.setAge(47);
        person.setAddress("Roseville NH 11523");

        // Get values of private variables
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
    }
}