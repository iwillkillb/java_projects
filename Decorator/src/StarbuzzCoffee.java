

public class StarbuzzCoffee {
	
	public static abstract class Beverage {	//음료
		String description = "제목없음";
		public String getDescription() {
			return description;
		}
		public abstract double cost();
		
		public enum Size {
			TALL, GRANDE, VENTI
		};
		Size size = Size.VENTI;
		
		public Size getSize () {
			return size;
		}
		public void setSize (Size size){
			this.size = size;
		}
	}
	
	public static abstract class CondimentDecorator extends Beverage {	//첨가물
		
		
		public abstract String getDescription();
	}
	
	
	
	
	//------------음료 연속---------------
	
	public static class Espresso extends Beverage {
		public Espresso() {
			description = "에스프레소";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 1.99;
		}
	}
	
	public static class DarkRoast extends Beverage {
		public DarkRoast() {
			description = "다크로스트";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 0.99;
		}
	}
	
	public static class HouseBlend extends Beverage {
		public HouseBlend() {
			description = "하우스블렌드";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 0.89;
		}
	}
	
	public static class Decaf extends Beverage {
		public Decaf() {
			description = "디카페인";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 1.05;
		}
	}
	
	//--------------------------------
	
	
	
	
	//---------------첨가물 연속-----------------
	
	public static class Mocha extends CondimentDecorator {
		Beverage beverage;
		
		public Mocha(Beverage beverage){
			this.beverage = beverage;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", 모카";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			double cost = beverage.cost();
			if(getSize() == Size.TALL){
				cost += 0.1;
			}
			else if(getSize() == Size.GRANDE){
				cost += 0.15;
			}
			else if(getSize() == Size.VENTI){
				cost += 0.2;
			}
			
			return cost;
		}
		
	}
	
	public static class Soy extends CondimentDecorator {
		Beverage beverage;
		
		public Soy(Beverage beverage){
			this.beverage = beverage;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", 두유";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			double cost = beverage.cost();
			if(getSize() == Size.TALL){
				cost += 0.05;
			}
			else if(getSize() == Size.GRANDE){
				cost += 0.1;
			}
			else if(getSize() == Size.VENTI){
				cost += 0.15;
			}
			
			return cost;
		}
		
	}
	
	public static class SteamMilk extends CondimentDecorator {
		Beverage beverage;
		
		public SteamMilk(Beverage beverage){
			this.beverage = beverage;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", 스팀밀크";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			double cost = beverage.cost();
			if(getSize() == Size.TALL){
				cost += 0.03;
			}
			else if(getSize() == Size.GRANDE){
				cost += 0.06;
			}
			else if(getSize() == Size.VENTI){
				cost += 0.1;
			}
			
			return cost;
		}
		
	}
	
	public static class Whip extends CondimentDecorator {
		Beverage beverage;
		
		public Whip(Beverage beverage){
			this.beverage = beverage;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", 휘핑크림";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			double cost = beverage.cost();
			if(getSize() == Size.TALL){
				cost += 0.03;
			}
			else if(getSize() == Size.GRANDE){
				cost += 0.06;
			}
			else if(getSize() == Size.VENTI){
				cost += 0.1;
			}
			
			return cost;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		Beverage beverage4 = new HouseBlend();
		beverage4 = new Mocha(beverage4);
		beverage4.setSize(CondimentDecorator.Size.TALL);
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
	}

}
