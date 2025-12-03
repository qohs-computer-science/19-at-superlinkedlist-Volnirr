import java.util.LinkedList;
import java.util.ListIterator;

public class SuperLinkedList extends LinkedList<String> {
    
    public boolean removeVowels() {
        boolean removed = false;
        ListIterator<String> iter = this.listIterator();
        
        while (iter.hasNext()) {
            String element = iter.next();
            
            if (element.length() == 1) {
                char c = Character.toLowerCase(element.charAt(0));
                
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    iter.remove();
                    removed = true;
                } // remove if vowel
            } // if length = 1 check if vowel
        } // loop through list
        
        return removed;
    } // end removeVowels
    
    public boolean removeConsonants() {
        boolean removed = false;
        ListIterator<String> iter = this.listIterator();
        
        while (iter.hasNext()) {
            String element = iter.next();
            
            if (element.length() == 1) {
                char c = Character.toLowerCase(element.charAt(0));
                
                if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    iter.remove();
                    removed = true;
                } //if consonant remove
            } //if length 1 check if consonant
        } // loop thru list
        
        return removed;
    } //end removeConsonants
    
    public LinkedList<String> removeDuplicates() {
        LinkedList<String> removedList = new LinkedList<String>();
        ListIterator<String> iter = this.listIterator();
        int currentIndex = 0;
        
        while (iter.hasNext()) {
            String current = iter.next();
            boolean isDuplicate = false;
            
            for (int i = 0; i < currentIndex; i++) {
                if (this.get(i).equals(current)) {
                    isDuplicate = true;
                    break;
                } //if duplicate found settrue
            } // loop thru list
            
            if (isDuplicate) {
                removedList.add(current);
                iter.remove();
            } else {
                currentIndex++;
            } //if duplicate remove
        } // loop thru list
        
        return removedList;
    } //end removeDuplicates
    
    public LinkedList<String> concatenateStrings() {
        LinkedList<String> result = new LinkedList<String>();
        String concatenated = "";
        ListIterator<String> iter = this.listIterator();
        
        while (iter.hasNext()) {
            concatenated += iter.next();
            result.add(concatenated);
        } //loop through and add to result
        
        return result;
    } //end concatenateStrings
    
    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList<String> result = new LinkedList<String>();
        ListIterator<String> iter1 = this.listIterator();
        ListIterator<String> iter2 = list2.listIterator();
        
        while (iter1.hasNext() && iter2.hasNext()) {
            result.add(iter1.next());
            result.add(iter2.next());
        } //while both have next
        
        return result;
    } //end mix
    
    public String toString() {
        ListIterator<String> iter = this.listIterator();
        String result = "";
        
        while (iter.hasNext()) {
            result += iter.next();
            
            if (iter.hasNext()) {
                result += ", ";
            } // if has next add , and space
        } //loop throuhg list
        
        return result;
    } //end toString
} //end SuperLinkedList
