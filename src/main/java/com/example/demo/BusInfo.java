package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "busdetails")
public class BusInfo {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String busName;
	private String type;
	private int capacity;
	private int engineNumber;
	private int chassisNumber;
	private String model;
	private String busSource;
	private String busDestination;
	private String busNumber;
	public BusInfo(int id, String busName, String type, int capacity, int engineNumber, int chassisNumber, String model,
			String busSource, String busDestination, String busNumber) {
		super();
		this.id = id;
		this.busName = busName;
		this.type = type;
		this.capacity = capacity;
		this.engineNumber = engineNumber;
		this.chassisNumber = chassisNumber;
		this.model = model;
		this.busSource = busSource;
		this.busDestination = busDestination;
		this.busNumber = busNumber;
	}
	public BusInfo() {
		//do nothing
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busname) {
		this.busName = busname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(int chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBusSource() {
		return busSource;
	}
	public void setBusSource(String busSource) {
		this.busSource = busSource;
	}
	public String getBusDestination() {
		return busDestination;
	}
	public void setBusDestination(String busDestination) {
		this.busDestination = busDestination;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	@Override
	public String toString() {
		return "BusInfo [id=" + id + ", busname=" + busName + ", type=" + type + ", capacity=" + capacity
				+ ", engineNumber=" + engineNumber + ", chassisNumber=" + chassisNumber + ", model=" + model
				+ ", busSource=" + busSource + ", busDestination=" + busDestination + ", busNumber=" + busNumber + "]";
	}
}
