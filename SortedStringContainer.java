import java.util.ArrayList;
public class SortedStringContainer extends StringContainer
{
    public SortedStringContainer() { //constructor
        arr = new ArrayList<String>(); //new arraylist
    }

    public SortedStringContainer(ArrayList<String> array) { //constructor inputting arraylist
        arr = new ArrayList<String>(array); //inserting elements 
        for(int i = 0; i < array.size() - 1; i++) { //loops over elements
            int posMin = i; //minimum position
            for(int j = i + 1; j < array.size(); j++) { //loops over elements
                if(arr.get(j).compareTo(arr.get(posMin)) > 0) { //compares current element with minimum
                    posMin = j; //resets minimum position
                }
                String temp = arr.get(i); //starts to swap
                arr.set(i, arr.get(posMin)); //swap
                arr.set(posMin, temp); //ends swap
            }
        }
    }
    
    public ArrayList addToArray(String str) { //adds string to arraylist sorted
        if(arr.size() == 0) { //checks to see if arraylist length is 0
            arr.add(str); //adds to end
        }
        else {
            int i = 0; //start at the beginning
            while(i < arr.size()  && arr.get(i).compareTo(str) < 0) { //loops while position is smaller than length and if the number is larger than current
                i++; //add one to position
            }
            arr.add(i, str); //add number to position i
        }
        return arr; //returns arraylist
    }

    public int search(String str) {
        int left = 0; //sets left to beginning
        int right = arr.size() - 1; //sets right to end
        while(left <= right) { //checks to see if crossed
            int middle = (left + right) / 2; //sets middle to middle index
            if(arr.get(middle).compareTo(str) < 0) { //checks to see if its greater
                left = middle + 1; //moves left
            }
            else if(arr.get(middle).compareTo(str) > 0) { //checks to see if its smaller
                right = middle - 1; //moves right
            }
            else { //if element is middle
                return middle; //return index
            }
        }
        return -1; //not found
    }
}
