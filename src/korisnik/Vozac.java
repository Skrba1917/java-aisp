package korisnik;

public class Vozac extends Korisnik {
	
	 private int plata;
	 private int brClanskeKarte;
	 private boolean postoji;
	  
	 public Vozac(){
		  
	 }

	public Vozac(String id, String username, String password, String ime, String prezime, long jmbg, String adress,
			Pol pol, long brTel, int plata, int brClanskeKarte, boolean postoji) {
		super(id, username, password, ime, prezime, jmbg, adress, pol, brTel);
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
