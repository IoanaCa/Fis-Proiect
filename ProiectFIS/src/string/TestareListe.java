package string;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestareListe {

	Lista obj;
	
	@Before
	public void setUp() throws Exception {
		obj=new Lista();
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	//testare lista de numere intregi
	@Test
	public void testlistInteger() {
		assertEquals(obj.listInteger(Arrays.asList(1,2,3,4), 2),3);
	}
	
	//testare lista de numere reale
	@Test
	public void testlistDouble() {
		assertTrue(obj.listDouble(Arrays.asList(1.2,2.5,3.7), 1) == 2.5);
	}
	
	//testare lista de numere reale 2
	@Test
	public void testlistDouble1() {
		assertFalse(obj.listDouble(Arrays.asList(1.2,2.5,3.7), 1) == 2);
	}
	
	//testare lista de string-uri
	@Test
	public void testlistString() {
		assertTrue(obj.listString(Arrays.asList("Larisa","Iulia","Albert"), 0).equals("Larisa"));
	}
	
	@Test
	public void testlistPersoana() {
		List<Persoana> pers = new ArrayList<Persoana>();
		pers.add(new Persoana("Larisa",20));
		pers.add(new Persoana("Iulia",20));
		pers.add(new Persoana("Albert",20));
		
		Persoana p=new Persoana("Iulia",20);
		
		assertTrue(obj.listPersoana(pers, 1).equals(p));
	}

}
