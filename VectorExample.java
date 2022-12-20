

package collections;


import java.util.Collections;
import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        System.out.println("Size : " + vec.size());              // Calculatiing a size
        System.out.println("Default Capacity : " + vec.capacity());          // default capacity size is 10
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Leobord");
        vec.add("Cheetah");
        System.out.println(vec);         // Added the element Method of list
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");
        System.out.println("Before Sorted : " + vec);         // AddElement the element method vector
        Collections.sort(vec);
        System.out.println("After sorted " + vec);             // Sorting the element

        System.out.println("---------------Example 2--------------------");
        Vector<String> vec1 = new Vector<>(4);
        vec1.add("Tiger");
        vec1.add("Lion");
        vec1.add("Leabord");
        vec1.add("Cheetah");
        System.out.println("Size : " + vec1.size());
        System.out.println("Capacity : " + vec1.capacity());
        vec1.addElement("Rat");
        vec1.addElement("Cat");
        vec1.addElement("Deer");
        System.out.println("Size : " + vec1.size());
        System.out.println("Capacity : " + vec1.capacity());

        if (vec1.contains("Tiger")){   // Checking purpose we're using
            System.out.println("Tiger is Present at the index of " + vec1.indexOf("Tiger"));  // Display the iteration of index
        }else {
            System.out.println("Tiger is not available");
        }
        System.out.println("First Animal of the Index : " + vec1.firstElement());
        System.out.println("Last Animal of the Index : " + vec1.lastElement());
        System.out.println(vec1.remove(2));
        System.out.println("After Removed : " + vec1);
        System.out.println("Clone : " + vec1.clone());

        Vector<String> vec2 =new Vector<>();
        vec2.add("Rat");
        vec2.add("Cat");
        System.out.println(vec1.containsAll(vec2));  // this is  displayed true or false
        vec2.add("Elephant");
        System.out.println(vec1.containsAll(vec2));
        System.out.println("Capacity : " + vec2.capacity());
        vec2.ensureCapacity(27);
        System.out.println("Ensure capacity : " + vec2.capacity());

        Vector<String> vec3 = new Vector<>();
        vec3.add("Rat");
        vec3.add("Cat");
        vec3.add("Elephant");
        System.out.println("Equals : " + vec2.equals(vec3));    //used to compare the specified object with this Vector for equality.
        System.out.println(vec3.firstElement());  // first array of the value
        System.out.println(vec3.lastElement());    // last array of the value
        vec3.forEach(System.out::println);      //It is an action which will be performed for each element.
        System.out.println("Get : " + vec3.get(0));     // get the value of specified element
        System.out.println("Index of : " + vec3.indexOf("Rat"));   // get the index value
        System.out.println("is Empty : " + vec3.isEmpty());     //checking the value inside array or not.

    }
}