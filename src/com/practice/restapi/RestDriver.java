package com.practice.restapi;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class RestDriver {

public static void main(String[] args) throws Exception {

	ObjectMapper mapper= new ObjectMapper();
	Student std=mapper.readValue(new File("data/sample.json"), Student.class);
	
	System.out.println(std);
	for(String s:std.getLanguage())
		System.out.println(s);
	
	mapper.enable(SerializationFeature.INDENT_OUTPUT);
	mapper.writeValue(new File("data/full-sample.json"), std);
	System.out.println("hi");
	
}
}
