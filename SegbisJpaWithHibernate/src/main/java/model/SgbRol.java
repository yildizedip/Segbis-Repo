package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sgb_rol database table.
 * 
 */
@Entity
@Table(name="sgb_rol")
@NamedQuery(name="SgbRol.findAll", query="SELECT s FROM SgbRol s")
public class SgbRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String rolAd;

	//bi-directional many-to-one association to SgbKullaniciRol
	@OneToMany(mappedBy="sgbRol")
	private List<SgbKullaniciRol> sgbKullaniciRols;

	//bi-directional many-to-one association to SgbMenu
	@OneToMany(mappedBy="sgbRol")
	private List<SgbMenu> sgbMenus;

	public SgbRol() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRolAd() {
		return this.rolAd;
	}

	public void setRolAd(String rolAd) {
		this.rolAd = rolAd;
	}

	public List<SgbKullaniciRol> getSgbKullaniciRols() {
		return this.sgbKullaniciRols;
	}

	public void setSgbKullaniciRols(List<SgbKullaniciRol> sgbKullaniciRols) {
		this.sgbKullaniciRols = sgbKullaniciRols;
	}

	public SgbKullaniciRol addSgbKullaniciRol(SgbKullaniciRol sgbKullaniciRol) {
		getSgbKullaniciRols().add(sgbKullaniciRol);
		sgbKullaniciRol.setSgbRol(this);

		return sgbKullaniciRol;
	}

	public SgbKullaniciRol removeSgbKullaniciRol(SgbKullaniciRol sgbKullaniciRol) {
		getSgbKullaniciRols().remove(sgbKullaniciRol);
		sgbKullaniciRol.setSgbRol(null);

		return sgbKullaniciRol;
	}

	public List<SgbMenu> getSgbMenus() {
		return this.sgbMenus;
	}

	public void setSgbMenus(List<SgbMenu> sgbMenus) {
		this.sgbMenus = sgbMenus;
	}

	public SgbMenu addSgbMenus(SgbMenu sgbMenus) {
		getSgbMenus().add(sgbMenus);
		sgbMenus.setSgbRol(this);

		return sgbMenus;
	}

	public SgbMenu removeSgbMenus(SgbMenu sgbMenus) {
		getSgbMenus().remove(sgbMenus);
		sgbMenus.setSgbRol(null);

		return sgbMenus;
	}

}