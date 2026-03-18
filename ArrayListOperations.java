import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // In Java, Arrays have a fixed size. ArrayLists can grow/shrink dynamically.
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. ADDING to an ArrayList (append)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println("Initial list: " + list);
        
        // 2. ADDING at a specific spot/index
        list.add(1, 15); // Puts '15' right after '10' (index 1)
        System.out.println("After inserting 15: " + list);
        
        // 3. GETTING elements
        int retrievedValue = list.get(2); 
        System.out.println("Element at index 2 is: " + retrievedValue);
        
        // 4. REMOVING elements (by index)
        list.remove(4); // Removes '40'
        System.out.println("After removing index 4: " + list);
        
        // 5. SIMPLE FOR-LOOP with ArrayLists
        System.out.print("Looping through manually: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
