package org.example.LatticePaths;

public class LatticePaths {
    public static int latticePaths(int number){
        int result = 1;

        for (int counter = 1; counter <= number; counter++) {
            result = result * (counter + number) / counter;
        }

        return result;
    }
}
