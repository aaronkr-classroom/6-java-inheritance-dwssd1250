public class ex804 extends Math {

	public static void main(String[] args) {
		int a = 10, b = 5;
		double c = 2.5, d = 4.5;
		
		ex804 calc = new ex804();
		
		//add
		System.out.println(a + "+" + b + "=" + calc.add(a, b)); // (int, int)
		System.out.println(a + "+" + c + "=" + calc.add(a, c)); // (int, double)
		System.out.println(c + "+" + d + "=" + calc.add(c, d) + "\n"); // (double, double)
		
		//div
		System.out.println(a + "/" + b + "=" + calc.div(a, b)); // (int, int)
		System.out.println(a + "/" + c + "=" + calc.div(a, c)); // (int, double)
		System.out.println(c + "/" + d + "=" + calc.div(c, d) + "\n"); // (double, double)
		
		//sqr
		System.out.println(a + "^" + 2 + "=" + calc.sqr(a)); // (int)
		System.out.println(b + "^" + 2 + "=" + calc.sqr(b)); // (int)
		System.out.println(c + "^" + 2 + "=" + calc.sqr(c)); // (double)
		System.out.println(d + "^" + 2 + "=" + calc.sqr(d)); // (double)
	}

}
//Perfect!!