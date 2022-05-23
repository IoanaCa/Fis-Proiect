import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class Testare {
	CreeazaEv obj;
	
	@Before
	void setUp() throws Exception {
		obj = new CreeazaEv();
	}

	@After
	void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testMain() {
		System.out.println("main");
		String[] args=null;
		CreeazaEv.main(args);
	}
	
	@Test
	public void testCheck() {
		
	}

}
