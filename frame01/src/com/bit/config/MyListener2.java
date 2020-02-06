package com.bit.config;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

public class MyListener2 implements HttpSessionAttributeListener{
//public class MyListener2 implements HttpSessionActionListener
//세션생성과 소멸때 하는 listener

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("addAttr()");
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("removeattr()");
	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("editAttr()");
	}
}
