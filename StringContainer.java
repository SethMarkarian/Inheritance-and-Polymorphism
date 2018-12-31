import java.util.*;
public class StringContainer
{
    protected ArrayList<String> arr;
    
    public StringContainer() { //Constructor
        arr = new ArrayList<String>(); //assigns arr 
    }
    
    public StringContainer(ArrayList<String> array) { //create string container with array
        arr = new ArrayList<String>(array); //uses elements from array for arraylist
    }
    
    public void StringContainer(StringContainer obj) { //copies stringcontainer
        this.arr = obj.arr; //copies string container to current one
    }
    
    public ArrayList addToArray(String str) { //adds element to end of arraylist
        arr.add(arr.size(), str); //adds str to index arr.size()
        return arr; //returns arraylist
    }
    
    public String getValue(int index) { //"get" method
       return arr.get(index); //returns element at index
    }
    
    public int search(String str) { //completes linear search
        for(int i = 0; i < arr.size(); i++) { //loops over arraylist
            if(arr.get(i).equals(str)  ) { //checks to see if equal
                return i; //returns index
            }
        }
        return -1; //not found
    }
    
    public String[] returnArray() { //converts arraylist to array
        String[] arrayString = new String[arr.size()]; //sets length of array to size of arraylist
        for(int i = 0; i < arr.size(); i++) { //loops through arraylist
            arrayString[i] = arr.get(i); //assigns Integer from arraylist to array
        }
        return arrayString; //return array
    }
    
    public String toString() { //prints arraylist
        String str = "["; //adds open bracket
        for(int i = 0; i < arr.size(); i++) { //loops over elements
            str += arr.get(i); //gets element and adds it to array
            str += ","; //adds comma
        }
        str += "]"; //adds closing bracket
        return str; //returns string of arraylist
    }
}
