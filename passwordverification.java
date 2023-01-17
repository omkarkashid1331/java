import java.util.Scanner;
class verification
 {
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	int attempt=0;
	int pin=1234;
	do{
		System.out.println("enter a pin:");
		int pass=sc.nextInt();
		if(pin==pass){
			System.out.println("login succesfull");
		
		break;
		}
		attempt++;
	}
	while(attempt<3);
	if(attempt==3){
		System.out.println("you have to many attempts");
	  }
    }	
  }

