package demo1;

/**
 * 测试类
 * @author Mr.luo
 *
 */
public class Test {
	public static void main(String[] args) {
		Beverage beverage=new Espresso();//来一杯浓缩咖啡
		System.out.println("描述："+beverage.getDescription());
		System.out.println("价格："+beverage.cost());
		
		Beverage beverage2=new HouseBlend();//来一杯综合咖啡
		//加点摩卡
		beverage2=new Mocha(beverage2);
		//再加点摩卡
		beverage2=new Mocha(beverage2);
		System.out.println("描述："+beverage2.getDescription());
		System.out.println("价格："+beverage2.cost());
	}
}
