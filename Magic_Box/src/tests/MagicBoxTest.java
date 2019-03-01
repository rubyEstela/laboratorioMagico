package tests;


	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;

import model.MagicBox;

import static org.junit.Assert.*;

	
	public class MagicBoxTest {
	   
	   public MagicBoxTest() {
	   }
	   
	   @BeforeClass
	   public static void setUpClass() {
	   }
	   
	   @AfterClass
	   public static void tearDownClass() {
	   }
	   
	   @Before
	   public void setUp() {
	   }
	   
	   @After
	   public void tearDown() {
	   }

	   
	   @Test
	   public void testMain() {
	      System.out.println("main");
	      String[] args = null;
	      MagicBox.main(args);

	      fail("The test case is a prototype.");
	   }

	   
	   @Test
	   public void testSumaTotal1() {
	      System.out.println("sumaTotal1");
	      MagicBox instance = new MagicBox();
	      int expResult = 0;
	      int result = instance.sumaTotal1();
	      assertEquals(expResult, result);
	      // TODO review the generated test code and remove the default call to fail.
	      fail("The test case is a prototype.");
	   }

	   
	   @Test
	   public void testSumanFila() {
	      System.out.println("sumanFila");
	      MagicBox instance = new MagicBox();
	      boolean expResult = false;
	      boolean result = instance.sumanFila();
	      assertEquals(expResult, result);
	    
	      fail("The test case is a prototype.");
	   }

	
	   @Test
	   public void testSumanColumna() {
	      System.out.println("sumanColumna");
	      MagicBox instance = new MagicBox();
	      boolean expResult = false;
	      boolean result = instance.sumanColumna();
	      assertEquals(expResult, result);
	      
	      fail("The test case is a prototype.");
	   }
	   
	}

