package com.example.entity;

import org.hibernate.annotations.GenericGenerator;
import com.example.util.NFServiceName;
import com.example.util.NFServiceStatus;
import com.example.util.Scheme;
import javax.persistence.*;

@Entity
public class NfService {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence-generator")
	@GenericGenerator(name = "sequence-generator",
    strategy = "com.example.entity.NFServiceIdGenerator")
	private String nfServiceId;

	@Enumerated(EnumType.STRING)
	private NFServiceName nfServiceName;

	@Enumerated(EnumType.STRING)
	private Scheme scheme;

	private String apifullVersion;

	@Enumerated(EnumType.STRING)
	private NFServiceStatus nfServiceStatus;

	public NfService() {
		super();
	}

	public NfService(String nfServiceId, NFServiceName nfServiceName, Scheme scheme, String apifullVersion,
			NFServiceStatus nfServiceStatus) {
		super();
		this.nfServiceId = nfServiceId;
		this.nfServiceName = nfServiceName;
		this.scheme = scheme;
		this.apifullVersion = apifullVersion;
		this.nfServiceStatus = nfServiceStatus;
	}

	public String getNfServiceId() {
		return nfServiceId;
	}

	public void setNfServiceId(String nfServiceId) {
		this.nfServiceId = nfServiceId;
	}

	public NFServiceName getNfServiceName() {
		return nfServiceName;
	}

	public void setNfServiceName(NFServiceName nfServiceName) {
		this.nfServiceName = nfServiceName;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	public String getApifullVersion() {
		return apifullVersion;
	}

	public void setApifullVersion(String apifullVersion) {
		this.apifullVersion = apifullVersion;
	}

	public NFServiceStatus getNfServiceStatus() {
		return nfServiceStatus;
	}

	public void setNfServiceStatus(NFServiceStatus nfServiceStatus) {
		this.nfServiceStatus = nfServiceStatus;
	}

	@Override
	public String toString() {
		return "NfService [nfServiceId=" + nfServiceId + ", nfServiceName=" + nfServiceName + ", scheme=" + scheme
				+ ", apifullVersion=" + apifullVersion + ", nfServiceStatus=" + nfServiceStatus + "]";
	}

}
