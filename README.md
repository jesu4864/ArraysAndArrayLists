## Arrays and Array Lists

In Java, an array is a collection of elements. These elements all share a common trait, that being that they are of the same type. Arrays are distinguishable from lists or ArrayLists, due in part to their size. An array's size is determined upon its creation, and from there during run-time is unchanging. Functionally, arrays are touted for being an efficient runtime access to elements. enabling retrieval and manipulation (during execution) of data. Overall, an array acts as a way to store elements, while also providing a means to access them during run-time.

An ArrayList is a more complex form of array, in the sense that it can be dynamic. It still retains the overall function of an array, that is: storing elements of the same type. But, what makes it different is that ArrayList allows for on-the-go resizing, with elements able to be dropped or added during runtime.

ArrayLists may seem like the perfect tool to an initial user, possibly even begging the question: how can arrays be relevant? ArrayLists have a larger overhead, due in part to the memory requirements that allow for its dynamic ability. More importantly, performance impacts can be felt when manipulating entries at the start or middle of the ArrayList, as items will then be forced to shift.
  
__*To make this a more bite-size compare and contrast:*__  

**Size:**  
Arrays are fixed, with size being given when created  
ArrayLists' sizes can change on the fly, during runtime  
**Form:**  
Arrays are linear data structures  
ArrayLists are a class belonging to the Collection framework  
**Creation:**  
Array: <type>[] name = new <type>[size];  
ArrayList: ArrayList<type> name = new ArrayList<type>();  
**Supported Data:**  
Arrays support primitive data types (int[], double[], char[], boolean[], byte[], short[], long[], and float[]) and objects (Object[], String[], and custom classes)  
ArrayLists support only objects, but of any class (ArrayList<String>, ArrayList<Integer>, ArrayList<Double>, ArrayList<Character>, ArrayList<Boolean>, and even custom classes)  

## Difference-Arrays-ArrayLists

This project demonstrates the differences between arrays and ArrayLists in Java. It includes basic examples for arrays, ArrayLists, and a simple class called `Person` that can be used with ArrayList.

## Array Example

The `ArraysExample` class showcases the basic usage of arrays in Java. It declares an array of integers, initializes it, and prints the elements along with the array's size.

## ArrayListExample

The `ArrayListExample` class demonstrates the usage of ArrayLists in Java. It creates an ArrayList of integers, adds elements, and prints the elements along with the ArrayList's size.
I've also included an ArrayList using a custom object, called `PersonList`. This was just to demonstrate the usage of an ArrayList with a unique object, and hopefully inspire others' future usage.
