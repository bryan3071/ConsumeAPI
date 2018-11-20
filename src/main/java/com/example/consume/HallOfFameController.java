package com.example.consume;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HallOfFameController {
	
	//@Autowired
	//private CHApiService

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		RestTemplate rest = new RestTemplate();
		HallOfFame hof = rest.getForObject(url, HallOfFame.class);
		
		mv.addObject("tinylist", hof.getTiny());
		
		System.out.println(hof.getTiny());
		
		return mv;
		
	}
	
	@RequestMapping("complete")
	public ModelAndView complete() {
		ModelAndView mv = new ModelAndView("complete");
		
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		RestTemplate rest = new RestTemplate();
		HallOfFame hof = rest.getForObject(url, HallOfFame.class);
		
		mv.addObject("completelist", hof.getComplete());
		
		
		
		return mv;
		
	}
	
	
}
