//import am.group.javaqamvn.SqrtService;
import am.group.javaqamvn.SqrtService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

//package am.group.javaqamvn.SqrtService;
public class SqrtServiceTest {

    @ParameterizedTest
   // @CsvSource({
      //      "5,25",
     //       "5, 0", //faled


   // })
    @CsvFileSource(files="src/test/resources/sqrt.csv")
    public void shouldCalcExact(int expected, int x) {
        SqrtService service = new SqrtService();

        //int expected = 5;
        int actual = service.calcSqrt(25);

        Assertions.assertEquals(expected, actual);
    }
}


    //public void shouldCalcInexact() {
    //      SqrtService service = new SqrtService();

         //int expected = 6;
         // int actual = service.calcSqrt(27);

         // Assertions.assertEquals(expected, actual);
     // }

       // @Test
        //  public void shouldCalcWrong(){
         //     SqrtService service = new SqrtService();

        //int expected = -8;
         //int actual = service.calcSqrt(44);

          //  Assertions.assertEquals(expected, actual);
          //}

         // @Test
         // public void shouldCalcWrong1(){
         //SqrtService service = new SqrtService();

         //double expected = 0.9;
        // double actual = service.calcSqrt(1);

         //Assertions.assertEquals(expected, actual);
         // }
     // }





