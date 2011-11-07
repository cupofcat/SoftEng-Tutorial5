package dataaverager;

public interface IWeatherDataSource {
	public IForecastData getForecastDataFor(String city, String date);
}
