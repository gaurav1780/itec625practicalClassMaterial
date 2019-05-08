package itec625methodsWorkshop;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllInOneTest {

	@Test
	public void testSmaller() {
		assertEquals(5, AllInOne.smaller(5,  8));
		assertEquals(4, AllInOne.smaller(9,  4));
		assertEquals(6, AllInOne.smaller(6,  6));
		assertEquals(-3, AllInOne.smaller(-3,  -1));
	}

//	@Test
//	public void testSameOddity() {
//		assertTrue(AllInOne.sameOddity(12,  24));
//		assertTrue(AllInOne.sameOddity(-12,  24));
//		assertTrue(AllInOne.sameOddity(13,  25));
//		assertTrue(AllInOne.sameOddity(-13,  25));
//		assertFalse(AllInOne.sameOddity(13,  24));
//		assertFalse(AllInOne.sameOddity(12,  25));
//	}

	@Test
	public void testSum() {
		assertEquals(21, AllInOne.sum(6));
		assertEquals(55, AllInOne.sum(10));
		assertEquals(1, AllInOne.sum(1));
	}

	@Test
	public void testMaxDigit() {
		assertEquals(6, AllInOne.maxDigit(614));
		assertEquals(8, AllInOne.maxDigit(1238));
		assertEquals(0, AllInOne.maxDigit(0));
		assertEquals(1, AllInOne.maxDigit(1000000));
	}

	@Test
	public void testGetDigit() {
		assertEquals(2, AllInOne.getDigit(172,0));
		assertEquals(7, AllInOne.getDigit(172,1));
		assertEquals(1, AllInOne.getDigit(172,2));
		assertEquals(9, AllInOne.getDigit(1239321,3));
	}

	@Test
	public void testIsPrime() {
		assertTrue(AllInOne.isPrime(37));
		assertTrue(AllInOne.isPrime(71));
		assertTrue(AllInOne.isPrime(97));
		assertTrue(AllInOne.isPrime(101));
		assertTrue(AllInOne.isPrime(103));
		assertFalse(AllInOne.isPrime(143));
		assertFalse(AllInOne.isPrime(-2));
		assertFalse(AllInOne.isPrime(0));
		assertFalse(AllInOne.isPrime(1));
		assertFalse(AllInOne.isPrime(37*37));
		assertFalse(AllInOne.isPrime(103*101));
	}

	@Test
	public void testPrimeProduct() {
		assertEquals(323323, AllInOne.primeProduct(6, 19));
		assertEquals(30, AllInOne.primeProduct(1,6));
		assertEquals(30*7, AllInOne.primeProduct(1,10));
		assertEquals(210*11, AllInOne.primeProduct(2,11));
	}

	@Test
	public void testAndSelectedBits() {
		assertEquals(20, AllInOne.andSelectedBits(119, 95, 2, 5));
	}

}
