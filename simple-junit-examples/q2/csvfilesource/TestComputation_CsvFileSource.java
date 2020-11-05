package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import p4.csvfilesource.Customer;

public class TestComputation_CsvFileSource {
   Computation comp = new Computation();
   // TODO: Write your answer to complete this test case
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int input1, int input2, int expected) throws Exception {
      
      int actualResult = comp.getDiscount(input1, input2);
      Assert.assertEquals(expected, actualResult);

   }
}
