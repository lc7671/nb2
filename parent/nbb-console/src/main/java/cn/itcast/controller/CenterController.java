package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {
	
	@RequestMapping("/test/index.do")
	public String index(){
		return "index";
	}
}
