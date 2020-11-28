package by.andrei.task12.country;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private String name;
	private List<District> districtAdd;
	private double square;
	
	public Region () {}
	
	public Region(String name, double square) {
		this.name = name;
		this.districtAdd = new ArrayList<District>();
		this.square = square;
	}

	public double getSquare() {
		return square;
	}
	
	public void setSquare(double square) {
		this.square = square;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<District> getDistrictAdd() {
		return districtAdd;
	}

	public void setDistrictAdd(List<District> districtAdd) {
		this.districtAdd = districtAdd;
	}

	public void setDistrictAdd(District d) {
		districtAdd.add(d);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districtAdd == null) ? 0 : districtAdd.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (districtAdd == null) {
			if (other.districtAdd != null)
				return false;
		} else if (!districtAdd.equals(other.districtAdd))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", districtAdd=" + districtAdd + ", square=" + square + "]";
	}

}
