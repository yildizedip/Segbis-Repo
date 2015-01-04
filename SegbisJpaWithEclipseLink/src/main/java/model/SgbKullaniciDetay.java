package model;

import java.io.Serializable;
import javax.persistence.*;


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
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(nullable=false)
	private int durum;

	@Column(length=255)
	private String mail;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String surname;

	//bi-directional one-to-one association to SgbKullanici
	@OneToOne(mappedBy="sgbKullaniciDetay")
	private SgbKullanici sgbKullanici;

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

	public SgbKullanici getSgbKullanici() {
		return this.sgbKullanici;
	}

	public void setSgbKullanici(SgbKullanici sgbKullanici) {
		this.sgbKullanici = sgbKullanici;
	}

}