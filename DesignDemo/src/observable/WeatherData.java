package observable;

import java.util.Observable;

/**
 * �۲���ģʽ���ɹ۲����ࣨ�����ࣩ
 * @author Mr.luo
 *
 */
public class WeatherData extends Observable{
	/**�¶�*/
	private float temperature;
	/**ʪ��*/
	private float humidity;
	/**ѹǿ*/
	private float pressure;
	
	public WeatherData() {
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	/**
	 * ��������
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
