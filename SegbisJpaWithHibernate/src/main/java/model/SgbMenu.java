package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sgb_menu database table.
 * 
 */
@Entity
@Table(name="sgb_menu")
@NamedQuery(name="SgbMenu.findAll", query="SELECT s FROM SgbMenu s")
public class SgbMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private int durum;

	private String menuAd;

	private String menuYol;

	private int order;

	//bi-directional many-to-one association to SgbRol
	@ManyToOne
	@JoinColumn(name="ownerRol_id")
	private SgbRol sgbRol;

	public SgbMenu() {
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

	public String getMenuAd() {
		return this.menuAd;
	}

	public void setMenuAd(String menuAd) {
		this.menuAd = menuAd;
	}

	public String getMenuYol() {
		return this.menuYol;
	}

	public void setMenuYol(String menuYol) {
		this.menuYol = menuYol;
	}

	public int getOrder() {
		return this.order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public SgbRol getSgbRol() {
		return this.sgbRol;
	}

	public void setSgbRol(SgbRol sgbRol) {
		this.sgbRol = sgbRol;
	}

}