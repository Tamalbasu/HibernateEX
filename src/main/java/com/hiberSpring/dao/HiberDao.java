package com.hiberSpring.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hiberSpring.beans.User;
import com.hiberSpring.util.HibernateUtil;

public class HiberDao {
	
	
	
       public boolean adduser(User user){
    	   try {
			SessionFactory sf= HibernateUtil.getSessionFactory();
			  Session s= sf.openSession();
			  
			  s.save(user);
			  s.beginTransaction().commit();
			  HibernateUtil.shutdown();
		} catch (HibernateException e) {
			return false;
		}
		return true;
    	   
    	   
    	   
       }
}
