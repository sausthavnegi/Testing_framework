import org.testng.annotations.Test
import org.testng.asserts.SoftAssert

class Validations {

  void validate(String input,String value){
      if (input.equalsIgnoreCase("EVENT")){
           Event()
      }
      else if (input.equalsIgnoreCase("rootid")){
          rootid()
      }
      else if (input.equalsIgnoreCase("Date")){
          Date()
      }
  }

    SoftAssert softAssert = new SoftAssert()
    @Test
    void Event(){
        softAssert.assertTrue("TEST"=="Test2","Expected Test, FOUND Test2")

        softAssert.assertAll()

    }
    @Test
    void rootid(){
        softAssert.assertTrue("ID1"=="ID2","Test ID")
        softAssert.assertAll()

    }
    @Test
    void Date(){
        softAssert.assertTrue("ID1"=="ID2","Test ID")
        softAssert.assertAll()

    }

}
