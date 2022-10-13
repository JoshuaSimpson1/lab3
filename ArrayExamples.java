

public class ArrayExamples {

  // Changes the input array to be in reversed order, FIXED
  static void reverseInPlace(int[] arr) {
    int[] arrCopy = arr.clone();
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arrCopy[arr.length - i - 1];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    double sum = 0;

    // I got rid of the condition to check the lowest number
    // and instead just subtracted by the lowest number to 
    // effectively remove it.
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
      sum += num;
    }

    sum = sum - lowest;
    return sum / (arr.length - 1);
  }


}

