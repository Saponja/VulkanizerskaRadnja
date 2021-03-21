package auto_radnja;

import java.util.LinkedList;

import auto_radnja.gume.AutoGuma;

/**
 * 
 * Interfejs koji opisuje ponasanje radnje za auto gume.
 * 
 * 
 * @author Jovan Saponjic
 * @version 0.1
 *
 */

public interface Radnja {
	
	/**
	 * Dodavanje nove gume u listu
	 *
	 * 
	 * @param a Objekat klase AutoGuma
	 * @throws java.lang.NullPointerException ako je guma null
	 * @throws java.lang.RuntimeException ako guma vec postoji u listi
	 */
	void dodajGumu(AutoGuma a);
	/**
	 * Pronalazenje gume po parametru markaModel.
	 * 
	 * @param markaModel Marka i model gume kao string
	 * @return
	 * 	<ul>
	 * 		<li> Listu auto guma cije se marka i model poklapaju sa kriterijumom pretrage </li>
	 * 		<li> Null ako je prosledjeni parametar null</li>
	 * 	</ul>
	 * @throws java.lang.RuntimeException ako je prazna lista 
	 * 
	 * 
	 */
	LinkedList<AutoGuma> pronadjiGumu(String markaModel);
	/**
	 * Vraca sve gume iz liste
	 * 
	 * @return Vraca sve gume iz liste guma kao LinkedList.
	 * 
	 * @throws java.lang.RuntimeException prazna Lista 
	 *
	 * 
	 */
	LinkedList<AutoGuma> vratiSveGume();

}
