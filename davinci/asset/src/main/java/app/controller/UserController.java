package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.domain.Person;
import app.domain.PersonRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping("/save")
	@ResponseBody
	public String save(){
		Person p = new Person();
		p.setName("zhaomin");
		p.setAccount("779999");
		personRepository.save(p);
		return "save suc";
	}
	
	@RequestMapping("/fa")
	@ResponseBody
	public String finda(){
		Person p = personRepository.findByAccount("779999");
		return p.getName() + "--" +p.getAccount();
	}
	
	@RequestMapping("/fn")
	@ResponseBody
	public String findn(){
		Person p = personRepository.findByName("zhaomin");
		return p.getName() + "--" +p.getAccount();
	}	

}
