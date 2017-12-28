package com.hiberSpring.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

        private static final SessionFactory sessionFactory = buildSessionFactory();
        
        private static SessionFactory buildSessionFactory() {
               try {
            	     SessionFactory sessionFactory1;
                    ServiceRegistry serviceRegistry;
            	   Configuration configuration = new Configuration();
            	    configuration.configure();
            	    serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
            	            configuration.getProperties()).build();
            	    sessionFactory1 = configuration.buildSessionFactory(serviceRegistry);
            	    return sessionFactory1;
                      
               } catch (Throwable ex) {
                       // Make sure you log the exception, as it might be swallowed
                       System.err.println("Initial SessionFactory creation failed." + ex);
                       throw new ExceptionInInitializerError(ex);
               }
        }

        public static SessionFactory getSessionFactory() {
               return sessionFactory;
        }

        public static void shutdown() {
               // Close caches and connection pools
               getSessionFactory().close();
        }

}
