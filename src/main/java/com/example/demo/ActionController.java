package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ActionController {
	@Autowired
	private StateService ss;

	@RequestMapping("/states")
	public List<States> getStates() {
		return ss.getStates();
	}

	@RequestMapping("/states/{id}")
	public States getStates(@PathVariable int id) {
		return ss.getStates(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/states")
	public void addStates(@RequestBody States s) {
		ss.addStates(s);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/states/{id}")
	public void updateStates(@RequestBody States s, @PathVariable int id) {
		ss.updateStates(s, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/states/{id}")
	public void deleteStates(@PathVariable int id) {
		ss.deleteStates(id);
	}

}
