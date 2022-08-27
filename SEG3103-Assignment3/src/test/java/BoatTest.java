//import static org.junit.Assert.*;
//
//public class BoatTest {
//
//    @org.junit.Before
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.After
//    public void tearDown() throws Exception {
//    }
//
//    @org.junit.Test
//    public void getStateFullName() {
//    }
//
//    @org.junit.Test
//    public void getState() {
//    }
//
//    @org.junit.Test
//    public void getStateVehiculeOn() {
//    }
//
//    @org.junit.Test
//    public void turnKeyPressRightPedal() {
//    }
//
//    @org.junit.Test
//    public void pressLeftPedalTwice() {
//    }
//
//    @org.junit.Test
//    public void removeKey() {
//    }
//
//    @org.junit.Test
//    public void pressRightPedal() {
//    }
//
//    @org.junit.Test
//    public void pressLeftPedalOnce() {
//    }
//
//    @org.junit.Test
//    public void pressLeftPedal() {
//    }
//
//    @org.junit.Test
//    public void pressLeftRightPedal() {
//    }
//
//    @org.junit.Test
//    public void pressRightPedalTwice() {
//    }
//
//    @org.junit.Test
//    public void pressRightPedalOnce() {
//    }
//
//    @org.junit.Test
//    public void pressButton1OnceHoldDownBothPedals() {
//    }
//
//    @org.junit.Test
//    public void releaseRightPedal() {
//    }
//
//    @org.junit.Test
//    public void releasePedals() {
//    }
//}


import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


/**  @author Michias Shiferaw
 *  @version 2.0
 *  @since 2021-11-10
 */

public class BoatTest {
    private static double grade=0.0;
    @BeforeClass
    public static void BeforeClass() {
        System.out.println("Hello Folks");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("\nGrade for Test (out of a possible 110): " + grade);
        System.out.println("Number of Failed Tests: "+ (110-grade));

    }
    @Test
    public void testBoat() {
        System.out.println("\n---------------Test Boat--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.0;
        assertNotNull(titantic.getState());
        grade+=1.0;
    }

    @Test
    public void testGetStateFullName() {
        System.out.println("\n---------------Test StateFullName--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.0;
        assertNotNull(titantic.getState());
        grade+=1.0;
    }

    @Test
    public void testGetState() {
        System.out.println("\n---------------Test GetState--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.0;
        assertNotNull(titantic.getState());
        grade+=1.0;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertEquals("vehiculeOn", titantic.getState().toString());
        grade+=1.0;
        titantic.getStateVehiculeOn().toString();
        titantic.pressLeftPedalTwice();//shift to neutral
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        titantic.pressLeftPedal();//acceleratebackwards (hold for 5 or more seconds)
        assertFalse(titantic.pressLeftRightPedal());
        grade+=1.0;
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.0;
        assertTrue (titantic.pressLeftRightPedal());
        grade+=1.0;
        assertTrue(titantic.releasePedals());
        grade+=1.0;
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        grade+=1.0;
        titantic.pressLeftRightPedal();
        assertEquals("vehiculeOn", titantic.getState().toString());
        titantic.releasePedals();
        assertTrue(titantic.pressRightPedal());
        grade+=1.0;
    }

    @Test
    public void testGetStateVehiculeOn() {
        System.out.println("\n---------------Test Get State Vehicule On--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertEquals("vehiculeOn", titantic.getState().toString());
        grade+=1.00;
        assertEquals("park", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        titantic.pressLeftPedalTwice();//shift to neutral
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        titantic.pressLeftPedal();//acceleratebackwards (hold for 5 or more seconds)
        assertEquals("acceleratebackwards", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertFalse(titantic.pressLeftRightPedal());
        grade+=1.00;
        assertTrue(titantic.pressRightPedalOnce());
        grade+=1.00;
        assertEquals("constantspeedbackwards", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        titantic.pressLeftRightPedal();
        assertTrue(titantic.releasePedals());
        grade+=1.00;
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        grade+=1.0;
        assertTrue(titantic.pressRightPedal());
        grade+=1.00;
        assertTrue(titantic.removeKey());
        grade+=1.00;
        assertEquals("engineOff", titantic.getState().toString());
        grade+=1.00;
    }

    @Test
    public void testTurnKeyPressRightPedal() {
        System.out.println("\n---------------Testing Turn Key and Press Right Pedal--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        assertTrue(titantic.turnKeyPressRightPedal());
        assertEquals("vehiculeOn", titantic.getState().toString());
        grade+=1.00;
        assertFalse(titantic.turnKeyPressRightPedal());//already in this state
        grade+=1.00;
    }

    @Test
    public void testPressLeftPedalTwice() {
        System.out.println("\n---------------Testing Press Left Pedal Twice--------------");
        Boat titantic= new Boat();
        assertFalse(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        assertFalse(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertEquals("Null", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertFalse(titantic.pressLeftPedalTwice());
        grade+=1.00;
    }

    @Test
    public void testRemoveKey() {
        System.out.println("\n---------------Testing Remove Key--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();
        titantic.pressLeftPedalTwice();
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertTrue(titantic.pressRightPedal());
        grade+=1.00;
        assertTrue(titantic.removeKey());
        grade+=1.0;
    }

    @Test
    public void testPressRightPedal() {
        System.out.println("\n---------------Testing Press Right Pedal--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        assertFalse(titantic.pressRightPedal());
        grade+=1.00;
        assertTrue(titantic.turnKeyPressRightPedal());// turn on Boat, into park gear)
        grade+=1.00;
        assertEquals("vehiculeOn", titantic.getState().toString());
        grade+=1.00;
        assertFalse(titantic.releasePedals());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertTrue(titantic.pressRightPedal());
        grade+=1.00;
        assertEquals("park", titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testPressLeftPedalOnce() {
        System.out.println("\n---------------Testing Press Left Pedal ONCE--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalOnce());
        grade+=1.00;
        assertEquals("accelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testPressLeftPedal() {
        System.out.println("\n---------------Testing Press Left Pedal --------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedal());
        grade+=1.00;
        assertEquals("acceleratebackwards", titantic.getStateVehiculeOn().toString());
        grade+=1.00;

    }

    @Test
    public void testPressLeftRightPedal() {
        System.out.println("\n---------------Testing Press Left Right Pedal--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertFalse(titantic.pressLeftRightPedal());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalOnce());
        grade+=1.00;
        assertEquals("accelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertTrue(titantic.pressLeftRightPedal());
        grade+=1.00;
        assertEquals("brake",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testPressRightPedalTwice() {
        System.out.println("\n---------------Testing Press Right Pedal Twice--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertFalse(titantic.pressLeftRightPedal());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalOnce());
        grade+=1.00;
        assertEquals("accelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertTrue(titantic.pressRightPedalTwice());
        grade+=1.00;
        assertEquals("deaccelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testPressRightPedalOnce() {
        System.out.println("\n---------------Testing Press Right Pedal ONCE--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        titantic.pressLeftRightPedal();
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.00;
        assertTrue(titantic.pressLeftPedalOnce());
        grade+=1.00;
        assertEquals("accelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertTrue(titantic.pressRightPedalOnce());
        grade+=1.00;
        assertEquals("constantspeedforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testPressButton1OnceHoldDownBothPedals() {
        System.out.println("\n---------------Testing Pressing Button 1 and Holding Both Pedals--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertFalse(titantic.pressLeftRightPedal());
        grade+=1.00;
        titantic.pressLeftPedalTwice();
        titantic.pressLeftPedalOnce();
        assertEquals("accelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertTrue(titantic.pressRightPedalOnce());
        grade+=1.00;
        assertEquals("constantspeedforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertTrue(titantic.pressButton1OnceHoldDownBothPedals());
        grade+=1.00;
        assertFalse(titantic.releasePedals());
        grade+=1.00;
        assertTrue(titantic.releaseRightPedal());
        grade+=1.00;
        assertEquals("constantspeedforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testReleaseRightPedal() {
        System.out.println("\n---------------Testing Release Right Pedal--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
        assertNotNull(titantic.getState());
        grade+=1.00;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertFalse(titantic.pressLeftRightPedal());
        grade+=0.50;
        titantic.pressLeftPedalTwice();
        titantic.pressLeftPedalOnce();
        assertEquals("accelerateforward",titantic.getStateVehiculeOn().toString());
        grade+=0.50;
        assertTrue(titantic.pressRightPedalOnce());
        grade+=0.50;
        assertEquals("constantspeedforward",titantic.getStateVehiculeOn().toString());
        grade+=0.50;
        assertTrue(titantic.pressButton1OnceHoldDownBothPedals());
        grade+=1.00;
        assertFalse(titantic.releasePedals());
        grade+=1.00;
        assertTrue(titantic.releaseRightPedal());
        grade+=1.00;
        assertEquals("constantspeedforward",titantic.getStateVehiculeOn().toString());
        grade+=1.00;
    }

    @Test
    public void testReleasePedals() {
        System.out.println("\n---------------Testing Release Pedals--------------");
        Boat titantic= new Boat();
        assertEquals("Null",titantic.getStateVehiculeOn().toString());
        grade+=1.0;
        assertNotNull(titantic.getState());
        grade+=1.0;
        titantic.turnKeyPressRightPedal();// turn on Boat, into park gear
        assertEquals("vehiculeOn", titantic.getState().toString());
        grade+=1.0;
        titantic.getStateVehiculeOn().toString();
        titantic.pressLeftPedalTwice();//shift to neutral
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        titantic.pressLeftPedal();//acceleratebackwards (hold for 5 or more seconds)
        assertFalse(titantic.pressLeftRightPedal());
        grade+=1.0;
        assertTrue(titantic.pressLeftPedalTwice());
        grade+=1.0;
        assertTrue (titantic.pressLeftRightPedal());
        grade+=1.0;
        assertTrue(titantic.releasePedals());
        grade+=1.0;
        assertEquals("neutral", titantic.getStateVehiculeOn().toString());
        grade+=1.0;

    }

}

