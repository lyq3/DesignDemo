package demo1;

/**
 * 具体的饮料实现类
 * 综合咖啡
 * @author Mr.luo
 *
 */
public class HouseBlend extends Beverage {
	public HouseBlend(){
		description="综合咖啡";//描述
	}
	@Override
	public double cost() {
		//业务逻辑省略...
		return 2.2;
	}

}
