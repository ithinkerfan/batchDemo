package com.batch.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service // 注解的方式把AsyncService交给Spring来管理
public class AsynTaskService {
	// 这里可以注入spring中管理的其他bean，这也是使用spring来实现多线程的一大优势
	@Autowired
	public BatchMethod batchMethod;

	@Async("getAsyncExecutor") // 这里进行标注为异步任务，在执行此方法的时候，会单独开启线程来执行
	public void AsynTask() {
		
		System.out.println("f1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
		batchMethod.plan();
		batchMethod.job();
		batchMethod.checkfile();
		batchMethod.putfile();
	}

}