package com.yg.ex07;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yg.vo2.SimpleMemberVO2;

@Controller
public class HomeController {
	@Autowired
	SimpleMemberVO2 vo;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("vo", vo);
		return "page2";
	}
}
