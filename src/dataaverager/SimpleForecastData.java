package dataaverager;

public class SimpleForecastData implements IForecastData {
	String city;
	String date;
	float temperature;
	String description;
	
	public SimpleForecastData(String city, String date, float temperature, String description) {
		this.city = city;
		this.date = date;
		this.temperature = temperature;
		this.description = description;
	}

	@Override
	public float getTemperature() {
		return temperature;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
