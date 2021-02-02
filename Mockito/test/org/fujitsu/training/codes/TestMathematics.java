package org.fujitsu.training.codes;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMathematics {
	
	@org.mockito.Mock
	private Mathematics math;
	
	@Spy
	private Mathematics mathSpy;
	
	@org.mockito.Mock
	private ArrayList<String> arList;
	
	@BeforeEach
	public void setup() {
		
	}
	
	@AfterEach
	public void teardown() {
		
	}
	
	@Test
	public void testDiv01() {
		when(math.div(10, 0)).thenReturn(0);
		when(math.div(10, 10)).thenReturn(20);
		when(math.div(10, 10)).thenReturn(20);
		
		System.out.println(math.div(10, 0));
		System.out.println(math.div(10, 10));
	}
	
	@Test
	public void testDiv02() {
		
		doReturn(0).when(mathSpy).div(10, 0);
		
		System.out.println(mathSpy.div(10, 0));
	}
	
	@Test
	public void testDiv03() {
		
		doReturn("Fe").when(arList).get(0);	
		Assertions.assertEquals("Fe", arList.get(0));
	}
	
	@Test
	public void testDiv04() {
		
		when(math.div(10, 0)).thenThrow(ArithmeticException.class);
		
		Assertions.assertThrows(ArithmeticException.class, ()->{
			math.div(10,0);
		});
	}
	
	@Test
	public void testDiv05() {
		
		//doNothing().when(math).display();
		//math.display();
		
	}
	

}
