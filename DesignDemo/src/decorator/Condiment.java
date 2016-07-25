package decorator;

/**
 * 调料类（装饰者类）
 * 为了让调料类能够装饰取代饮料类，装饰者和被装饰对象有相同的超类
 * @author Mr.luo
 *
 */
public abstract class Condiment extends Beverage{
	//所有调料装饰者必须重新实现getDescription（）
	public abstract String getDescription();

}
