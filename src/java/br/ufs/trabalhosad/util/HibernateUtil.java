package br.ufs.trabalhosad.util;

import br.ufs.trabalhosad.modelo.Sala;
import br.ufs.trabalhosad.modelo.Turma;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

/**
 *
 * @author Natan
 * @param <Entidade>
 */

public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
 
    private HibernateUtil() {
    }
 
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Create the SessionFactory from standard (hibernate.cfg.xml)
                // config file.
                Configuration ac = new Configuration();
                ac.addAnnotatedClass(Turma.class);
                sessionFactory = ac.configure().buildSessionFactory();
                } catch (Throwable ex) {
                    // Log the exception.
                    System.err.println("Criação do SessionFactory falhou. " + ex);
                    throw new ExceptionInInitializerError(ex);
                }
                return sessionFactory;
        } else {
            return sessionFactory;
        }
    }
}
