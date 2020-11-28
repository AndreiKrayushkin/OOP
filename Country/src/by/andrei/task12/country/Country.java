package by.andrei.task12.country;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;
	private List<Region> regionAdd;
	
	public Country() {}
	
	public Country(String name) {
		this.name = name;
		this.regionAdd = new ArrayList<Region>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Region> getRegionAdd() {
		return regionAdd;
	}

	public void setRegionAdd(List<Region> regionAdd) {
		this.regionAdd = regionAdd;
	}

	public void setRegionAdd(Region r) {
		regionAdd.add(r);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regionAdd == null) ? 0 : regionAdd.hashCode());
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
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionAdd == null) {
			if (other.regionAdd != null)
				return false;
		} else if (!regionAdd.equals(other.regionAdd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", regionAdd=" + regionAdd + "]";
	}
	
	
}
