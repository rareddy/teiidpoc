package com.gp.poc.teiidpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gp.poc.teiidpoc.entity.TeiidUSER;
import com.gp.poc.teiidpoc.repo.TeiidUSERRepository;

@RestController
public class FetchUserController {

	public FetchUserController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	TeiidUSERRepository userRepo;
	//
	//http://localhost:8091/findAllUsersfromTeiid
	@RequestMapping(value = "/findAllUsersfromTeiid", method = RequestMethod.GET, produces = {
	"application/json" }, headers = "Accept=application/json")
	public List<TeiidUSER> findAllUsersfromTeiid(){
		List<TeiidUSER> users=userRepo.findAll();
		System.out.println(" "+users);
		return users;
	}

}
