import Calculator.CalculatorService;
import Calculator.MathApplication;
import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class MathApplicationTester {
    // @TestSubject annotation is used to identify class which is going to use the mock object
    @TestSubject
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;


    public static void main(String[] args) {
        MathApplicationTester tester= new MathApplicationTester();
        System.out.println("Welcome! Lets first test the SEG classes");
        //System.out.println(tester.testSub()? "All Passed" : "fail");
    }

    public void testAdd(){
        //add the behavior of calc service to add two numbers
        EasyMock.expect(calcService.add(10,20)).andReturn(30);

        //activate the mock
        EasyMock.replay(calcService);

        //test the add functionality
        //Assert.assertEquals(mathApplication.add(10, 20),30);
    }

    @Test
    public void testSub(){
        //add the behavior of calc service to subtract two numbers
        EasyMock.expect(calcService.subtract(5,3)).andReturn(2);

        calcService.serviceUsed();
        EasyMock.expectLastCall().times(1,5);
        //activate the mock
        EasyMock.replay(calcService);
        Assert.assertEquals(mathApplication.subtract(5, 3), 2, 0);

        //verify call to calcService is made or not
        EasyMock.verify(calcService);
    }

}


//calcService.serviceUsed();
//EasyMock.expectLastCall().times(1,4);