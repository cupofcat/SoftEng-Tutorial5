package dataaverager;

public interface IWeatherDataAverager {
	/**
	 * Return the forecast for the city averaged from multiple data sources
	 * @param city
	 */
	public IForecastData getAverageDataFor(String city, String date);
}
