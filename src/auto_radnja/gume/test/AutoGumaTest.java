package auto_radnja.gume.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import auto_radnja.gume.AutoGuma;

class AutoGumaTest {

	AutoGuma guma;
	@BeforeEach
	void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		guma = null;
	}
	
	@Test
	void testAutoGuma() {
		AutoGuma nova = new AutoGuma();
		assertNotNull(nova);
	}
	
	@Test
	void testAutoGumaParametri() {
		AutoGuma nova = new AutoGuma("Goodyear", 14, 150, 80);
		assertNotNull(nova);
	}

	@Test
	void testSetMarkaModel() {
		guma.setMarkaModel("Goodyear 12");
		assertEquals("Goodyear 12", guma.getMarkaModel());
	}
	
	@Test
	void testSetMarkaModelNull() {
		assertThrows(java.lang.NullPointerException.class , () -> guma.setMarkaModel(null));
	}
	
	@Test
	void testSetMarkaModelDuzina() {
		assertThrows(java.lang.RuntimeException.class , () -> guma.setMarkaModel("gy"));
	}
	
	@ParameterizedTest
	@CsvSource({
		"14", "15", "16"
	})
	void testSetPrecnik(int precnik) {
		guma.setPrecnik(precnik);
		assertEquals(precnik, guma.getPrecnik());
	}
	
	@ParameterizedTest
	@CsvSource({
		"1", "7", "26", "89"
	})
	void testSetPrecnikVanOpsega(int precnik) {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setPrecnik(precnik));
	}
	
	@ParameterizedTest
	@CsvSource({
		"159", "180", "300", "227", "355"
	})
	void testSetSirina(int sirina) {
		guma.setSirina(sirina);
		assertEquals(sirina, guma.getSirina());
	}
	
	@ParameterizedTest
	@CsvSource({
		"892", "111", "125", "12", "356"
	})
	void testSetSirinaVanOpsega(int sirina) {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setSirina(sirina));
	}
	
	
	@ParameterizedTest
	@CsvSource({
		"89", "50", "25"
	})
	void testSetVisina(int visina) {
		guma.setVisina(visina);
		assertEquals(visina, guma.getVisina());
	}
	
	@ParameterizedTest
	@CsvSource({
		"11", "22", "98"
	})
	void testSetVisinaVanOpsega(int visina) {
		assertThrows(java.lang.RuntimeException.class, () -> guma.setVisina(visina));
	}
	
	@ParameterizedTest
	@CsvSource({
		"goodyear1, 15, 180, 50, goodyear1, 15, 180, 50, true",
		"goodyear2, 15, 180, 50, goodyear1, 15, 180, 50, false",
		"goodyear1, 15, 180, 50, goodyear1, 17, 180, 50, false",
		"goodyear1, 14, 200, 50, goodyear1, 14, 180, 50, fasle",
		
	})
	void testEquals(String mm1, int p1, int s1, int v1, String mm2, int p2, int s2, int v2, boolean eq) {
		AutoGuma g1 = new AutoGuma(mm1, p1, s1, v1);
		AutoGuma g2 = new AutoGuma(mm2, p2, s2, v2);
		assertEquals(eq, g1.equals(g2));
	}
	
	@Test
	void testToString() {
		AutoGuma nova = new AutoGuma("Goodyear", 14, 150, 80);
		assertEquals("AutoGuma [markaModel=Goodyear, precnik=14, sirina=150, visina=80]", nova.toString());
	}

}
