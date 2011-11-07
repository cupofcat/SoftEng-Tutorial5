package dataaverager;

public class ConstantDataSource implements IWeatherDataSource {

	@Override
	public IForecastData getForecastDataFor(String city, String date) {
		if ("London".equals(city)) {
			return new SimpleForecastData(city, date, 29.0f, "sunny");
		}
		if ("New York".equals(city)) {
			return new SimpleForecastData(city, date, 31.0f, "hot");
		}
		return null;
	}

}
