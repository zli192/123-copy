package com.fleetmanagement.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reading {
	
	@Id
	private String readingId;
	private Tires tires;
	private String vin;
	private double fuelVoulme;
	private double speed;
	private double engineHp;
	private boolean checkEngineLightOn;
	private boolean engineCoolantLow;
	private boolean cruiseControlOn;
	private double engineRpm;
	private double latitude;
	private double longitude;
	private LocalDateTime timestamp;
	private LocalDateTime created;
	
	public Reading(){
		this.readingId = UUID.randomUUID().toString();
	}

	
	public String getReadingId() {
		return readingId;
	}
	public void setReadingId(String readingId) {
		this.readingId = readingId;
	}
	public Tires getTires() {
		return tires;
	}
	public void setTires(Tires tires) {
		this.tires = tires;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public double getFuelVoulme() {
		return fuelVoulme;
	}
	public void setFuelVoulme(double fuelVoulme) {
		this.fuelVoulme = fuelVoulme;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getEngineHp() {
		return engineHp;
	}
	public void setEngineHp(double engineHp) {
		this.engineHp = engineHp;
	}
	public boolean isCheckEngineLightOn() {
		return checkEngineLightOn;
	}
	public void setCheckEngineLightOn(boolean checkEngineLightOn) {
		this.checkEngineLightOn = checkEngineLightOn;
	}
	public boolean isEngineCoolantLow() {
		return engineCoolantLow;
	}
	public void setEngineCoolantLow(boolean engineCoolantLow) {
		this.engineCoolantLow = engineCoolantLow;
	}
	public boolean isCruiseControlOn() {
		return cruiseControlOn;
	}
	public void setCruiseControlOn(boolean cruiseControlOn) {
		this.cruiseControlOn = cruiseControlOn;
	}
	public double getEngineRpm() {
		return engineRpm;
	}
	public void setEngineRpm(double engineRpm) {
		this.engineRpm = engineRpm;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public LocalDateTime getCreated() {
		return created;
	}


	public void setCreated(LocalDateTime created) {
		this.created = created;
	}


	@Override
	public String toString() {
		return "Reading [readingId=" + readingId + ", vin=" + vin + ", fuelVoulme=" + fuelVoulme
				+ ", speed=" + speed + ", engineHp=" + engineHp + ", checkEngineLightOn=" + checkEngineLightOn
				+ ", engineCoolantLow=" + engineCoolantLow + ", cruiseControlOn=" + cruiseControlOn + ", engineRpm="
				+ engineRpm + ", latitude=" + latitude + ", longitude=" + longitude + ", timestamp=" + timestamp
				+ ", created=" + created + "]";
	}
}
	