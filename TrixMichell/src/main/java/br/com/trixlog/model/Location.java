package br.com.trixlog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Location {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private int latitude;

    @Column(nullable = false)
    private int longitude;

    @Column(nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date created = new Date();

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getLatitude() {
	return latitude;
    }

    public void setLatitude(int latitude) {
	this.latitude = latitude;
    }

    public int getLongitude() {
	return longitude;
    }

    public void setLongitude(int longitude) {
	this.longitude = longitude;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Date getCreated() {
	return created;
    }

    public void setCreated(Date created) {
	this.created = created;
    }

}