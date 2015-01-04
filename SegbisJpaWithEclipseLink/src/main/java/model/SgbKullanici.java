package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sgb_kullanici database table.
 * deneme
 */
@Entity
@Table(name="sgb_kullanici")
@NamedQuery(name="SgbKullanici.findAll", query="SELECT s FROM SgbKullanici s")
public class SgbKullanici implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private String id;

	@Column(nullable=false)
	private int durum;

	@Column(length=255)
	private String password;

	@Column(length=255)
	private String userName;

	//bi-directional one-to-one association to SgbKullaniciDetay
	@OneToOne
	@JoinColumn(name="kullaniciDetay_id")
	private SgbKullaniciDetay sgbKullaniciDetay;

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

}