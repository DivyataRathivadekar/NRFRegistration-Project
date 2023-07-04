package com.example.entity;

import java.io.Serializable;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class NFProfileIdGenerator implements IdentifierGenerator{
	public int numSeq() {
		int i =0;
		i++;
		return i;
	}
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		return "NfTest" + numSeq();
	}

}
