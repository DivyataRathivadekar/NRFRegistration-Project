package com.example.entity;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

@Entity
public class NfProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence-generator")
	@GenericGenerator(name = "sequence-generator",
    strategy = "com.example.entity.NFProfileIdGenerator")
	private String nfProfileId;

	private String ipV4Addresses;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_pf")
	private List<NfService> nfService;

	public NfProfile() {
		super();
	}

	public NfProfile(String nfProfileId, String ipV4Addresses) {
		super();
		this.nfProfileId = nfProfileId;
		this.ipV4Addresses = ipV4Addresses;
	}

	public String getNfProfileId() {
		return nfProfileId;
	}

	public void setNfProfileId(String nfProfileId) {
		this.nfProfileId = nfProfileId;
	}

	public String getIpV4Addresses() {
		return ipV4Addresses;
	}

	public void setIpV4Addresses(String ipV4Addresses) {
		this.ipV4Addresses = ipV4Addresses;
	}

	public List<NfService> getNfService() {
		return nfService;
	}

	public void setNfService(List<NfService> nfService) {
		this.nfService = nfService;
	}

	@Override
	public String toString() {
		return "NfProfile [nfProfileId=" + nfProfileId + ", ipV4Addresses=" + ipV4Addresses + "]";
	}

}
