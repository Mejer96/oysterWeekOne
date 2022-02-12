package com.company;

public class ShiftElementsInArray {

    public static void shiftElements(int[] arrayOfNumbers, int numberOfElementsToShift) {
        int i = 0;
        int n = 0;

        while (numberOfElementsToShift > arrayOfNumbers.length) {
            // loop handles situations where the number of elements to shift are higher than arrayOfNumbers.length
            numberOfElementsToShift -= arrayOfNumbers.length;
        }

        int[] container = new int[numberOfElementsToShift];

        while (i < arrayOfNumbers.length) {

            if (i < numberOfElementsToShift) {
                // keeps track of the elements that gets replaced during the shift.
                container[i] = arrayOfNumbers[i];
            }

            if (i < arrayOfNumbers.length - numberOfElementsToShift) {
                // shifts elements to the left.
                arrayOfNumbers[i] = arrayOfNumbers[i + numberOfElementsToShift];
                i++;
            } else {
                // puts the replaced element back in the end of the array to complete the shift.
                arrayOfNumbers[i] = container[n];
                i++;
                n++;
            }
        }

        for (int var : arrayOfNumbers) {
            System.out.println(var);
        }
    }
}
