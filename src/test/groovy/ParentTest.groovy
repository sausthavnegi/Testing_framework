import groovy.cli.Option
import org.testng.Assert
import org.testng.annotations.Optional
import org.testng.annotations.Test
import org.testng.asserts.SoftAssert

class ParentTest {

    String testnumber
    String testcase
    ArrayList<String> orderlifecycle
    ArrayList<String>dsolFields
  ArrayList<HashMap<String,String>> eventsToValidate
    SoftAssert softAssert = new SoftAssert()
    Validations validat= new Validations();

/*@Test
void  test(@Optional("true")boolean inject){
   *//* for(int i=0;i<eventsToValidate.size();i++){
        HashMap msg = eventsToValidate.get(i)
        println("ArrayList: "+msg)
        for(int j =0;j<dsolFields.size();j++){
            println("hashMap "+msg.getAt(dsolFields.get(j)))
            String temp =msg.getAt(dsolFields.get(j))
            validat.validate(dsolFields.get(i),temp)
            softAssert.assertAll()
        }
    }*//*
    testing()

}*/

    @Test
    void Event(){
        for(int i=0;i<eventsToValidate.size();i++){
            HashMap msg = eventsToValidate.get(i)
            String temp =msg.get("Event")
            println("ArrayList: "+msg +" EVENT: "+ temp)
            softAssert.assertTrue("onew"==temp,"Expected: onew"+ "  FOUND: " +temp +" For "+msg)
           // softAssert.assertAll()

        }
        softAssert.assertAll()

    }

    @Test
    void rootid(){
        for(int i=0;i<eventsToValidate.size();i++) {
            HashMap msg = eventsToValidate.get(i)
            String temp = msg.get("rootid")
            println("ArrayList: "+msg +" RootID: "+ temp)
            softAssert.assertTrue("id1" == temp, "Expected: id1" + "  FOUND: " + temp + " For " + msg)
            //softAssert.assertAll()

             softAssert.assertAll()
        }
        softAssert.assertAll()

    }
    @Test
    void Date(){
        for(int i=0;i<eventsToValidate.size();i++){
            HashMap msg = eventsToValidate.get(i)
            String temp =msg.get("Date")

            println("ArrayList: "+msg +" Date: "+ temp)
            softAssert.assertTrue("124"==temp,"Expected: 124"+ "  FOUND: " +temp +" For "+msg)
           // softAssert.assertAll()
    }
        softAssert.assertAll()



       // softAssert.assertAll()

    }

}
