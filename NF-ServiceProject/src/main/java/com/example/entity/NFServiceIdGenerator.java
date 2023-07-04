package com.example.entity;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class NFServiceIdGenerator implements IdentifierGenerator{
	public int numSeq() {
		int i =0;
		i++;
		return i;
	}
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		return "NfTest" + numSeq();
	}
	
}
