package service;

import org.springframework.stereotype.Service;

import model.Demo;

@Service
public class DemoService {
	
	public Demo demoVar() {
		Demo demo=new Demo();
		demo.setVal("first_spring boot api with project structure");
		return demo;
	}
	

}
