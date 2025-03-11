package com.metacube.junit.JUnitAssignment;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArrOperationTest {

	public static final ArrOperation ao = new ArrOperation();
	@Test
	public void maxMirrorTest() {
		assertEquals(3, ao.MaxMirror(new int[] {1, 2, 3, 8, 9, 3, 2, 1}));
		assertEquals(2, ao.MaxMirror(new int[] {7, 1, 4, 9, 7, 4, 1}));
		assertEquals(3,ao.MaxMirror(new int[] {1, 2, 1, 4}));
		assertEquals(7, ao.MaxMirror(new int[] {1, 4, 5, 3, 5, 4, 1}));
		assertThrows(AssertionError.class,()->ao.MaxMirror(new int [] {}));
	}
	
	@Test
	public  void maxMirrorTestNull() {
		assertThrows(NullPointerException.class, () -> ao.MaxMirror(null));
	}
	@Test
	public void countClumpsTest() {
		assertEquals(2, ao.CountClumps(new int[]{1, 2, 2, 3, 4, 4}));
		assertEquals(2, ao.CountClumps(new int[] {1, 1, 2, 1, 1}));
		assertEquals(1 , ao.CountClumps(new int[] {1, 1, 1, 1, 1}));
		assertThrows(AssertionError.class,()->ao.CountClumps(new int [] {}));
	}
	@Test
	public  void countClumpsTestNull() {
		assertThrows(NullPointerException.class, () -> ao.CountClumps(null));
	}
	@Test
	public void fixXYTest() {
		assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9},ao.fixXY(4, 5, new int[] {5, 4, 9, 4, 9, 5}));
		assertArrayEquals(new int[]{1, 4, 5, 1},ao.fixXY(4, 5, new int[] {1, 4, 1, 5}));
		assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5},ao.fixXY(4, 5, new int[] {1, 4, 1, 5, 5, 4, 1}));
		assertThrows(AssertionError.class,()->ao.fixXY(4,5,new int [] {}));
		assertThrows(AssertionError.class,()->ao.fixXY(4,4,new int [] {}));
		assertThrows(AssertionError.class,()->ao.fixXY(4,5,new int [] {4,0,1,3}));
		assertThrows(AssertionError.class,()->ao.fixXY(4,5,new int [] {0}));
		
	}
	
	@Test
	public void splitArrayTest() {
		assertEquals(3,ao.splitArray(new int[] {1, 1, 1, 2, 1}));
		assertEquals(-1,ao.splitArray(new int[] {2, 1, 1, 2, 1}));
		assertEquals(1,ao.splitArray(new int[] {10, 10}));
		assertThrows(AssertionError.class,()->ao.splitArray(new int [] {}));
		
	}
	@Test
	public void splitArrayTestNull() {
		assertThrows(NullPointerException.class,()->ao.splitArray(null) );
	}
	
}
