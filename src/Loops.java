 public class Loops {
        public static void main(String[] args) {
            // Loops allow us to perform a task multiple times.

            // Below is a simple loop that prints "HELLO" 3 times.

            // EXPLANATION:
            // We start with initializing the variable i=0. Then,
            // as long as the condition i<4 is true, the task will run.
            // Lastly, in each iteration, i++ causes the value of i to
            // increase by 1.
            for (int i = 0; i < 4; i++) {
                System.out.println("hello");
            }

            // This loop prints numbers 0 to 5.
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
            }

            // This is the pseudocode template
        /*
            for (starting; condition to end; increment/decrement) {
                // tasks
            }
        */

            // This loop begins printing 5 and increases by 5 in each iteration
            // until i is no longer less than 25.
            for (int i = 5; i < 25; i+=5) {
                System.out.println(i);
            }

            // Loops are often used along with arrays in order to perform
            // a task on each value in the array. This is done by accessing
            // the index value of the array using the variable i.

            //  index values:            0           1         2          3            4          5              6
            String[] groceryList = {"broccoli", "carrots", "cheese", "whole milk", "cereal", "halal beef", "sparkling cider"};

            // The below loop begins with i at 0, continues as long as i less than groceryList.length.
            // The text, groceryList.length gives us the length of the array.
            for (int i = 0; i < groceryList.length; i++) {
                System.out.println(groceryList[i]);
            }

            // Further below is a method that takes a list of strings and prints each item.
            // Here we will invoke that method with two different arrays.
            getGroceryList(groceryList);
            String[] groceryList2 = {"milkk", "cookies", "chips", "pizza"};
            getGroceryList(groceryList2);


            // Below, we use a for loop to copy all values from movies
            // to the moviesCopy array. The length of moviesCopy array is larger
            // than the movies array. This allows us to add an additional value
            // to the array.
            String[] movies = { "rocky", "fight club", "mission impossible" };
            String[] moviesCopy = new String[4];

            for (int i = 0; i < movies.length; i++) {
                moviesCopy[i] = movies[i];
            }

        }

        // This method takes an array and prints each value in the array
        public static void getGroceryList(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        // This method takes an array and prints each value in reverse
        public static void getGroceryListReversed(String[] arr) {
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

