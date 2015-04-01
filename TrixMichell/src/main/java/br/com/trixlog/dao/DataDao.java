package br.com.trixlog.dao;

import java.util.List;

import br.com.trixlog.model.Location;

public interface DataDao {
    public int insertRow(Location location);

    public List<Location> getList();

    public Location getRowById(int id);

    public int updateRow(Location location);

    public int deleteRow(int id);
}