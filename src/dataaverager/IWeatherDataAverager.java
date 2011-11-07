package dataaverager;

public interface IWeatherDataAverager {
	/**
	 * Return the forecast for the city averaged from multiple data sources
	 * @param city
	 */
	public ForecastData getAverageDataFor(String city, String date);
	
	/**
	 * 
	 * @param dataSource
	 */
	public void addDataSource(IWeatherDataSource dataSource);
}
