package auto_radnja.gume;

public class AutoGuma {
	
	private String markaModel = null;
	private int precnik = -1;
	private int sirina = -1;
	private int visina = -1;
	
	public AutoGuma() {
		super();
	}
	
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		this.markaModel = markaModel;
		this.precnik = precnik;
		this.sirina = sirina;
		this.visina = visina;
	}

	public String getMarkaModel() {
		return markaModel;
	}

	public void setMarkaModel(String markaModel) {
		this.markaModel = markaModel;
	}

	public int getPrecnik() {
		return precnik;
	}

	public void setPrecnik(int precnik) {
		this.precnik = precnik;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		this.sirina = sirina;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

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
