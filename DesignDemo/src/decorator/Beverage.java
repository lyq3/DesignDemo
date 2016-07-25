package decorator;

/**
 * 装饰者模式
 * 星巴克咖啡---饮料超类
 * @author Mr.luo
 *
 */
public abstract class Beverage {
	//description属性用于描述咖啡（饮料）
	String description="Unknown Beverage";
	
	/**
	 * 获取饮料的描述get方法
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 计算价格的方法，在子类中实现
	 * @return
	 */
	public  abstract double cost();
	
}
