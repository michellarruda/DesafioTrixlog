package br.com.trixlog.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.trixlog.model.Location;

public class DataDaoImpl implements DataDao {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public int insertRow(Location location) {
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	session.saveOrUpdate(location);
	tx.commit();
	Serializable id = session.getIdentifier(location);
	session.close();
	return (Integer) id;
    }

    public List<Location> getList() {
	Session session = sessionFactory.openSession();
	@SuppressWarnings("unchecked")
	List<Location> locationList = session.createQuery("from Location").list();
	session.close();
	return locationList;
    }

    public Location getRowById(int id) {
	Session session = sessionFactory.openSession();
	Location location = (Location) session.load(Location.class, id);
	return location;
    }
    
    @Transactional
    public int updateRow(Location location) {
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();		
	session.saveOrUpdate(location);
	tx.commit();
	Serializable id = session.getIdentifier(location);
	session.close();
	System.out.println(id);
	return (Integer) id;
    }

    public int deleteRow(int id) {
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	Location location = (Location) session.load(Location.class, id);
	session.delete(location);
	tx.commit();
	Serializable ids = session.getIdentifier(location);
	session.close();
	return (Integer) ids;
    }

}