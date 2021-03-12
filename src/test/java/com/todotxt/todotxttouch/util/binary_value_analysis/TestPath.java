package com.todotxt.todotxttouch.util.binary_value_analysis;
import static com.todotxt.todotxttouch.util.Path.fileName;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestPath {
	
//	
//	/*
//	 * Partition P1
//	 * String path = null
//	*/
//	
	
//	@Test
//	public void P1T1() {
//		assertEquals("",fileName(null));
//	}
//	
//	
//	/*
//	 * Partition P2
//	 * String path = ""
//	*/
//
	
//	@Test
//	public void P2T2() {
//		assertEquals("",fileName(""));
//	}
	
//	
//	/*
//	 * Partition P3
//	 * String path = "    "
//	*/
//
	
//	
//	@Test
//	public void P3T3() {
//		assertEquals("",fileName("   "));
//	}
	
//	
//	/*
//	 * Partition P4WI
//	 * String path contem {"<",">",":","?"}
//	*/
//
	
	
//	@Test(expected = Exception.class) // caracter invalido eh esperada alguma excepcao, contudo nao ha documentacao
//	public void P4WIT4() {
//		assertEquals("",fileName("input<incorreto"));
//	}
//	
//	@Test(expected = Exception.class) // caracter invalido eh esperada alguma excepcao, contudo nao ha documentacao
//	public void P4WIT5() {
//		assertEquals("",fileName("input>incorreto"));
//	}
//	
//	@Test(expected = Exception.class) // caracter invalido eh esperada alguma excepcao, contudo nao ha documentacao
//	public void P4WIT6() {
//		assertEquals("",fileName("input:incorreto"));
//	}
//	
//	@Test(expected = Exception.class) // caracter invalido eh esperada alguma excepcao, contudo nao ha documentacao
//	public void P4WIT7() {
//		assertEquals("",fileName("input?incorreto"));
//	}
	
//	@Test(expected = Exception.class) // Nome invalido no S.O. Windows
//	public void P4WIT8() {
//		assertEquals("",fileName("Nul"));
//	}
	
//	
//	/*
//	 * Partition P4WV
//	*/
//
	
	
//	@Test
//	public void P4WVT9() {
//		assertEquals("correto",fileName("correto"));
//	}
//	
//	@Test
//	public void P4WVT10() {//invalido em linux
//		assertEquals("correto",fileName("input/correto"));
//	}
	
//	@Test
//	public void P4WVT11() {
//		assertEquals("ola",fileName("ola/"));
//	}
	
//	
	
//	@Test(expected = Exception.class)
//	public void P4LIT12() { //caracter invalido em linux eh esperada alguma excepcao, contudo nao ha documentacao
//		assertEquals("input/correto",fileName("input/incorreto"));
//	}
	
//	@Test
//	public void P4LVT13() {
//		assertEquals("input<incorreto",fileName("input<incorreto"));
//	}
//	
//	@Test
//	public void P4LV14() {
//		assertEquals("input>incorreto",fileName("input>incorreto"));
//	}
//	
//	@Test
//	public void P4LV15() {
//		assertEquals("input:incorreto",fileName("input:incorreto"));
//	}
//	
//	@Test
//	public void P4LV16() {
//		assertEquals("input?incorreto",fileName("input?incorreto"));
//	}
	
//	@Test
//	public void P4LV17() {// duas \\ necessarias para teste
//		assertEquals("n",fileName("input?incorreto\\n"));
//	}
	
}
