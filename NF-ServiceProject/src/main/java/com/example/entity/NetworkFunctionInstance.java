package com.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;

@Entity
public class NetworkFunctionInstance {
//This is nfinstance class
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence-generator")
	@GenericGenerator(name = "sequence-generator",
    strategy = "com.example.entity.NFInstanceIdGenerator")
	private String networkFunctionInstanceId;
	
	@Enumerated(EnumType.STRING)
	private NFInstanceType networkFunctionInstanceType;
	
	@Enumerated(EnumType.STRING)
	private NFStatus status;
	
	@Enumerated(EnumType.STRING)
	private int heartBeatTimer;
	
	@OneToOne(cascade=CascadeType.ALL)
	private NfProfile nfProfile;

	public NetworkFunctionInstance() {
		super();
	}

	public NetworkFunctionInstance(String networkFunctionInstanceId, NFInstanceType networkFunctionInstanceType,
			NFStatus status, int heartBeatTimer, NfProfile nfProfile) {
		super();
		this.networkFunctionInstanceId = networkFunctionInstanceId;
		this.networkFunctionInstanceType = networkFunctionInstanceType;
		this.status = status;
		this.heartBeatTimer = heartBeatTimer;
		this.nfProfile = nfProfile;
	}

	public String getNetworkFunctionInstanceId() {
		return networkFunctionInstanceId;
	}

	public void setNetworkFunctionInstanceId(String networkFunctionInstanceId) {
		this.networkFunctionInstanceId = networkFunctionInstanceId;
	}

	public NFInstanceType getNetworkFunctionInstanceType() {
		return networkFunctionInstanceType;
	}

	public void setNetworkFunctionInstanceType(NFInstanceType networkFunctionInstanceType) {
		this.networkFunctionInstanceType = networkFunctionInstanceType;
	}

	public NFStatus getStatus() {
		return status;
	}

	public void setStatus(NFStatus status) {
		this.status = status;
	}

	public int getHeartBeatTimer() {
		return heartBeatTimer;
	}

	public void setHeartBeatTimer(int heartBeatTimer) {
		this.heartBeatTimer = heartBeatTimer;
	}

	public NfProfile getNfProfile() {
		return nfProfile;
	}

	public void setNfProfile(NfProfile nfProfile) {
		this.nfProfile = nfProfile;
	}

	@Override
	public String toString() {
		return "NetworkFunctionInstance [networkFunctionInstanceId=" + networkFunctionInstanceId
				+ ", networkFunctionInstanceType=" + networkFunctionInstanceType + ", status=" + status
				+ ", heartBeatTimer=" + heartBeatTimer + "]";
	}
	
	
}
