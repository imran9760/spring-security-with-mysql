package com.wipro.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfiguration {
	
	public DBConfiguration() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}

}
