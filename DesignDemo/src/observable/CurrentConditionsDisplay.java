package observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	/**可观察者对象(主题对象)*/
	Observable observable;
	/**温度*/
	private float temperature;
	/**湿度*/
	private float humidity;
	
	
	/**
	 * 构造方法将主题对象传递过来，
	 * 将观察者加入到订阅者中
	 * @param observable
	 */
	public CurrentConditionsDisplay(Observable observable) {
		super();
		this.observable=observable;
		observable.addObserver(this);
	}

	/**
	 * 将主题对象和数据对象作为参数
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData) o;
			this.humidity=weatherData.getHumidity();
			this.temperature=weatherData.getTemperature();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("湿度:"+humidity+"\n"+"温度:"+temperature);
	}
}
