package pressure;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.DateFormatter;

import dataaverager.ConstantAverager;
import dataaverager.ForecastData;
import dataaverager.IWeatherDataAverager;

public class WeatherGUI
{
	public static void main(String args[]) throws Exception
	{
		JFrame f = new JFrame("Weather GUI: Choose a City...");
		JPanel p = new JPanel(new BorderLayout());
		final JComboBox l = new JComboBox(new String[]{"London", "New York"});
		final JTextArea b = new JTextArea(); 
		b.setWrapStyleWord(true);
		b.setLineWrap(true);
		
		// ties up the expedient and good implementations here...
		// using interfaces, the good implementations don't know they are connected
		// to something expedient...
		final IWeatherDataAverager weatherData = new ConstantAverager();
		
		l.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String city = (String) l.getSelectedItem();				
				
				String date = null;
				try
				{
					date = new DateFormatter().valueToString(new Date());
				}
				catch (ParseException e1)
				{
				}
				
				ForecastData forecast = weatherData.getAverageDataFor(city, date);

				b.setText("In " + city + " on " + date + ", the weather is " + forecast.getDescription() + ", " + forecast.getTemperature());
			}
		});
		p.add(l, BorderLayout.NORTH);
		p.add(b, BorderLayout.CENTER);
		
		// start up the GUI
		f.setPreferredSize(new Dimension(200, 500));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.add(p);
		l.setSelectedIndex(0);
		f.setVisible(true);
	}
}

