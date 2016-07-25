package factory.demo1;

public class NYPizzaStore extends PizzaStore{
	
	/**
	 * 创建具体的披萨
	 */
	@Override
	protected Pizza createPizza(String type) {
		if("cheese".equals(type)){
			return new NYStyleCheesePizza();
		}
		if("clam".equals(type)){
			return new Pizza();//返回一个.......
		}
		//省略....
		return null;
	}

}
