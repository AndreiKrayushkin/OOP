package by.andrei.task12.country;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String name;
	private List<City> cityAdd;
	
	public District() {}
	
	public District (String name) {
		this.name = name;
		this.cityAdd = new ArrayList<City>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCityAdd() {
		return cityAdd;
	}

	public void setCityAdd(List<City> cityAdd) {
		this.cityAdd = cityAdd;
	}

	public void setCityAdd(City c) {
		cityAdd.add(c);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityAdd == null) ? 0 : cityAdd.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		District other = (District) obj;
		if (cityAdd == null) {
			if (other.cityAdd != null)
				return false;
		} else if (!cityAdd.equals(other.cityAdd))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", cityAdd=" + cityAdd + "]";
	}

}
