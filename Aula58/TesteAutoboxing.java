package Aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100l;
		Float num11 = 3.5f;
		Double num12 = 3.5555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//auto un-boxing
		int num13 = num9; //num9.intValue();
		
		//autoboxing em expressões
		num9++;
		
		System.out.println(num9);
		
		//auto un-boxing num9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13/num9;
		
		//mau uso do autoboxing / un-boxing
		Double a, b1 ,c;
		a = 10.0;
		b1 = 12.2;
		c= 4.7;
		
		Double media = (a+b1+c)/3;
		System.out.println(media);
		
	}

}
