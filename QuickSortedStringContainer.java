import java.util.*;
public class QuickSortedStringContainer extends SortedStringContainer
{

    public QuickSortedStringContainer() { //constructor
        arr = new ArrayList<String>(); //creates new arraylist
    }
    
    public QuickSortedStringContainer(ArrayList<String> array) { //constructor
        arr = new ArrayList<String>(array); //creates new arraylist with array elements
        Collections.sort(arr); //sorts elements
    }
}
