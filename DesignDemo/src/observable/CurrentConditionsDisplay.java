package observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	/**�ɹ۲��߶���(�������)*/
	Observable observable;
	/**�¶�*/
	private float temperature;
	/**ʪ��*/
	private float humidity;
	
	
	/**
	 * ���췽����������󴫵ݹ�����
	 * ���۲��߼��뵽��������
	 * @param observable
	 */
	public CurrentConditionsDisplay(Observable observable) {
		super();
		this.observable=observable;
		observable.addObserver(this);
	}

	/**
	 * �������������ݶ�����Ϊ����
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
		System.out.println("ʪ��:"+humidity+"\n"+"�¶�:"+temperature);
	}
}
