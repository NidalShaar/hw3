/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Batma
 */
public class HWTest {
    
    public HWTest() {
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
   public void testadd(){
       HW3T y=new HW3T();
    y.func(1);
    y.func(1);
    y.func(1);
    int b=0;
    for (int i=0;i<y.count.size();i++){
        b=b+y.count.get(i);
    }
    assertEquals(3,b);
   }
    @Test
	    public void count1() {
	    HW3T c=new HW3T();
	    int z =0;
	    int y=0;
            for (int i=0;i<4;i++){
                 c.func(1);
                 c.func2(50);
            }
	    for(int i=0;i<c.count.size();i++){
	        z=z+c.count.get(i);
	        y=y+c.price.get(i);
	    }
	    assertEquals(4,z);
	    assertEquals(200, y);
	    }
             @Test
	    public void count2() {
	    HW3T c=new HW3T();
	    int z =0;
	    
	    for(int i=0;i<c.count.size();i++){
	        z=z+c.count.get(i);
	       
	    }
	    assertEquals(0,z);
	    }
}
  
	
	 
	 
	
	 
	 
	 
	
	
