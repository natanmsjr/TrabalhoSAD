package br.ufs.trabalhosad.dao;

import br.ufs.trabalhosad.util.HibernateUtil;
import br.ufs.trabalhosad.modelo.Turma;
import javax.ejb.Stateless;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Natan
 */

@Stateless
public class TurmaDAO implements DAO<Turma> {
    private static final long serialVersionUID = 1L;

    public Turma getTurma(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Turma) session.load(Turma.class, id);
    }
    
    public List<Turma> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from turmas").list();
        t.commit();
        return lista;
    }
    
    public void save(Turma turma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(turma);
        t.commit();
    }
    
    public void remove(Turma turma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(turma);
        t.commit();
    }
    
    public void update(Turma turma) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(turma);
        t.commit();
    }

    @Override
    public void inserir(Class<Turma> turma) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(turma);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Class<Turma> turma) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(turma);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Class<Turma> turma) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(turma);
        t.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turma buscar(Class<Turma> turma) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Turma) session.load(Turma.class, turma);
    }

    @Override
    public List<Turma> listar() throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Turma> lista = session.createQuery("from turmas").list();
        t.commit();
        return lista;
    }
}