package observable;

/**
 * ���Գ���
 * @author Mr.luo
 *
 */
public class Test {
	public static void main(String[] args) {
		//�����ɹ۲���
		WeatherData weatherData=new WeatherData();
		//�����۲���
		CurrentConditionsDisplay cu=new CurrentConditionsDisplay(weatherData);
		//�������
		weatherData.setMeasurements(30, 50, 100);
	}
}
