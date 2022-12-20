


package collections;

import java.util.*;

//ArrayList
public class CollectionExample
{
    public static void main(String[] args) {

        ArrayList<Integer> alist=new ArrayList<Integer>();        //Integer. flexible and support redudancy
        alist.add(13);
        alist.add(43);
        alist.add(222);

        for (int i = 34; i<=41;i++)
            alist.add(i);
        alist.add(11);

        System.out.println(alist);
        alist.add(1,81);            // add element with index
        System.out.println(alist);
        Collections.sort(alist);                      // sorting a value
        System.out.println("Sorted : " + alist);

        ArrayList<String> alist2 = new ArrayList<String>();      // String
        alist2.add("Prabhu");
        alist2.add("Kannan");            // insertion order in maintained. f
        alist2.add("Siddhik");
        alist2.add("Suresh");
        alist2.add("Prabhu");             // Duplicate is alloweded
        System.out.println(alist2);
        System.out.println(alist2.indexOf("Prabhu"));  // find the element value of index
        System.out.println(alist2.lastIndexOf("Prabhu"));   // find the element last value of index
        alist2.remove(0);
        System.out.println("Remove index: " +alist2);   // remove with index
        alist2.remove("Prabhu");
        System.out.println("Remove element : " + alist2);       // remove with object
        System.out.println(alist2.isEmpty());   //

        ArrayList<String> anotherList = new ArrayList<String>();
        anotherList.addAll(alist2);
        System.out.println("Copied the ArrayList : " + anotherList);   //copy
        anotherList.clear();
        System.out.println("Clear the ArrayList : " + anotherList);  //clear

        // Iterator
        for (String iterate : alist2 ){
            System.out.println("Using for each : " + iterate);
        }
        System.out.println("-----------------------------");
        for (int i =0 ; i<alist2.size(); i++){
            System.out.println("Using for loop : " + alist2.get(i));
        }
        System.out.println("------------------------------");
        ListIterator<String> listIterator = alist2.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        Iterator<String> iterator = alist2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        ArrayList alist3 = new ArrayList();                      // can insert heterogeneous object
        alist3.add("helllo");
        alist3.add(45);
        alist3.add(55.5);
        alist3.add(true);
        alist3.add('S');
        System.out.println(alist3);
        System.out.println("Get Individial Element : " +alist3.get(0));      // Getting the index of the value
        for (int i=0;i<5;i++)
            System.out.println("Get all element : " + alist3.get(i));    // getting an all element using loop

        alist3.set(0,"Hello World");          // Update the value using set
        System.out.println("set : " + alist3);
        alist3.remove(2);               // Removing a index of value using remove.
        System.out.println("remove : " + alist3);
        System.out.println("size : " + alist3.size());     // Count the number of elements in array.
        System.out.println("contains : " + alist3.contains(46));   // Checking the elements are inside the arraylist
        System.out.println("clone : " + alist3.clone());



    }
}