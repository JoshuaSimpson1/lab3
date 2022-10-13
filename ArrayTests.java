import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  // This test failed since we aren't creating a new array to return. So the method
  // instead works like this {1,2,3}, {1->3, 2, 3}, {3,2->2,3}, {3.2.3->3}
  // This method won't save the old number.
  @Test
  public void testReversedInPlaceSimple() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {3,2,1}, input1);
  }

  // The original method had the issue of using the newly created array to
  // supply the original array, so the test would only see 0's for the array
  // given.
  @Test
  public void testReversedSimple(){
    int[] input1 = {1,2,3};
    int[] output1 = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{3,2,1}, output1);
  }

  // Testing my average method, seems to work so far.
  @Test 
  public void testAverageWithoutLowest(){
    double input[] = {1,1,4.5,5,6};
    double output = ArrayExamples.averageWithoutLowest(input);
    double expected = (1 + 4.5 + 5 + 6) / 4;
    assertEquals(expected, output,0);
  }
}
