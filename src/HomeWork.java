public class HomeWork {
    public static void main(String[] args) {
int[] numArr1 = {100, 200, 300, 400, 500};
int[] numArr2 = {11, 22, 33};


  int  sum1 = getSum(numArr1);
    int sum2 = getSum(numArr2);

        System.out.println("sum 1 is " + sum1);
        System.out.println("sum 2 is " + sum2);
    }

    public static int getSum(int[] intArr) {
        System.out.println(intArr[0]);
        int currentSum = 0;
        for (int i = 0; i < intArr.length; i++) {
         currentSum = currentSum + intArr[i];

        }
        return currentSum;
    }
}
/*
Step 1: Inside your main() method, create an array of integers called numArr1 and have it contain the
following numbers: 100, 200, 300, 400, 500.

Step 2: Inside your main() method, create another array of integers called numArr2 and have it contain
the following numbers: 11, 22, 33.

Step 3: Create a method called getSum() that takes an array of integers and returns the sum.
 */