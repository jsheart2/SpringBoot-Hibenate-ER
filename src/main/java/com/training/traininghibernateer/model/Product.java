package com.training.traininghibernateer.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nama_barang")
public class Product {
    private String KodeBarang;
	private String NamaProduk;
    private String Unit;
    private BigDecimal Harga;

    @Id
    @Column(name="kode_barang")
    public String getKodeBarang() {
		return KodeBarang;
	}
	public void setKodeBarang(String kodeBarang) {
		this.KodeBarang = kodeBarang;
	}
	public String getNamaProduk() {
		return NamaProduk;
	}
	public void setNamaProduk(String namaProduk) {
		this.NamaProduk = namaProduk;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		this.Unit = unit;
	}

	public BigDecimal getHarga() {
		return Harga;
	}
	public void setHarga(BigDecimal harga) {
		this.Harga = harga;
	}

}