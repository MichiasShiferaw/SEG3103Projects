import java.util.ArrayList;
import java.util.List;

import Schooling.ClassReport;
import Schooling.SEGClass;
import Schooling.ClassServices;
import org.easymock.EasyMock;

public class ClassReportTest {
    ClassReport classReport;
    ClassServices classService;

    public static void main(String[] args){
        ClassReportTest tester = new ClassReportTest();
        tester.setUp();
        System.out.println("Welcome! Lets first test the SEG classes");
        System.out.println(tester.SEG_test()?"All Passed":"fail");
        
        
        tester = new ClassReportTest();
        tester.setUp();
        System.out.println("Awesome! Now lets test the CSI classes");
        System.out.println(tester.CSI_test()?"All Passed":"fail");
        
        
        tester = new ClassReportTest();
        tester.setUp();
        System.out.println("Awesome! Now lets test classes with negative passing ratings");
        System.out.println(tester.negative_test()?"All Passed":"fail");

        tester = new ClassReportTest();
        tester.setUp();
        System.out.println("Fantastic! Now lets test classes with over hundred passing ratings");
        System.out.println(tester.overhundred_test()?"All Passed":"fail");


       System.out.print("-------------------\n4/4\n :)");




    }
    public void setUp(){
        //Create a Class object which is to be tested
        classReport = new ClassReport();

        //Create the mock object of classes
        classService = EasyMock.createMock(ClassServices.class);

        //set the classService to the object
        classReport.setclassService(classService);
    }
    public boolean SEG_test(){
        //Creates a list of classes to be added to the object
        List<SEGClass> classes = new ArrayList<SEGClass>();
        SEGClass SEG3103 = new SEGClass("3103","SEG", 140);
        SEGClass SEG3102 = new SEGClass("3102","SEG",230);

        classes.add(SEG3103);
        classes.add(SEG3102);

        //add classes to the list
        classReport.setClasses(classes);

        // mock the behavior of class percentage to return the value of various classes
        EasyMock.expect(classService.getClass(SEG3103)).andReturn(1.00);
        EasyMock.expect(classService.getClass(SEG3102)).andReturn(0.70);

        // activate the mock
        EasyMock.replay(classService);

        double projectedPassingVal = classReport.getPassedStudents();
        return projectedPassingVal == 301.0;
    }

    public boolean CSI_test(){
        //Creates a list of classes to be added to the list
        List<SEGClass> classes = new ArrayList<SEGClass>();
        SEGClass CSI1111 = new SEGClass("1111","CSI", 402);
        SEGClass CSI1113 = new SEGClass("1113","CSI",1200);

        classes.add(CSI1111);
        classes.add(CSI1113);

        //add classes to the list
        classReport.setClasses(classes);

        // mock the behavior of class percentage to return the value of various classes
        EasyMock.expect(classService.getClass(CSI1111)).andReturn(0.50);
        EasyMock.expect(classService.getClass(CSI1113)).andReturn(0.25);

        // activate the mock
        EasyMock.replay(classService);

        double projectedPassingVal = classReport.getPassedStudents();
        return projectedPassingVal == 501;
    }

    public boolean negative_test(){
        //Creates a list of classes to be added to the list
        List<SEGClass> classes = new ArrayList<SEGClass>();
        SEGClass SEG1010 = new SEGClass("1111","SEG", 402);
        SEGClass SEG3103 = new SEGClass("1113","SEG",1200);

        classes.add(SEG1010);
        classes.add(SEG3103);

        //add classes to the list
        classReport.setClasses(classes);

        // mock the behavior of class percentage to return the value of various classes
        EasyMock.expect(classService.getClass(SEG1010)).andReturn(-0.50);
        EasyMock.expect(classService.getClass(SEG3103)).andReturn(-0.25);

        // activate the mock
        EasyMock.replay(classService);

        double projectedPassingVal = classReport.getPassedStudents();
        return projectedPassingVal == 0;
    }

    public boolean overhundred_test(){
        //Creates a list of classes to be added to the list
        List<SEGClass> classes = new ArrayList<SEGClass>();
        SEGClass MAT110 = new SEGClass("1111","CSI", 643);
        SEGClass MAT210 = new SEGClass("1113","CSI",500);

        classes.add(MAT110);
        classes.add(MAT210);

        //add classes to the list
        classReport.setClasses(classes);

        // mock the behavior of class percentage to return the value of various classes
        EasyMock.expect(classService.getClass(MAT110)).andReturn(1.20);
        EasyMock.expect(classService.getClass(MAT210)).andReturn(1.55);

        // activate the mock
        EasyMock.replay(classService);

        double projectedPassingVal = classReport.getPassedStudents();
        return projectedPassingVal == 1143;
    }
}