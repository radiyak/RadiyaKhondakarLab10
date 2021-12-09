import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
<<<<<<< HEAD
testMixed();
testDuplicates();
=======
//testMixed();
//testDuplicates();
>>>>>>> Test1
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

<<<<<<< HEAD
=======
       SelectionSort x= new SelectionSort();
       x.basicSelectionSort(arr);
        for(int i=0;i<5;i++) {
        assert(arr[i]==Sortedarr[i]);
        }
>>>>>>> Test1
        /** add tests to check for this unit test **/
    }

    public void testNegative(){

        /** Test data contains negative values only **/
<<<<<<< HEAD
    }

    public void testMixed(){

        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){

        /** Test data contains duplicates **/
=======
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;


        SelectionSort x= new SelectionSort();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         assert(arr[i]==Sortedarr[i]);
         }
    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 7;
        Sortedarr[4] = 10;
        /** Test data contains with both positive, negative and zeros **/
        SelectionSort x= new SelectionSort();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         assert(arr[i]==Sortedarr[i]);
         }
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 10;
        arr[2] = -7;
        arr[3] = 2;
        arr[4] = -7;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -7;
        Sortedarr[2] = 2;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;
        /** Test data contains duplicates **/
        SelectionSort x= new SelectionSort();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         assert(arr[i]==Sortedarr[i]);
         }
>>>>>>> Test1
    }
}
