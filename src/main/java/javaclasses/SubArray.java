package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class SubArray {
    static private final String LOG_TAG = SubArray.class.getSimpleName();
    static int[] array = {18, 6, 66, 44, 9, 9, 22, 14};
    static int startIndex = 2;

    public static void main(String[] arg) {
        System.out.println("Answer is: " + indexOfMinimum(array, startIndex));
    }

    public static int indexOfMinimum(int[] intArray, int indexToStart) {
        int lowestValIndex = indexToStart;
        int minValue = intArray[indexToStart];
        System.out.println("minValue - " + minValue);
        for (int i = indexToStart; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                lowestValIndex = i;
                System.out.println("i - " + i + "| minValue - " + minValue );
            }
        }
        return lowestValIndex;
    }
}


