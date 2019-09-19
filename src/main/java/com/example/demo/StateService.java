package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
	@Autowired
	private StateRepository sr;
	public List<States> getStates(){
	 List<States> ls=new ArrayList<>();
	 sr.findAll().forEach(ls::add);
	 return ls;
	}
	public States getStates(int id) {
		return sr.findById(id).orElse(null);
	}
	public void addStates(States s) {
		sr.save(s);
	}
	public void updateStates(States s,int id) {
		sr.save(s);
	}
	public void deleteStates(int id) {
		sr.deleteById(id);
	}
	

}
