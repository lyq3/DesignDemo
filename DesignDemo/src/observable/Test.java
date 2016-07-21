package observable;

/**
 * 测试程序
 * @author Mr.luo
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建可观察者
		WeatherData weatherData=new WeatherData();
		//创建观察者
		CurrentConditionsDisplay cu=new CurrentConditionsDisplay(weatherData);
		//主题更新
		weatherData.setMeasurements(30, 50, 100);
	}
}
