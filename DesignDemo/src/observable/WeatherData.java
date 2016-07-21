package observable;

import java.util.Observable;

/**
 * 观察者模式，可观察者类（主题类）
 * @author Mr.luo
 *
 */
public class WeatherData extends Observable{
	/**温度*/
	private float temperature;
	/**湿度*/
	private float humidity;
	/**压强*/
	private float pressure;
	
	public WeatherData() {
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	/**
	 * 设置数据
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
