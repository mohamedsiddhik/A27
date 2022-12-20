


package collections;

// LinkedList

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args) {

        LinkedList<Integer> link = new LinkedList<>();
        link.add(10);
        link.add(20);
        link.add(30);
        link.add(40);
        link.add(50);
        link.add(50);
        System.out.println("Add : "+ link);   //Insertion ordered maintained and it's allowed Duplicate
        link.addFirst(5);         // add first index of value
        link.addLast(55);         // add last index of value
        System.out.println("Add First And Last Value : " + link);
        //remove
        System.out.println("Removed first value value:" + link.removeFirst());
        System.out.println("Removed last index value "  + link.removeLast());
        System.out.println("Removed First and Last Value : " + link);
        System.out.println("Remove first value : " + link.pollFirst());
        System.out.println("Remove last value : " + link.pollLast());
        System.out.println("after Poll Removed first and last : " + link);

        //Iterate
        LinkedList<String> metro = new LinkedList<String>();
        metro.add("Mumbai");
        metro.add("Chennai");
        metro.add("Bengaluru");
        metro.add("Hyderabad");
        for (int i =0; i<metro.size();i++){
            System.out.println("Using for loop : " + metro.get(i));
        }
        System.out.println("---------------------------------------");
        for (String string : metro){
            System.out.println("Using with for each : " + string);
        }
        System.out.println("----------------------------------------");
        Iterator<String> iterator = metro.iterator();
        while (iterator.hasNext()){
            System.out.println("Using Iterator : " + iterator.next());
        }
    }
}