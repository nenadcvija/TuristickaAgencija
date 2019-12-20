package model;

import java.util.Date;

public class Destinacija {
	
	private Integer idDestinacija;
	private String drzava;
	private String mesto;
	private String smestaj;
	private Double cenaSmestaja;
	private Integer brojNocenja;
	private Date datumPolaska;
	
	public Integer getIdDestinacija() {
		return idDestinacija;
	}
	public void setIdDestinacija(Integer idDestinacija) {
		this.idDestinacija = idDestinacija;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public String getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(String smestaj) {
		this.smestaj = smestaj;
	}
	public Double getCenaSmestaja() {
		return cenaSmestaja;
	}
	public void setCenaSmestaja(Double cenaSmestaja) {
		this.cenaSmestaja = cenaSmestaja;
	}
	public Integer getBrojNocenja() {
		return brojNocenja;
	}
	public void setBrojNocenja(Integer brojNocenja) {
		this.brojNocenja = brojNocenja;
	}
	public Date getDatumPolaska() {
		return datumPolaska;
	}
	public void setDatumPolaska(Date datumPolaska) {
		this.datumPolaska = datumPolaska;
	}
	
	
	
	

}
