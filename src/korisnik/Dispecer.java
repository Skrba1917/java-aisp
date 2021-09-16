package korisnik;

public class Dispecer extends Korisnik {
	
	private int plata;
    private int brTelLinije;
    private int telOdeljenje;
    private boolean postoji;

    public Dispecer(String ime, String username, String prezime, String username1, Pol pol, String adress,
    		int telOdeljenje, int brTelLinije, long brTel, long brTel1, String password) {
    }

	public Dispecer(int plata, int brTelLinije, int telOdeljenje, boolean postoji) {
		super();
		this.plata = plata;
		this.brTelLinije = brTelLinije;
		this.telOdeljenje = telOdeljenje;
		this.postoji = postoji;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

	public int getBrTelLinije() {
		return brTelLinije;
	}

	public void setBrTelLinije(int brTelLinije) {
		this.brTelLinije = brTelLinije;
	}

	public int getTelOdeljenje() {
		return telOdeljenje;
	}

	public void setTelOdeljenje(int telOdeljenje) {
		this.telOdeljenje = telOdeljenje;
	}

	public boolean isPostoji() {
		return postoji;
	}

	public void setPostoji(boolean postoji) {
		this.postoji = postoji;
	}

	@Override
	public String toString() {
		return "Dispecer [plata=" + plata + ", brTelLinije=" + brTelLinije + ", telOdeljenje=" + telOdeljenje
				+ ", postoji=" + postoji + ", id=" + id + ", username=" + username + ", password=" + password + ", ime="
				+ ime + ", prezime=" + prezime + ", jmbg=" + jmbg + ", adress=" + adress + ", pol=" + pol + ", brTel="
				+ brTel + "]";
	}	
}
