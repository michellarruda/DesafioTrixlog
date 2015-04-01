package br.com.trixlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trixlog.dao.DataDao;
import br.com.trixlog.model.Location;

public class DataServiceImpl implements DataService {

    @Autowired
    DataDao dataDao;

    public int insertRow(Location location) {
	return dataDao.insertRow(location);
    }

    public List<Location> getList() {
	return dataDao.getList();
    }

    public Location getRowById(int id) {
	return dataDao.getRowById(id);
    }

    public int updateRow(Location location) {
	return dataDao.updateRow(location);
    }

    public int deleteRow(int id) {
	return dataDao.deleteRow(id);
    }

}
