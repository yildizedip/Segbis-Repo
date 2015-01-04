package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sgb_kullanici_detay database table.
 * 
 */
@Entity
@Table(name="sgb_kullanici_detay")
@NamedQuery(name="SgbKullaniciDetay.findAll", query="SELECT s FROM SgbKullaniciDetay s")
public class SgbKullaniciDetay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private int durum;

	private String mail;

	private String name;

	private String surname;

	//bi-directional many-to-one association to SgbKullanici
	@OneToMany(mappedBy="sgbKullaniciDetay")
	private List<SgbKullanici> sgbKullanicis;

	public SgbKullaniciDetay() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getDurum() {
		return this.durum;
	}

	public void setDurum(int durum) {
		this.durum = durum;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<SgbKullanici> getSgbKullanicis() {
		return this.sgbKullanicis;
	}

	public void setSgbKullanicis(List<SgbKullanici> sgbKullanicis) {
		this.sgbKullanicis = sgbKullanicis;
	}

	public SgbKullanici addSgbKullanici(SgbKullanici sgbKullanici) {
		getSgbKullanicis().add(sgbKullanici);
		sgbKullanici.setSgbKullaniciDetay(this);

		return sgbKullanici;
	}

	public SgbKullanici removeSgbKullanici(SgbKullanici sgbKullanici) {
		getSgbKullanicis().remove(sgbKullanici);
		sgbKullanici.setSgbKullaniciDetay(null);

		return sgbKullanici;
	}

}