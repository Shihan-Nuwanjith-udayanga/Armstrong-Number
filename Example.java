import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input a Integer Number :");
		int num=input.nextInt();
		int num1 =num;
		int remain;
		int cube=0;
		while(num1 !=0){
			remain=num1%10;
			cube=cube+(remain*remain*remain);
			num1=num1/10;
		}if(cube == num){
				System.out.println(num +"Is an Armstrong number");
			}else{
				System.out.println(num +"Is not Armstrong number");
			}
	}
}
