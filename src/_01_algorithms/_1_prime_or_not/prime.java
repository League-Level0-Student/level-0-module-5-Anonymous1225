package _01_algorithms._1_prime_or_not;

public class prime {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("2");
	System.out.println("3");
	System.out.println("5");
	int p=(5);
	boolean pr = true;
	int num=0;
	while (0==0) {
		p+=2;
		double exy =(Math.pow(p, 0.5));
		while (exy>1) {
			exy-=1;
			num+=1;
		}
		while (num>1) {
			pr = p/num!=0;
		}
		if (pr==true) {
			System.out.println(p);
		}
		
	}
	}

}
