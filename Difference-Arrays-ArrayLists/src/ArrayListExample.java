import java.util.ArrayList;

public class ArrayListExample {


    public static void main(String[] args) {
        //Creating an ArrayList, note we don't have to specify size unlike with our array
        //Also note the way the class type is implemented, as opposed to the primitive types are implemented to arrays.
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // Declare an ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        //There is no set size, so unlike an array, we can continue to increase additional elements with no issue.
        //We can also use custom objects when creating our ArrayList, as such:

        // Creating an ArrayList of Person objects
        ArrayList<Person> personList = new ArrayList<Person>();

        // Adding Person objects to the ArrayList
        personList.add(new Person("John", 25));
        personList.add(new Person("Jane", 30));
        personList.add(new Person("Bob", 22));

        // Printing the elements in the ArrayList
        for (Person person : personList) {
            System.out.println(person);
            // Print elements and size
            System.out.println("ArrayList Elements:");
            for (int i : arrayList) {
                System.out.print(i + " ");
            }
            System.out.println("\nArrayList Size: " + arrayList.size());
        }
    }
}
