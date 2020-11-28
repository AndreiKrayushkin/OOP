package by.andrei.task12.country;

public class City {
	private String name;
	private boolean capitalCountry = false;
	private boolean capitalRegion = false;
	
	public City() {}
	
	public City (String name) {
		this.name = name;
	}
	
	public City (String name, boolean capitalCountry, boolean capitalRegion) {
		this.name = name;
		this.capitalRegion = capitalRegion;
		this.capitalCountry = capitalCountry;
	}
	
	public City (String name, boolean capitalRegion) {
		this.name = name;
		this.capitalRegion = capitalRegion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCapitalCountry() {
		return capitalCountry;
	}

	public void setCapitalCountry(boolean capitalCountry) {
		this.capitalCountry = capitalCountry;
	}

	public boolean isCapitalRegion() {
		return capitalRegion;
	}

	public void setCapitalRegion(boolean capitalRegion) {
		this.capitalRegion = capitalRegion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capitalCountry ? 1231 : 1237);
		result = prime * result + (capitalRegion ? 1231 : 1237);
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
		City other = (City) obj;
		if (capitalCountry != other.capitalCountry)
			return false;
		if (capitalRegion != other.capitalRegion)
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
		return name;
	}
	
	
	
}
