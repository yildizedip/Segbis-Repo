package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sgb_kullanici_rol database table.
 * 
 */
@Entity
@Table(name="sgb_kullanici_rol")
@NamedQuery(name="SgbKullaniciRol.findAll", query="SELECT s FROM SgbKullaniciRol s")
public class SgbKullaniciRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	//bi-directional many-to-one association to SgbKullanici
	@ManyToOne
	@JoinColumn(name="kullanici_id")
	private SgbKullanici sgbKullanici;

	//bi-directional many-to-one association to SgbRol
	@ManyToOne
	@JoinColumn(name="rol_id")
	private SgbRol sgbRol;

	public SgbKullaniciRol() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SgbKullanici getSgbKullanici() {
		return this.sgbKullanici;
	}

	public void setSgbKullanici(SgbKullanici sgbKullanici) {
		this.sgbKullanici = sgbKullanici;
	}

	public SgbRol getSgbRol() {
		return this.sgbRol;
	}

	public void setSgbRol(SgbRol sgbRol) {
		this.sgbRol = sgbRol;
	}

}