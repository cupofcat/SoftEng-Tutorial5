package dataaverager;

public class FileDataSource implements IWeatherDataSource {

	@Override
	public ForecastData getForecastDataFor(String city, String date) {
		if ("London".equals(city)) {
			return new ForecastData(city, date, 19.0f, "bloody sunny");
		}
		if ("New York".equals(city)) {
			return new ForecastData(city, date, 40.0f, "awfully hot");
		}
		return null;
	}

}
