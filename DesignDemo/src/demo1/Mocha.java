package demo1;

/**
 * 装饰者的实现类（调料）
 * 摩卡类
 * @author Mr.luo
 *
 */
public class Mocha extends Condiment{
	//装饰者要能够引用一个饮料对其进行装饰
	Beverage beverage;
	
	public Mocha (Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+"-摩卡";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.5;
	}

}
