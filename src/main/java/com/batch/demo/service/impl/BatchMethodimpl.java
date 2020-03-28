package com.batch.demo.service.impl;

import org.springframework.stereotype.Component;

import com.batch.demo.service.BatchMethod;

@Component
public class BatchMethodimpl implements BatchMethod {

	@Override
	public void plan() {
		System.out.println(Thread.currentThread().getName() + "执行调度计划检查");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void job() {
		System.out.println(Thread.currentThread().getName() + "执行job检查");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void checkfile() {
		System.out.println(Thread.currentThread().getName() + "执行文件上传下载检查");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void putfile() {
		System.out.println(Thread.currentThread().getName() + "执行文件传输检查");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
