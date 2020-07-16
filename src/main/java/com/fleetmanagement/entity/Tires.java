package com.fleetmanagement.entity;

import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable 
public class Tires {
	
	private String tireId;
	private double frontLeft;
	private double frontRight;
	private double rearLeft;
	private double rearRight;
	
	public Tires() {
		this.tireId = UUID.randomUUID().toString();
	}

	public String getTireId() {
		return tireId;
	}

	public void setTireId(String tireId) {
		this.tireId = tireId;
	}

	public double getFrontLeft() {
		return frontLeft;
	}

	public void setFrontLeft(double frontLeft) {
		this.frontLeft = frontLeft;
	}

	public double getFrontRight() {
		return frontRight;
	}

	public void setFrontRight(double frontRight) {
		this.frontRight = frontRight;
	}

	public double getRearLeft() {
		return rearLeft;
	}

	public void setRearLeft(double rearLeft) {
		this.rearLeft = rearLeft;
	}

	public double getRearRight() {
		return rearRight;
	}

	public void setRearRight(double rearRight) {
		this.rearRight = rearRight;
	}

	@Override
	public String toString() {
		return "Tires [tireId=" + tireId + ", frontLeft=" + frontLeft + ", frontRight=" + frontRight + ", rearLeft="
				+ rearLeft + ", rearRight=" + rearRight + "]";
	}
	
}

