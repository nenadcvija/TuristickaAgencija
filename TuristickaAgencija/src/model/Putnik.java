package model;

import javax.persistence.Embeddable;

@Embeddable
public class Putnik {
	
	private String ime;
	private Integer brojGodina;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public Integer getBrojGodina() {
		return brojGodina;
	}
	public void setBrojGodina(Integer brojGodina) {
		this.brojGodina = brojGodina;
	}

	

}
