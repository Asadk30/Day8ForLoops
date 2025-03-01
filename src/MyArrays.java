import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        // So far, the only variables we've created contained one single data.
        String name = "farhad";
        int age = 21;
        double funds = 200.43;

        // Arrays are data structures that contain a list of data.

        // Data structures: these are objects that allow us to contain collections
        //                  of data/values.
        double[] bankBalances = {1100, 344354435.23};
        String[] students = {"Goggins", "Jordan", "Kobe"};
        int[] nums = {100, 200, 300, 400, 500, 600, 700};

        // Array values can be accessed by their index. Indexes begin with 0.
        //                        0             1         2          3            4
        String[] groceryList = {"broccoli", "carrots", "cheese", "whole milk", "eggs"};

        // Below we are printing each value in the groceryList array.
        System.out.println(groceryList[0]);
        System.out.println(groceryList[1]);
        System.out.println(groceryList[2]);
        System.out.println(groceryList[3]);
        System.out.println(groceryList[4]);

        // Create a list of your 3 favorite movies or TV shows
        // In main(), print each value in the array.
        String[] favMoviesAndTvShows = { "rocky", "fight club", "mission impossible" };
        System.out.println(favMoviesAndTvShows[0]);
        System.out.println(favMoviesAndTvShows[1]);
        System.out.println(favMoviesAndTvShows[2]);

        // We can also update values of an array by using their index value.
        String[] groceryList2 = {"milkk", "cookies", "chips", "pizza"};
        groceryList2[0] = "milk"; // resets the 0th value
        groceryList2[3] = ""; // resets the 3rd value to an empty string

        // PRINTING ARRAYS
        // Running the below will NOT print the array values.
        // Instead, it will print the array's location in memory.
        System.out.println(groceryList);

        // To print an array, we must run the following:
        System.out.println(Arrays.toString(groceryList));
    }
}