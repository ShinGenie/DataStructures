import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * HelloWorld
 */
public class HelloWorld {

	public void pivonachi(){
		int x = 0;
		int y = 1;
		int z = 2;
		int hap = x + y + z ;
		int [] arr = new int[20];
		System.out.println("arr[0] : " + x);
		System.out.println("arr[1] : " + y);
		System.out.println("arr[2] : " + z);
		System.out.println("arr[3] : " + hap);

		for ( int i=4; i<arr.length; i++ ){
			x = y;
			y = z;
			z = hap;
			hap = x + y + z;
			arr[i] = hap;
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}

    public static void main(String[] args) {
			HelloWorld cal = new HelloWorld();
			cal.pivonachi();
      System.out.println("피보나치 수열 과제 끝!");
    }    
}