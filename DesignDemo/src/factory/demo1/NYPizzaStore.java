package factory.demo1;

public class NYPizzaStore extends PizzaStore{
	
	/**
	 * 创建具体的披萨
	 */
	@Override
	protected Pizza createPizza(String type) {
		if("cheese".equals(type)){
			return new Pizza();//返回一个纽约风格的起司披萨new NYStyleCheesePizza()
		}
		if("clam".equals(type)){
			return new Pizza();//返回一个.......
		}
		//省略....
		return null;
	}

}
