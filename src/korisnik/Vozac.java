package korisnik;

public class Vozac extends Korisnik {
	
	  private int plata;
	  private int brClanskeKarte;
	  private boolean postoji;
	  
	  public Vozac(){
		  
	  }

	public Vozac(int plata, int brClanskeKarte, boolean postoji) {
		super();
		this.plata = plata;
		this.brClanskeKarte = brClanskeKarte;
		this.postoji = postoji;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

	public int getBrClanskeKarte() {
		return brClanskeKarte;
	}

	public void setBrClanskeKarte(int brClanskeKarte) {
		this.brClanskeKarte = brClanskeKarte;
	}

	public boolean isPostoji() {
		return postoji;
	}

	public void setPostoji(boolean postoji) {
		this.postoji = postoji;
	}

	@Override
	public String toString() {
		return "Vozac [plata=" + plata + ", brClanskeKarte=" + brClanskeKarte + ", postoji=" + postoji + ", id=" + id
				+ ", username=" + username + ", password=" + password + ", ime=" + ime + ", prezime=" + prezime
				+ ", jmbg=" + jmbg + ", adress=" + adress + ", pol=" + pol + ", brTel=" + brTel + "]";
	}
}
