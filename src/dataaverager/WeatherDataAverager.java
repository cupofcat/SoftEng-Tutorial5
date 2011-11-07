package dataaverager;

public interface WeatherDataAverager {
	/**
	 * Return the forecast for the city averaged from multiple data sources
	 * @param city
	 */
	public ForecastData getAverageDataFor(City city);
}
