import static org.junit.Assert.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class UnitTest
{
    @Test
    public void testAddToArrayUnsorted() { //tests addToArray() unsorted
        StringContainer sc = new StringContainer();
        sc.addToArray("hi");
        sc.addToArray("bye");
        sc.addToArray("go");
        sc.addToArray("yell");
        sc.addToArray("mad");
        String[] theAns = sc.returnArray();
        String[] trueAns = new String[] {"hi", "bye", "go", "yell", "mad"};
        assertArrayEquals(theAns, trueAns);
    }

    @Test
    public void testSearchBeginningUnsorted() { //tests search unsorted beginning
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        StringContainer sc = new StringContainer(arr);
        int theAns = sc.search("hi");
        int trueAns = 0;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSearchMiddleUnsorted() { //tests search unsorted middle
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        StringContainer sc = new StringContainer(arr);
        int theAns = sc.search("go");
        int trueAns = 2;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSearchEndUnsorted() { //tests search unsorted end
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        StringContainer sc = new StringContainer(arr);
        int theAns = sc.search("mad");
        int trueAns = 4;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testToStringUnsorted() { //tests toString() unsorted
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        StringContainer sc = new StringContainer(arr);
        String theAns = sc.toString();
        String trueAns = "[hi,bye,go,yell,mad,]";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testAddToArraySorted() { //tests addToArray() sorted
        SortedStringContainer ssc = new SortedStringContainer();
        ssc.addToArray("go");
        ssc.addToArray("bye");
        ssc.addToArray("hi");
        ssc.addToArray("yell");
        String[] theAns = ssc.returnArray();
        String[] trueAns = new String[] {"bye", "go", "hi", "yell"};
        assertArrayEquals(theAns, trueAns);
    }

    @Test
    public void testSearchBeginningSorted() { //tests search() sorted beginning
        SortedStringContainer ssc = new SortedStringContainer();
        ssc.addToArray("hi");
        ssc.addToArray("bye");
        ssc.addToArray("go");
        ssc.addToArray("yell");
        ssc.addToArray("mad");
        int theAns = ssc.search("bye");
        assertEquals(theAns, 0);
    }

    @Test
    public void testSearchMiddleSorted() { //tests search() sorted middle
        SortedStringContainer ssc = new SortedStringContainer();
        ssc.addToArray("hi");
        ssc.addToArray("bye");
        ssc.addToArray("go");
        ssc.addToArray("yell");
        ssc.addToArray("mad");
        int theAns = ssc.search("hi");
        int trueAns = 2;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSearchEndSorted() { //tests search() sorted end
        SortedStringContainer ssc = new SortedStringContainer();
        ssc.addToArray("hi");
        ssc.addToArray("bye");
        ssc.addToArray("go");
        ssc.addToArray("yell");
        ssc.addToArray("mad");
        int theAns = ssc.search("yell");
        int trueAns = 4;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testToStringSorted() { //tests toString() sorted 
        SortedStringContainer ssc = new SortedStringContainer();
        ssc.addToArray("hi");
        ssc.addToArray("bye");
        ssc.addToArray("go");
        ssc.addToArray("yell");
        ssc.addToArray("mad");
        String theAns = ssc.toString();
        String trueAns = "[bye,go,hi,mad,yell,]";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testAddToArrayQuickSorted() { //tests addToArray() quicksort
        QuickSortedStringContainer qssc = new QuickSortedStringContainer();
        qssc.addToArray("go");
        qssc.addToArray("bye");
        qssc.addToArray("hi");
        qssc.addToArray("yell");
        String[] theAns = qssc.returnArray();
        String[] trueAns = new String[] {"bye", "go", "hi", "yell"};
        assertArrayEquals(theAns, trueAns);
    }

    @Test
    public void testSearchBeginningQuickSorted() { //tests search() quicksort beginning
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        QuickSortedStringContainer qssc = new QuickSortedStringContainer(arr);
        int theAns = qssc.search("bye");
        int trueAns = 0;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSearchMiddleQuickSorted() { //tests search() quicksort middle
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        QuickSortedStringContainer qssc = new QuickSortedStringContainer(arr);
        int theAns = qssc.search("hi");
        int trueAns = 2;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testSearchEndQuickSorted() { //tests search() quicksort end
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        QuickSortedStringContainer qssc = new QuickSortedStringContainer(arr);
        int theAns = qssc.search("yell");
        int trueAns = 3;
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testToStringQuickSorted() { //tests toString() quicksort
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        QuickSortedStringContainer qssc = new QuickSortedStringContainer(arr);
        String theAns = qssc.toString();
        String trueAns = "[bye,go,hi,mad,yell,]";
        assertEquals(theAns, trueAns);
    }

    @Test
    public void testRandomStringGeneratorRange() { //tests range of characters of RandomStringGenerator
        RandomStringGenerator rsg = new RandomStringGenerator((int) System.nanoTime(), 50);
        String value = rsg.nextString();
        int index1 = value.indexOf("a");
        int index2 = value.indexOf("z");
        boolean theAns = ((index1 != -1) && (index2 != -1));
        boolean trueAns = true;
        assertEquals(theAns, trueAns); 
    }

    @Test
    public void testRandomStringGeneratorDuplicate() { //tests uniqueness of characters of RandomStringGenerator
        RandomStringGenerator rsg1 = new RandomStringGenerator((int) System.nanoTime(), 50);
        String value1 = rsg1.nextString();
        RandomStringGenerator rsg2 = new RandomStringGenerator((int) System.nanoTime(), 50);
        String value2 = rsg2.nextString();
        boolean theAns = value1.equals(value2);;
        boolean trueAns = false;
        assertEquals(theAns, trueAns); 
    }

    @Test
    public void testDuplicateStringContainers() { //tests StringContainer copier
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("bye");
        arr.add("go");
        arr.add("yell");
        arr.add("mad");
        StringContainer sc = new StringContainer(arr);
        StringContainer sc2 = new StringContainer();
        sc2.StringContainer(sc);
        assertEquals(sc.toString(), sc2.toString()); 
    }
}
