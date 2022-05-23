package string;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Test;

public class TestToken {

	
	// testarea cand sirul este delimitat de un singur spatiu
	@Test
	public void testSpatiu() {
		String sir = "this is something";
		StringTokenizer st = new StringTokenizer(sir);
		String[] s = sir.split(" ");
		int nr = 0;
		while (st.hasMoreTokens()) {
			assertTrue(st.nextToken().equals(s[nr]));
			nr++;
		}
	}

	// testarea cand sirul e null
	@Test
	public void testNull() {
		String sir = "";
		StringTokenizer st = new StringTokenizer(sir);
		while (st.hasMoreTokens()) {
			assertTrue(st.nextToken().equals(null));
		}
	}

	// testarea cu delimitator mai multe spatii
	@Test
	public void testTab() {
		String sir = "this	is	something";
		StringTokenizer st = new StringTokenizer(sir);
		assertTrue(st.countTokens() == 3);
	}

	// testarea functiei countTokens
	@Test
	public void testNrCuv() {
		String sir = "this is something";
		StringTokenizer st = new StringTokenizer(sir);
		assertTrue(st.countTokens() == 3);
	}

	// testarea cu delimitator asignat . (punct)
	@Test
	public void testPunct() {
		String sir = "this.is.something";
		StringTokenizer st = new StringTokenizer(sir, ".");
		assertTrue(st.countTokens() == 3);
	}

	// testarea cu delimitator format din mai multe caractere
	@Test
	public void testMaiMulte() {
		String sir = "this.;is.;something";
		StringTokenizer st = new StringTokenizer(sir, ".;");
		assertTrue(st.countTokens() == 3);

	}

	// testarea cu mai multe delimitatoare pe acelasi sir
	@Test
	public void testMaiMulte2() {
		String sir = "this.is;something";
		StringTokenizer st = new StringTokenizer(sir, ".;");
		assertTrue(st.countTokens() == 3);
	}

	// testarea functiei nextToken cu delimitator default
	@Test
	public void testNextToken() {
		String sir = "this is something";
		StringTokenizer st = new StringTokenizer(sir);
		assertTrue(st.nextToken().equals("this"));
	}

	// testarea functiei nextToken cu delimitator asignat
	@Test
	public void testNextToken2() {
		StringTokenizer st = new StringTokenizer("this?is?something?", "?");
		assertTrue(st.nextToken().equals("this"));
	}

	// testarea functiei NextElement cu delimitator default
	@Test
	public void testNextElement() {
		String sir = "this is something";
		StringTokenizer st = new StringTokenizer(sir);
		assertTrue(st.nextElement().equals("this"));
	}

	// testarea functiei nextElement cu delimitator asignat
	@Test
	public void testNextElement2() {
		StringTokenizer st = new StringTokenizer("this--is-something", "-");
		st.nextElement();
		assertTrue(st.nextElement().equals("is"));
	}

	// testarea functiei hasMoreTokens cand mai exista elemente
	@Test
	public void testMoreTokens() {
		String sir = "this is something";
		StringTokenizer st = new StringTokenizer(sir);
		st.nextToken();
		assertTrue(st.hasMoreTokens() == true);
	}

	// testarea functiei hasMoreTokens cand nu mai exista elemente
	@Test
	public void testMoreTokens2() {
		String sir = "this ";
		StringTokenizer st = new StringTokenizer(sir);
		st.nextToken();
		assertTrue(st.hasMoreTokens() == false);
	}

	// testarea functiei hasMoreElements cand mai exista elemente
	@Test
	public void testMoreElements() {
		String sir = "this is something";
		StringTokenizer st = new StringTokenizer(sir);
		st.nextToken();
		assertTrue(st.hasMoreElements() == true);
	}

	// testarea functiei hasMoreElements cand nu mai exista elemente
	@Test
	public void testMoreElements2() {
		String sir = "";
		StringTokenizer st = new StringTokenizer(sir);
		assertTrue(st.hasMoreElements() == false);
	}

	// testarea constructorului StringTokenizer cu al treilea parametru true
	@Test
	public void testBoolean() {
		StringTokenizer st = new StringTokenizer("this-and-this-and that are something", "-", true);
		assertTrue(st.countTokens() == 7);
	}

	// testarea constructorului StringTokenizer cu al treilea parametru false
	@Test
	public void testBoolean2() {
		StringTokenizer st = new StringTokenizer("this-and-this-and that are something", "-", false);
		assertTrue(st.countTokens() == 4);
	}

}
