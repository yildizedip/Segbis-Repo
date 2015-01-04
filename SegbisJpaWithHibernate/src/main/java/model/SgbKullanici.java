package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sgb_kullanici database table.
 * 
 */
@Entity
@Table(name="sgb_kullanici")
@NamedQuery(name="SgbKullanici.findAll", query="SELECT s FROM SgbKullanici s")
public class SgbKullanici implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private int durum;

	private String password;

	private String userName;

	//bi-directional many-to-one association to SgbKullaniciDetay
	@ManyToOne
	@JoinColumn(name="kullaniciDetay_id")
	private SgbKullaniciDetay sgbKullaniciDetay;

	//bi-directional many-to-one association to SgbKullaniciRol
	@OneToMany(mappedBy="sgbKullanici")
	private List<SgbKullaniciRol> sgbKullaniciRols;

	public SgbKullanici() {
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public SgbKullaniciDetay getSgbKullaniciDetay() {
		return this.sgbKullaniciDetay;
	}

	public void setSgbKullaniciDetay(SgbKullaniciDetay sgbKullaniciDetay) {
		this.sgbKullaniciDetay = sgbKullaniciDetay;
	}

	public List<SgbKullaniciRol> getSgbKullaniciRols() {
		return this.sgbKullaniciRols;
	}

	public void setSgbKullaniciRols(List<SgbKullaniciRol> sgbKullaniciRols) {
		this.sgbKullaniciRols = sgbKullaniciRols;
	}

	public SgbKullaniciRol addSgbKullaniciRol(SgbKullaniciRol sgbKullaniciRol) {
		getSgbKullaniciRols().add(sgbKullaniciRol);
		sgbKullaniciRol.setSgbKullanici(this);

		return sgbKullaniciRol;
	}

	public SgbKullaniciRol removeSgbKullaniciRol(SgbKullaniciRol sgbKullaniciRol) {
		getSgbKullaniciRols().remove(sgbKullaniciRol);
		sgbKullaniciRol.setSgbKullanici(null);

		return sgbKullaniciRol;
	}

}