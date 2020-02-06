package com.bit.config;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/* webxml로 할땐 
<listener>
	<listener-class>com.bit.config.MyListener</listener-class>
</listener>
<listener>
*/
@WebListener
public class MyListener implements ServletContextListener{
//서버를 키고 끌 때 작동함.
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	System.out.println("was destroyed");
		
	}
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("was init");
	}
}
