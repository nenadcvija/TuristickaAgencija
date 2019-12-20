package model;

public class Putnik {
	
	private Integer idPutnik;
	private String ime;
	private Integer brojGodina;
	private Transport transport;
	
	public Integer getIdPutnik() {
		return idPutnik;
	}
	public void setIdPutnik(Integer idPutnik) {
		this.idPutnik = idPutnik;
	}
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
	public Transport getTransport() {
		return transport;
	}
	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	

}
