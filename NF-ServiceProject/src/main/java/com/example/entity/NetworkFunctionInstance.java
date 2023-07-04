package com.example.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import com.example.util.NFInstanceType;
import com.example.util.NFStatus;


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
	
	
	private int heartBeatTimer;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//private NfProfile nfProfile;

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
		//this.nfProfile = nfProfile;
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

	/*
	 * public NfProfile getNfProfile() { return nfProfile; }
	 * 
	 * public void setNfProfile(NfProfile nfProfile) { this.nfProfile = nfProfile; }
	 */

	@Override
	public String toString() {
		return "NetworkFunctionInstance [networkFunctionInstanceId=" + networkFunctionInstanceId
				+ ", networkFunctionInstanceType=" + networkFunctionInstanceType + ", status=" + status
				+ ", heartBeatTimer=" + heartBeatTimer + "]";
	}
	
	
}
