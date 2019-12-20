package model;

public class Transport {
	
	private Integer idTransport;
	private TipTransporta tipTransporta;
	private Double cena;
	private Destinacija destinacija;
	
	public Integer getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Integer idTransport) {
		this.idTransport = idTransport;
	}
	public TipTransporta getTipTransporta() {
		return tipTransporta;
	}
	public void setTipTransporta(TipTransporta tipTransporta) {
		this.tipTransporta = tipTransporta;
	}
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	public Destinacija getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(Destinacija destinacija) {
		this.destinacija = destinacija;
	}
	
}
