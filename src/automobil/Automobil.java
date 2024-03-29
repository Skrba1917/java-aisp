package automobil;

public class Automobil {
	
	 private String model;
	 private String proizvodjac;
	 private int godProizvodnje;
	 private String brTablica;
	 private byte idVozila;
	 private byte vrsta;
	 private boolean postoji;
	 private int idVozaca;
	 
	 public Automobil(){

	    }

	public Automobil(String model, String proizvodjac, int godProizvodnje, String brTablica, byte idVozila, byte vrsta,
			boolean postoji, int idVozaca) {
		super();
		this.model = model;
		this.proizvodjac = proizvodjac;
		this.godProizvodnje = godProizvodnje;
		this.brTablica = brTablica;
		this.idVozila = idVozila;
		this.vrsta = vrsta;
		this.postoji = postoji;
		this.idVozaca = idVozaca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public int getGodProizvodnje() {
		return godProizvodnje;
	}

	public void setGodProizvodnje(int godProizvodnje) {
		this.godProizvodnje = godProizvodnje;
	}

	public String getBrTablica() {
		return brTablica;
	}

	public void setBrTablica(String brTablica) {
		this.brTablica = brTablica;
	}

	public byte getIdVozila() {
		return idVozila;
	}

	public void setIdVozila(byte idVozila) {
		this.idVozila = idVozila;
	}

	public byte getVrsta() {
		return vrsta;
	}

	public void setVrsta(byte vrsta) {
		this.vrsta = vrsta;
	}

	public boolean isPostoji() {
		return postoji;
	}

	public void setPostoji(boolean postoji) {
		this.postoji = postoji;
	}

	public int getIdVozaca() {
		return idVozaca;
	}

	public void setIdVozaca(int idVozaca) {
		this.idVozaca = idVozaca;
	}

	@Override
	public String toString() {
		return "Automobil [model=" + model + ", proizvodjac=" + proizvodjac + ", godProizvodnje=" + godProizvodnje
				+ ", brTablica=" + brTablica + ", idVozila=" + idVozila + ", vrsta=" + vrsta + ", postoji=" + postoji
				+ ", idVozaca=" + idVozaca + "]";
	}
}
