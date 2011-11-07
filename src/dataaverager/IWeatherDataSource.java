package dataaverager;

public interface IWeatherDataSource {
	public ForecastData getForecastDataFor(String city, String date);
}
