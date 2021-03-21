package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

class RadnjaTest {
	
	protected Radnja radnja;

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDodajGumu() {
		AutoGuma guma = new AutoGuma("Goodyear 12", 14, 150, 80);
		radnja.dodajGumu(guma);
		
		assertEquals(1, radnja.vratiSveGume().size());
		assertEquals(guma, radnja.pronadjiGumu("Goodyear 12").get(0));
	}
	
	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class, () -> radnja.dodajGumu(null));
	}
	
	@Test
	void testDodajGumuPostoji() {
		AutoGuma guma = new AutoGuma("Goodyear 12", 14, 150, 80);
		radnja.dodajGumu(guma);
		AutoGuma g2 = new AutoGuma("Goodyear 12", 14, 150, 80);
		assertThrows(java.lang.RuntimeException.class, () -> radnja.dodajGumu(g2));
	}
	
	@Test
	void testPronadjiGumu() {
		AutoGuma guma1 = new AutoGuma("Goodyear 12", 14, 150, 80);
		radnja.dodajGumu(guma1);
		AutoGuma guma2 = new AutoGuma("Goodyear 11", 14, 150, 80);
		radnja.dodajGumu(guma2);
		
		assertEquals(1, radnja.pronadjiGumu("Goodyear 12").size());
		assertEquals(guma1, radnja.pronadjiGumu("Goodyear 12").get(0));
	}
	
	@Test
	void testPronadjiGumuNull() {
		LinkedList<AutoGuma> gume = radnja.pronadjiGumu(null);
		assertNull(gume);
	}
	
	@Test
	void testPronadjiGumuPrazna() {
		assertThrows(java.lang.RuntimeException.class, () -> radnja.pronadjiGumu("Goodyear"));
	}
	
	@Test 
	void testPronadjiGumuIstaMarka(){
		AutoGuma guma1 = new AutoGuma("Goodyear 12", 14, 150, 80);
		radnja.dodajGumu(guma1);
		AutoGuma guma2 = new AutoGuma("Goodyear 12", 13, 140, 80);
		radnja.dodajGumu(guma2);
		assertEquals(2, radnja.pronadjiGumu("Goodyear 12").size());
		assertEquals(guma1, radnja.pronadjiGumu("Goodyear 12").get(1));
		assertEquals(guma2, radnja.pronadjiGumu("Goodyear 12").get(0));
	}
	
	@Test
	void testVratiSveGume() {
		AutoGuma guma1 = new AutoGuma("Goodyear 12", 14, 150, 80);
		radnja.dodajGumu(guma1);
		AutoGuma guma2 = new AutoGuma("Goodyear 12", 13, 140, 80);
		radnja.dodajGumu(guma2);
		assertEquals(2, radnja.vratiSveGume().size());
		
	}
	
	@Test
	void testVratiSveGumePrazna() {
		assertThrows(java.lang.RuntimeException.class, () -> radnja.vratiSveGume());
	}

}
