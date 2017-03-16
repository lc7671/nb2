package cn.itcast.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CenterController {
	
	@RequestMapping("{page}")
	public String toPage(@PathVariable String page){
		if(page.contains("/control")){
			return page.replaceAll("/control/", "");
		}else if(page.contains("/frame")){
			return page;
		}else{
			return "index";
		}
		
	}
}
