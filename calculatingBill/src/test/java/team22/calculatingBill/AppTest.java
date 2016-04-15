package team22.calculatingBill;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private static final String SILVER = "silver";
	private static final String GOLD = "gold";
	@Test
     public void testApp()
    {
        assertTrue( true );
    }
	@Test
    public void baseSilvertest(){
        CallBill callSilver1 = new CallBill(SILVER, 0, 60);        
        int testSilver1 = callSilver1.totalBill();
      
        assertEquals(39000,testSilver1);
     }
	@Test
    public void lineAdditionSilvertest(){
        CallBill callSilver2 = new CallBill(SILVER, 1, 60);
        int testSilver2 = callSilver2.totalBill();
        
        assertEquals(78000,testSilver2);
    }
	@Test
    public void line2AdditionSilvertest(){
        CallBill callSilver3 = new CallBill(SILVER, 2, 60);
        int testSilver3 = callSilver3.totalBill();
        
        assertEquals(117000,testSilver3);
    }
	@Test
    public void discountLine3Silvertest(){
        CallBill callSilver4 = new CallBill(SILVER, 3, 60);
        int testSilver4 = callSilver4.totalBill();
        
        assertEquals(154000,testSilver4);
    }
	@Test
    public void discountLine4Silvertest(){
        CallBill callSilver5 = new CallBill(SILVER, 4, 60);
        int testSilver5 = callSilver5.totalBill();
        
        assertEquals(192000,testSilver5);
    }
	@Test
    public void discountLine5Silvertest(){
        CallBill callSilver6 = new CallBill(SILVER, 5, 60);
        int testSilver6 = callSilver6.totalBill();
    
        assertEquals(230000,testSilver6);
    }
	@Test
    public void baseGoldtest(){
        CallBill callGold1 = new CallBill(GOLD, 0, 60);        
        int testGold1 = callGold1.totalBill();
      
        assertEquals(59000,testGold1);
     }
	@Test
    public void lineAdditionGoldtest(){
        CallBill callGold2 = new CallBill(GOLD, 1, 60);
        int testGold2 = callGold2.totalBill();
        
        assertEquals(89000,testGold2);
    }
	@Test
    public void line2AdditionGoldtest(){
        CallBill callGold3 = new CallBill(GOLD, 2, 60);
        int testGold3 = callGold3.totalBill();
        
        assertEquals(119000,testGold3);
    }
	@Test
    public void discountLine3Goldtest(){
        CallBill callGold4 = new CallBill(GOLD, 3, 60);
        int testGold4 = callGold4.totalBill();
        
        assertEquals(147000,testGold4);
    }
	@Test
    public void discountLine4Goldtest(){
        CallBill callGold5 = new CallBill(GOLD, 4, 60);
        int testGold5 = callGold5.totalBill();
        
        assertEquals(176000,testGold5);
    }
	@Test
    public void discountLine5Goldtest(){
        CallBill callGold6 = new CallBill(GOLD, 5, 60);
        int testGold6 = callGold6.totalBill();
    
        assertEquals(205000,testGold6);
    }
	@Test
	public void extraTimeGoldtest(){
	    CallBill callGold7 = new CallBill("gold", 0, 130);
	    int testGold7 = callGold7.totalBill();
	    assertEquals(63500,testGold7);
	}
	@Test
	public void extraTimeLine1Goldtest(){
	    CallBill callGold8 = new CallBill("gold", 1, 130);
	    int testGold8 = callGold8.totalBill();
	    assertEquals(93500,testGold8);
	}
	@Test
	public void extraTimeLine3DiscountGold(){
		CallBill callGold9 = new CallBill("gold", 3, 130);
		int testGold9 = callGold9.totalBill();
	       
		assertEquals(121500,testGold9);
	}
	@Test
	public void extraTimeLine4DiscountGold(){
		CallBill callGold10 = new CallBill("gold", 4, 130);
		int testGold10 = callGold10.totalBill();
	       
		assertEquals(180500,testGold10);
	}
	@Test
	public void extraTimeLine5DiscountGold(){
		CallBill callGold11 = new CallBill("gold", 5, 130);
		int testGold11 = callGold11.totalBill();
	       
		assertEquals(209500,testGold11);
	}
}