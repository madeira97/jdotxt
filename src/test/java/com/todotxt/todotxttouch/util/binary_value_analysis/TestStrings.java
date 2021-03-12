package com.todotxt.todotxttouch.util.binary_value_analysis;
import static com.todotxt.todotxttouch.util.Strings.insertPaddedIfNeeded;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStrings {
	
	/*
	 * Partition 1A
	 * String s = ""
	 * Integer insertAt between(0,1)
	 * String stringToInsert between(null, "", "a")
	 */
	
	
//	@Test
//	public void P1AT1WithDifferentStrings() {
//		assertEquals("a ",insertPaddedIfNeeded("",0,"a"));
//	}
//	
//	@Test
//	public void P1AT2WithEqualStrings() {
//		assertEquals("",insertPaddedIfNeeded("",0,""));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P1AT3WithDifferentStrings() {
//		assertEquals("a ",insertPaddedIfNeeded("",1,"a"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P1AT4() { //nao se sabe qual a ordem de tratamento do input: tratar indice ou ultimo parametro. resultado do teste esta dependente disso
//		assertEquals("",insertPaddedIfNeeded("",1,""));
//	}
//	
//	@Test
//	public void P1AT5WithNullString() {
//		assertEquals("",insertPaddedIfNeeded("",0,null));
//	}
//	
//	@Test
//	public void P1AT6WithNullString() {
//		assertEquals("",insertPaddedIfNeeded("",1,null));
//	}
	
	/*
	 * Partition 2A
	 * String s = "a"
	 * Integer insertAt between(0,1,2)
	 * String stringToInsert between(null, "b", "a") 
	 */
	
//	@Test
//	public void P2AT7WithDifferentStrings() {
//		assertEquals("b a",insertPaddedIfNeeded("a",0,"b"));
//	}
//	
//	@Test
//	public void P2AT8() {
//		assertEquals("a ",insertPaddedIfNeeded("a",0,"a"));
//	}
//	
//	@Test
//	public void P2AT9WithDifferentStrings() {
//		assertEquals("a b ",insertPaddedIfNeeded("a",1,"b"));
//	}
//	
//	@Test
//	public void P2AT10() {
//		assertEquals("a",insertPaddedIfNeeded("a",1,"a"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2AT11WithDifferentStrings() {
//		assertEquals("a ",insertPaddedIfNeeded("a",2,"b"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2AT12() {
//		assertEquals("a ",insertPaddedIfNeeded("a",2,"a"));
//	}
//	
//	@Test
//	public void P2AT13WithNullString() { // nao se sabe o que devolver neste caso
//		assertEquals("a",insertPaddedIfNeeded("a",0,null));
//	}
//	
//	@Test
//	public void P2AT14WithNullString() { // nao se sabe o que devolver neste caso
//		assertEquals("a",insertPaddedIfNeeded("a",1,null));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2AT15WithNullString() {
//		assertEquals("a",insertPaddedIfNeeded("a",2,null));
//	}
	
	/*
	 * Partition 3A
	 * String s = "aaa"
	 * Integer insertAt between(0,1,2)
	 * String stringToInsert between(null, "bbb", "aaa") 
	*/

	
//	@Test
//	public void P3AT16WithDifferentStrings() {
//		assertEquals("bbb aaa",insertPaddedIfNeeded("aaa",0,"bbb"));
//	}
//	
//	@Test
//	public void P3AT17() {
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",0,"aaa"));
//	}
//	
//	@Test
//	public void P3AT18WithDifferentStrings() {
//		assertEquals("aaa bbb ",insertPaddedIfNeeded("aaa",3,"bbb"));
//	}
//	
//	@Test
//	public void P3AT19() {//deveria devolver a string inicial, contudo devolve string com espaco
//		assertEquals("aaa",insertPaddedIfNeeded("aaa",3,"aaa"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P3AT20WithDifferentStrings() {
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",4,"bbb"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P3AT21() {
//		assertEquals("aaa",insertPaddedIfNeeded("aaa",4,"aaa"));
//	}
//	
//	@Test
//	public void P3AT22WithNullString() { // nao se sabe o que devolver neste caso
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",0,null));
//	}
//	
//	@Test
//	public void P3AT23WithNullString() {
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",3,null));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P3AT24WithNullString() { // de acordo com a documentacao, seria excepcao
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",4,null));
//	}
//	
//	/*
//	 * Partition 4A
//	 * String s = null
//	 * Integer insertAt between(0,1)
//	 * String stringToInsert between(null, "a")
//	*/
//
//	
//	@Test
//	public void P4AT25WithDifferentStrings() { // nao se sabe o que devolver nesta situacao, a partir da documentacao
//		assertEquals("aaa ",insertPaddedIfNeeded(null,0,"a"));
//	}
//	
//	@Test
//	public void P4AT26() {// nao se sabe o que devolver nesta situacao, a partir da documentacao
//		assertEquals("bbb aaa",insertPaddedIfNeeded(null,1,"a"));
//	}
//	
//	@Test
//	public void P4AT27BothStringsNull() {// nao se sabe o que devolver nesta situacao, a partir da documentacao
//		assertEquals("aaa ",insertPaddedIfNeeded(null,0,null));
//	}
//	
//	@Test
//	public void P4AT28BothStringsNull() {// nao se sabe o que devolver nesta situacao, a partir da documentacao
//		assertEquals("bbb aaa",insertPaddedIfNeeded(null,1,null));
//	}
//	
//	/*
//	 * Partition 1B
//	 * String s = ""
//	 * Integer insertAt=-1
//	 * String stringToInsert between(null,"", "a")
//	*/
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P1BT29WithDifferentStrings() {
//		assertEquals("aaa ",insertPaddedIfNeeded("",-1,"a"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P1BT30() {//nao se sabe qual a ordem de tratamento do input: tratar indice ou ultimo parametro. resultado do teste esta dependente disso
//		assertEquals("",insertPaddedIfNeeded("",-1,""));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P1BT31WithNullString() {
//		assertEquals("",insertPaddedIfNeeded("",-1,null));
//	}
//	
//	/*
//	 * Partition 2B
//	 * String s = "a"
//	 * Integer insertAt=-1
//	 * String stringToInsert between(null,"b", "a")
//	*/
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2BT32WithDifferentStrings() {
//		assertEquals("",insertPaddedIfNeeded("a",-1,"b"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2BT33() {//nao se sabe qual a ordem de tratamento do input: tratar indice ou ultimo parametro. resultado do teste esta dependente disso
//		assertEquals("",insertPaddedIfNeeded("a",-1,"a"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2BT34WithNullString() {
//		assertEquals("",insertPaddedIfNeeded("a",-1,null));
//	}
//	
//	/*
//	 * Partition 3B
//	 * String s = "aaa"
//	 * Integer insertAt=-1
//	 * String stringToInsert between(null,"bbb", "aaa")
//	*/
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2BT35WithDifferentStrings() {
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",-1,"bbb"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2BT36() {//nao se sabe qual a ordem de tratamento do input: tratar indice ou ultimo parametro. resultado do teste esta dependente disso
//		assertEquals("bbb aaa",insertPaddedIfNeeded("aaa",-1,"aaa"));
//	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void P2BT37WithNullString() {
//		assertEquals("aaa ",insertPaddedIfNeeded("aaa",-1,null));
//	}
//	
//	/*
//	 * Partition 4B
//	 * String s = null
//	 * Integer insertAt=-1
//	 * String stringToInsert between(null,"a")
//	*/
//	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P2BT38WithDifferentStrings() {
		assertEquals("aaa ",insertPaddedIfNeeded(null,-1,"a"));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void P2BT39WithNullString() {
		assertEquals("aaa ",insertPaddedIfNeeded(null,-1,null));
	}
	
}
