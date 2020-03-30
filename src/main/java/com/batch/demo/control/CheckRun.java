package com.batch.demo.control;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.batch.demo.service.AsynTaskService;

@Component
public class CheckRun {
    @Autowired
    private AsynTaskService asyncTaskService;
    
    
//    @Scheduled(cron = "${cron}")
	public void run() throws Exception {
		
		for (int i = 0; i < 10; i++) {
			asyncTaskService.AsynTask();
		}
		
	}
}
