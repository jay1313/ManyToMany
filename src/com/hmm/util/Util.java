package com.hmm.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	
	public static  final SessionFactory sessionfactory;
	
	static{
		try{
			
			sessionfactory = new Configuration().configure().buildSessionFactory();
			
		}
		catch(HibernateException e){
			System.out.println(e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Session getSession()
	{
		return sessionfactory.openSession();
	}
	
	
}
