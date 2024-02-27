package com.ty.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String pName;
	private long pContact;
	
	@OneToOne
	private UniqueAuthority uiadi;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getpContact() {
		return pContact;
	}
	public void setpContact(long pContact) {
		this.pContact = pContact;
	}
	public UniqueAuthority getUiadi() {
		return uiadi;
	}
	public void setUiadi(UniqueAuthority uiadi) {
		this.uiadi = uiadi;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pName=" + pName + ", pContact=" + pContact + ", uiadi=" + uiadi + "]";
	}
	
}
