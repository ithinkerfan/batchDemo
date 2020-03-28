package com.batch.demo.service;

import org.springframework.stereotype.Component;

@Component
public interface BatchMethod {
	
	void plan();
	
	void job();
	
	void checkfile();
	
	void putfile();
	
}
