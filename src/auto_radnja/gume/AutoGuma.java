package auto_radnja.gume;

/**
 * 
 * Klasa koja opisuje auto gumu.
 * 
 * Guma ima atribute markaModel, precnik, sirina i visina
 * 
 * 
 * @author Jovan Saponjic
 * @version 0.1
 * 
 *  
 * */

public class AutoGuma {
	
	/**
	 * Marka modela gume kao String.
	 */
	private String markaModel = null;
	/**
	 * Precnik gume kao integer.
	 */
	private int precnik = -1;
	/**
	 * Sirina gume kao integer.
	 */
	private int sirina = -1;
	/**
	 * Visina gume kao integer.
	 */
	private int visina = -1;
	/**
	 * Konstruktor koji inicijalizuje objekat klase AutoGume.
	 */
	public AutoGuma() {
		super();
	}
	/**
	 * 
	 * Parametarski konstruktor klase AutoGuma, koji inicijalizuje obejkat i postavlja vrednosti za marku, precnik, sirinu, visinu.
	 * 
	 * @param markaModel Marka modela gume.
	 * @param precnik Precnik gume.
	 * @param sirina Sirina gume.
	 * @param visina Visina gume.
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}
	
	/**
	 * 
	 * Vraca marku modela gume.
	 * 
	 * @return Marku modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja marku modela na novu vrednost
	 * 
	 * @param markaModel Marka modela kao String
	 * @throws java.lang.NullPointerException ako je marka i model nisu uneti
	 * @throws java.lang.RuntimeException ako je untea marka i model koji imanju manje od 3 znaka
	 */
	public void setMarkaModel(String markaModel) {
		if(markaModel == null) {
			throw new NullPointerException("Morate uneti marku i model");
		}
		if(markaModel.length() < 3) {
			throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");
		}
		this.markaModel = markaModel;
	}
	/**
	 * Vrava precnik gume.
	 * 
	 * @return Precnik gume kao integer.
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * 
	 * Postavlja precnik gume na novu vrednost.
	 * 
	 * @param precnik Precnik gume kao Integer
	 * @throws java.lang.RuntimeException ako je untea precnik gume koji je manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22) {
			throw new RuntimeException("Precnik van opsega");
		}
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume.
	 * 
	 * @return Sirina gume kao integer.
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja sirinu gume na novu vrednost.
	 * 
	 * @param sirina Sirina gume kao integer.
	 * @throws java.lang.RuntimeException ako je untea sirina gume manja od 135 ili veca od 335
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355) {
			throw new RuntimeException("Sirina van opsega");
		}
		this.sirina = sirina;
	}
	/**
	 * Vraca visinu gume.
	 * 
	 * @return Visina gume kao integer
	 */

	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja visinu gume na novu vrednst.
	 * 
	 * @param visina Visina gume kao integer
	 * @throws java.lang.RuntimeException ako je untea visina gume manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95) {
			throw new RuntimeException("Visina van opsega");
		}
		this.visina = visina;
	}

	/**
	 * Vraca formatiran string sa svim atributima gume koji je opisuju.
	 * 
	 * @return String koji opisuje auto gumu
	 */
	
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi dve gume i vraca true ako su iste, odnosno false ako nisu
	 * 
	 * Gume se porede po marci, modelu, precniku, visini i sirini i sva svojstva moraju da budu ista da bi gume bile iste.
	 * 
	 * @return 
	 * <ul>
	 * 		<li>true ako su oba objekta klase AutoGuma i imaju iste sve atribute</li>
	 * 		<li>false u svim ostalim slucajevima</li>
	 * </ul>
	 * 
	 * 
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
	
	
	
	
	

}
