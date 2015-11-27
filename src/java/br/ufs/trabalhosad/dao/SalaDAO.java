package br.ufs.trabalhosad.dao;

import br.ufs.trabalhosad.util.HibernateUtil;
import br.ufs.trabalhosad.modelo.Sala;
import br.ufs.trabalhosad.util.ConnectionFactory;
import java.sql.Connection;
import javax.ejb.Stateless;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Natan
 */

@Stateless
public class SalaDAO implements DAO<Sala> {
    private Connection conn;
    
    public SalaDAO() throws Exception{
        try {
            this.conn = ConnectionFactory.getConnection( );
        } catch( Exception e ) {
            throw new Exception( "Erro: " +
                    "\n" + e.getMessage( ) );
        }  
    }

    @Override
    public void inserir(Class<Sala> sala) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(sala);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Class<Sala> sala) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(sala);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Class<Sala> sala) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(sala);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sala buscar(Class<Sala> sala) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Sala) session.load(Sala.class, sala);
    }

    @Override
    public List<Sala> listar() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Sala> lista = session.createQuery("from salas").list();
        t.commit();
        return lista;
    }
}