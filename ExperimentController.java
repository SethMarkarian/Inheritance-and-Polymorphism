import java.util.*;
public class ExperimentController
{
    public static void main(String[] args) { //0: # of items 1: string length, 2: number of strings, 3: # of searches
        //A
        ArrayList<String> arrString = new ArrayList<String>();
        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            RandomStringGenerator rsg = new RandomStringGenerator((int) System.nanoTime(), Integer.parseInt(args[1]));
            arrString.add(rsg.nextString());
        }

        //B
        StringContainer[] arrSC = new StringContainer[3];

        //C
        long t0, t1;
        t0 = System.nanoTime(); //stores starting time
        arrSC[0] = new StringContainer();
        t1 = System.nanoTime(); //stores starting time
        System.out.println("StringContainer: " + (t1 - t0));
        t0 = System.nanoTime(); //stores starting time
        arrSC[1] = new SortedStringContainer();
        t1 = System.nanoTime(); //stores starting time
        System.out.println("SortedStringContainer: " + (t1 - t0));
        t0 = System.nanoTime(); //stores starting time
        arrSC[2] = new QuickSortedStringContainer();
        t1 = System.nanoTime(); //stores starting time
        System.out.println("QuickSortedStringContainer: " + (t1 - t0));
        t0 = System.nanoTime(); //stores starting time

        //D
        for(int i = 0; i < Integer.parseInt(args[3]); i++) {
            RandomStringGenerator rsg = new RandomStringGenerator((int) System.nanoTime(), Integer.parseInt(args[1]));
            arrSC[0].addToArray(rsg.nextString());
        }
        t1 = System.nanoTime(); //stores starting time
        System.out.println("Add to StringContainer: " + (t1 - t0));
        t0 = System.nanoTime(); //stores starting time
        for(int i = 0; i < Integer.parseInt(args[3]); i++) {
            RandomStringGenerator rsg = new RandomStringGenerator((int) System.nanoTime(), Integer.parseInt(args[1]));
            arrSC[1].addToArray(rsg.nextString());
        }
        t1 = System.nanoTime(); //stores starting time
        System.out.println("Add to SortsedStringContainer: " + (t1 - t0));
        t0 = System.nanoTime(); //stores starting time
        for(int i = 0; i < Integer.parseInt(args[2]); i++) {
            RandomStringGenerator rsg = new RandomStringGenerator((int) System.nanoTime(), Integer.parseInt(args[0]));
            arrSC[2].addToArray(rsg.nextString());
        }
        t1 = System.nanoTime(); //stores starting time
        System.out.println("Add to QuickSortedStringContainer: " + (t1 - t0));

        //E
        t0 = System.nanoTime(); //stores starting time
        for(int i = 0; i < Integer.parseInt(args[3]); i++) {
            Random random2 = new Random((int) System.nanoTime());
            int d = random2.nextInt(Integer.parseInt(args[1])); 
            String value = arrSC[0].getValue(d);
            int find = arrSC[0].search(value);
        }
        t1 = System.nanoTime(); //stores ending time
        System.out.println("Time to find StringContainer value: " + (t1 - t0)); //calculates total time
        t0 = System.nanoTime(); //stores starting time
        for(int i = 0; i < Integer.parseInt(args[3]); i++) {
            Random random3 = new Random((int) System.nanoTime());
            int e = random3.nextInt(Integer.parseInt(args[1])); 
            String val = arrSC[1].getValue(e);
            int f = arrSC[1].search(val);
        }
        t1 = System.nanoTime(); //stores ending time
        System.out.println("Time to find SortedStringContainer value: " + (t1 - t0)); //calculates total time
        t0 = System.nanoTime(); //stores starting time
        for(int i = 0; i < Integer.parseInt(args[3]); i++) {
            Random random4 = new Random((int) System.nanoTime());
            int a = random4.nextInt(Integer.parseInt(args[1])); 
            String v = arrSC[2].getValue(a);
            int g = arrSC[1].search(v);
        }
        t1 = System.nanoTime(); //stores ending time
        System.out.println("Time to find QuickSortedStringContainer value: " + (t1 - t0)); //calculates total time
    }
}