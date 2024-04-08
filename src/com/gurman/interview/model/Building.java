package com.gurman.interview.model;

public class Building implements Cloneable{

	String buildingName;
	int flatNo;
	Integer floorNo;

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public Integer getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}

	public Building(String buildingName, int flatNo, Integer floorNo) {
		super();
		this.buildingName = buildingName;
		this.flatNo = flatNo;
		this.floorNo = floorNo;
	}

	@Override
	public String toString() {
		return "Building [buildingName = " + buildingName + ", flatNo = " + flatNo + ", floorNo = " + floorNo + "]";
	}
	
 	public Building clone() throws CloneNotSupportedException {
		return (Building) super.clone();
	}

}
