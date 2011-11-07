package dataaverager;

import java.util.HashSet;
import java.util.Set;

public class ConstantAverager implements IWeatherDataAverager {
	public Set<IWeatherDataSource> dataSources = new HashSet<IWeatherDataSource>();
	{
		dataSources.add(new ConstantDataSource());
		dataSources.add(new FileDataSource());
	}

	@Override
	public IForecastData getAverageDataFor(String city, String date) {
		float temperatureSum = 0;
		int i = 0;
		IForecastData forecast = null;
		for (IWeatherDataSource dataSource : dataSources) {
			forecast = dataSource.getForecastDataFor(city, date);
			temperatureSum += forecast.getTemperature();
			i++;
		}
		return new SimpleForecastData(city, date, temperatureSum/i, "fine");
	}

}
