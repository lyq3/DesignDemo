package decorator.demo1;

/**
 * 具体的饮料实现类
 * 浓缩咖啡
 * @author Mr.luo
 *
 */
public class Espresso extends Beverage {
	public Espresso(){
		description="浓缩咖啡";//描述
	}
	@Override
	public double cost() {
		//业务逻辑省略...
		return 1.2;
	}

}
