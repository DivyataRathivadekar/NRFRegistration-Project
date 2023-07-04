package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.NetworkFunctionInstance;
import com.example.repository.NFInstanceRepository;

@Service
public class NFInstanceService {
	@Autowired
	NFInstanceRepository nfInstanceRepository;
	
	public NetworkFunctionInstance registerNFInstance(NetworkFunctionInstance NFInstance) {
		return nfInstanceRepository.save(NFInstance);
	}
}
