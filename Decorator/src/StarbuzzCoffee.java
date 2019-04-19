

public class StarbuzzCoffee {
	
	public static abstract class Beverage {	//����
		String description = "�������";
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
	
	public static abstract class CondimentDecorator extends Beverage {	//÷����
		
		
		public abstract String getDescription();
	}
	
	
	
	
	//------------���� ����---------------
	
	public static class Espresso extends Beverage {
		public Espresso() {
			description = "����������";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 1.99;
		}
	}
	
	public static class DarkRoast extends Beverage {
		public DarkRoast() {
			description = "��ũ�ν�Ʈ";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 0.99;
		}
	}
	
	public static class HouseBlend extends Beverage {
		public HouseBlend() {
			description = "�Ͽ콺����";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 0.89;
		}
	}
	
	public static class Decaf extends Beverage {
		public Decaf() {
			description = "��ī����";
		}

		@Override
		public double cost() {
			// TODO Auto-generated method stub
			return 1.05;
		}
	}
	
	//--------------------------------
	
	
	
	
	//---------------÷���� ����-----------------
	
	public static class Mocha extends CondimentDecorator {
		Beverage beverage;
		
		public Mocha(Beverage beverage){
			this.beverage = beverage;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", ��ī";
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
			return beverage.getDescription() + ", ����";
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
			return beverage.getDescription() + ", ������ũ";
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
			return beverage.getDescription() + ", ����ũ��";
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
