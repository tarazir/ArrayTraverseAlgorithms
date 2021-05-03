// Program by: Mr. Tarazi, ASK HS Technology Teacher
// Date: 30/04/2021
// Algorithms that utilize Array Traversals based on AP CSA CED

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray =  new int[10] ;
        // Create 10 random numbers and insert them inside an array
        for (int i=0; i<myArray.length;i++)
            myArray[i] = (int) (Math.random() * 10);

        System.out.println("Random generated Array Elements -> " + Arrays.toString(myArray));
        System.out.println("1] Minimun value in the Array is -> " + minValue(myArray));
        System.out.println("2] Maximum value in the Array is -> " + maxValue(myArray));
        System.out.println("3] Sum value in the Array is -> " + sumValue(myArray));
        System.out.println("4] Average value in the Array is -> " + avgValue(myArray));
        System.out.println("5] Do Array elements have an Even number -> " + oneElementProperty(myArray));
        System.out.println("6] Are all elements in the Array Even numbers -> " + allElementProperty(myArray));
        System.out.println("7] Access Consecutive pairs of elements in the Array -> " + accessConsecutive(myArray));
        System.out.println("8] Does ZERO appear in the Array values -> " + zeroElementArray(myArray));
        System.out.print("9] Reverse elements of the Array -> ");
        reverseArray(myArray);
        System.out.println();
        System.out.println("10] Are there duplicates in the Array -> " + duplicatesInArray(myArray));
        System.out.print("11] Shift numbers in the array one step to the right -> " );
        shiftInArray(myArray);
        System.out.println("12] Most Frequent number in the Array is -> " + modeValue(myArray));
    }


    // Minimum value in the Array
    public static int minValue(int[] myArray) {
        // min is a variable to hold the first element in the array
        int min = myArray[0];
        for (int i=0; i<myArray.length;i++) {
            if (myArray[i]<min) {
                min = myArray[i];
            }
        }
        return min;
    }

    // MMaximum value in the Array
    public static int maxValue(int[] myArray) {
        // max is a variable to hold the first element in the array
        int max = myArray[0];
        for (int i=0; i<myArray.length;i++) {
            if (myArray[i]>max) {
                max = myArray[i];
            }
        }
        return max;
    }

    // Sum value of the Array
    public static int sumValue(int[] myArray) {
        // max is a variable to hold the first element in the array
        int sum = 0;
        for (int i=0; i<myArray.length;i++) {
            sum += myArray[i];
        }
        return sum;
    }

    // Average value of the Array
    public static double avgValue(int[] myArray) {
        int sum = 0;
        for (int i=0; i<myArray.length;i++) {
            sum += myArray[i];
        }
        return ((double)sum/myArray.length);
    }

    // Mode value in the Array. To get the mode, array must be sorted ascending and mode is the number which appears
    // most often
    public static int modeValue(int[] myArray) {
        int modeCount = 0;      // The count of the mode value
        int mode = 0;           // The value of the mode
        int currCount = 0;
        int currElement;
        // Sorting the array in ascending order
        Arrays.sort(myArray);

        for (int candidateMode : myArray) {
            // Reset the number of times we have seen the current value
            currCount = 0;
            // Iterate through the array counting the number of times we see the current candidate mode
            for (int element : myArray) {
                if(candidateMode==element) {
                    currCount++;
                }
            }
            //We only save this candidate mode, if its count is greater than the current count
            // we have stored in the "mode" variable
            if (currCount>modeCount) {
                modeCount = currCount;
                mode = candidateMode;
            }
        }
        return mode;
    }

    // Determine if at least one of the elements has a particular property (Even Numbers)
    public static boolean oneElementProperty(int[] myArray) {
        for (int i=0;i<myArray.length;i++) {
            // Check if the number is even
            if (myArray[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    // Determine if all elements of the array has a particular property (Even Numbers)
    public static boolean allElementProperty(int[] myArray) {
        for (int i=0;i<myArray.length;i++) {
            if (myArray[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // Determine first two consecutive numbers in an array
    public static String accessConsecutive(int[] myArray) {
        for (int i=0; i<myArray.length-1;i++) {
            if(myArray[i] == myArray[i+1])
                return myArray[i] + " " + myArray[i+1];
        }
        return "None";
    }

    // Determine if the Array has a ZERO
    public static boolean zeroElementArray(int[] myArray) {
        for (int i=0; i<myArray.length;i++) {
            if(myArray[i] == 0)
                return true;
        }
        return false;
    }


    // Duplicates in an Array. Are there duplicates in the Array
    //
    public static boolean duplicatesInArray(int[] myArray) {

        int currCount = 0;
        int currElement;
        // Sorting the array in ascending order

        for (int candidateMode : myArray) {
            // Reset the number of times we have seen the current value
            currCount = 0;
            // Iterate through the array counting the number of times we see the current candidate mode
            for (int element : myArray) {
                if(candidateMode==element) {
                    currCount++;
                }
            }
            if (currCount > 1) {
                return true;
            }
        }
        return false;
    }

    // Shift numbers to the right one step
    public static void shiftInArray(int[] myArray) {

        int last = myArray[myArray.length-1];
        for (int i=myArray.length-1; i>0;i--) {
            myArray[i] = myArray[i-1];
        }
        myArray[0] = last;
        System.out.println(Arrays.toString(myArray));

    }
    // Print the array elements in reverse order
    public static void reverseArray(int[] myArray) {

        for (int i=myArray.length-1; i>=0; i--) {
           System.out.print(myArray[i] + " ");
        }
    }


}
