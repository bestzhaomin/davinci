package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import app.vb.Login;

@Controller
public class LoginController {
	
    @RequestMapping("/")
    String index(Login login,Model model) {
    	if(login == null || login.getUsername() == null){
    		login = new Login();
    		login.setUsername("请输入账号");
    	}
    	model.addAttribute(login);
        return "login";
    }  
    
    @RequestMapping("/login")
    String login(Login login,Model model) {
    	if(login == null || login.getUsername() == null){
    		login = new Login();
    		login.setUsername("请输入账号");
    	}
    	model.addAttribute(login);
        return "login";
    }    

}
