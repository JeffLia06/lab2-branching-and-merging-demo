public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers

        // the problem is input number are large number stored in long type, which is out of maximum of int variable
        // to fix it, I try to change int s to long s (int: [-2,147,483,647, 2,147,483,647])
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
