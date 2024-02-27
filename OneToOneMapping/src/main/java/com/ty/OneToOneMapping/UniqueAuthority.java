package com.ty.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniqueAuthority {
	@Id
	private int adhaarId;
	private long adhaarContact;
	public int getAdhaarId() {
		return adhaarId;
	}
	public void setAdhaarId(int adhaarId) {
		this.adhaarId = adhaarId;
	}
	public long getAdhaarContact() {
		return adhaarContact;
	}
	public void setAdhaarContact(long adhaarContact) {
		this.adhaarContact = adhaarContact;
	}
	
	@Override
	public String toString() {
		return "UniqueAuthority [adhaarId=" + adhaarId + ", adhaarContact=" + adhaarContact + "]";
	}
	
}
