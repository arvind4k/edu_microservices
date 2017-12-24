package com.talooz.ms.admin.entity;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSPORT")
public class Transport implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long routeId;
	private String routeName;
	private String transportMode;
	private Integer obsolete;
	@OneToMany(mappedBy="transport",cascade = CascadeType.ALL)
    private List<TransportParticulars> transportParticulars;
	
	
	public Long getRouteId() {
		return routeId;
	}
	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public Integer getObsolete() {
		return obsolete;
	}
	public void setObsolete(Integer obsolete) {
		this.obsolete = obsolete;
	}
	public List<TransportParticulars> getTransportParticulars() {
		return transportParticulars;
	}
	public void setTransportParticulars(List<TransportParticulars> transportParticulars) {
		this.transportParticulars = transportParticulars;
	}
	
	
	
}
