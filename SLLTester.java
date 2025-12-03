/*
 * Liam Gillaspy
 * 12/03
 * Class Period: 6
 * Tests extion of Java's LinkedList class
*/

import java.util.LinkedList;
import java.util.ListIterator;

public class SLLTester {
    
    public static void main(String[] args) {
        SuperLinkedList list1 = new SuperLinkedList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        
        SuperLinkedList list2 = new SuperLinkedList();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        
        SuperLinkedList list3 = new SuperLinkedList();
        list3.add("X");
        list3.add("Y");
        list3.add("Z");
        list3.add("X");
        list3.add("Y");
        
        System.out.println("Original List 1:");
        printList(list1);
        
        System.out.println("\nOriginal List 2:");
        printList(list2);
        
        System.out.println("\nOriginal List 3:");
        printList(list3);
        
        System.out.println("\nTesting removeVowels on List 1");
        boolean vowelsRemoved = list1.removeVowels();
        System.out.println("Vowels removed: " + vowelsRemoved);
        System.out.println("List 1 after removeVowels:");
        printList(list1);
        
        System.out.println("\nTesting removeConsonants on List 2");
        boolean consonantsRemoved = list2.removeConsonants();
        System.out.println("Consonants removed: " + consonantsRemoved);
        System.out.println("List 2 after removeConsonants:");
        printList(list2);
        
        System.out.println("\nTesting removeDuplicates on List 3");
        LinkedList<String> duplicates = list3.removeDuplicates();
        System.out.println("Duplicates removed:");
        printList(duplicates);
        System.out.println("List 3 after removeDuplicates:");
        printList(list3);
        
        SuperLinkedList list4 = new SuperLinkedList();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        
        System.out.println("\nTesting concatenateStrings on List 4");
        System.out.println("Original List 4:");
        printList(list4);
        LinkedList<String> concatenated = list4.concatenateStrings();
        System.out.println("Concatenated result:");
        printList(concatenated);
        System.out.println("List 4 after concatenateStrings (should be unchanged):");
        printList(list4);
        
        SuperLinkedList list5 = new SuperLinkedList();
        list5.add("A");
        list5.add("B");
        list5.add("C");
        
        SuperLinkedList list6 = new SuperLinkedList();
        list6.add("a");
        list6.add("b");
        list6.add("c");
        
        System.out.println("\nTesting mix on List 5 and List 6");
        System.out.println("List 5:");
        printList(list5);
        System.out.println("List 6:");
        printList(list6);
        LinkedList<String> mixed = list5.mix(list6);
        System.out.println("Mixed result:");
        printList(mixed);
        System.out.println("List 5 after mix (should be unchanged):");
        printList(list5);
        System.out.println("List 6 after mix (should be unchanged):");
        printList(list6);
        
        System.out.println("\nTesting toString on List 5");
        System.out.println("toString result: " + list5.toString());
    }
    
    private static void printList(LinkedList<String> list) {
        ListIterator<String> iter = list.listIterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
