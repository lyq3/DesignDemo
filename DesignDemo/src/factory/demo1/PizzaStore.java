package factory.demo1;

/**
 * 披萨店的父类，所有披萨店继承此类
 * @author Mr.luo
 *
 */
public abstract class PizzaStore {
	
	/**
	 * 创建披萨，由各个披萨店自己决定
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
	
	/**
	 * 订购披萨
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
		
	}
}
