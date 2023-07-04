package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.NetworkFunctionInstance;
import com.example.service.NFInstanceService;
import com.example.util.MappingConstants;

@RestController
@RequestMapping(value = MappingConstants.NFInstanceUri)
public class NFInstanceController {
	
	@Autowired
	NFInstanceService nfInstanceservice;
	
	@PostMapping(value=MappingConstants.Save)
	public NetworkFunctionInstance registerNFInstance(@RequestBody NetworkFunctionInstance nfInstance) {
		return nfInstanceservice.registerNFInstance(nfInstance);
	}

}
