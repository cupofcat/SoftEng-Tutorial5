package dataaverager;

public class ForecastData {
	String city;
	String date;
	float temperature;
	String description;
	
	public ForecastData(String city, String date, float temperature, String description) {
		this.city = city;
		this.date = date;
		this.temperature = temperature;
		this.description = description;
	}

	public float getTemperature() {
		return temperature;
	}

	public String getDescription() {
		return description;
	}

}
