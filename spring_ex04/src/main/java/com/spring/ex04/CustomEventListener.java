package com.spring.ex04;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

//public class CustomEventListener<ApplicationEvent> implements ApplicationListener<ApplicationEvent> {
public class CustomEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub

		if (event instanceof ContextRefreshedEvent) {
			System.out.println(">>> ContextRefreshedEvent is occured...");
		}
		else if (event instanceof ContextStartedEvent) {
			System.out.println(">>> ContextStartedEvent is occured...");
		}
		else if (event instanceof ContextStoppedEvent) {
			System.out.println(">>> ContextStoppedEvent is occured...");
		}
		else if (event instanceof ContextClosedEvent) {
			System.out.println(">>> ContextClosedEvent is occured...");
		}
		else {
			System.out.println(">>> Event? is occured...");
		}
		
	}

}
