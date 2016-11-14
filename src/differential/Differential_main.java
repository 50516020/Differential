package differential;

import java.util.Scanner;



public class Differential_main {
	

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Input value of a>");
		double a =Double.parseDouble(scan.next());
		
		System.out.print("Input value of h>");
		double h  =Double.parseDouble(scan.next());
		// TODO Auto-generated method stub

		Differential_lib dlib= new Differential_lib(a,h);
	    System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());

	    System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
	    
	    System.out.println("相対誤差＝｜理論値ー計算値｜/理論値＊100="+dlib.getSx());
	    
	    /*
	     精度が一番良かった時のｈの値は0.000000008
	     */
}
}