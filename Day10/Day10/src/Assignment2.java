import java.util.Scanner;

public class Assignment2 {
	
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	private static Scanner  sc;
	
	
	public String toString() {
		return ("\nProduct \n********\nProduct ID: "+productId+"\nProduct Name: "+productName+"\nQuantity On Hand: "+quantityOnHand+"\nPrice: "+price);
	}

	
	public Assignment2() {
		
		this.productId = 0;
		this.productName = "NA";
		this.quantityOnHand = 0;
		this.price = 0;
	}
	
	


	public Assignment2(int productId, String productName, int quantityOnHand, int price) {
		this();
		
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}



	public static void main(String[] args) {
		
		 sc = new Scanner(System.in);
		int retrieve=0;
		
		Assignment2 product1 = new Assignment2(1001,"Endurance BT",5,2365);
		Assignment2 product2 = new Assignment2(1002,"OnePlus 6T",2,37999);
		Assignment2 product3 = new Assignment2(1003,"RTX 2060",4,38999);
		Assignment2 product4 = new Assignment2(1004,"i7 9900k",2,35000);
		Assignment2 product5 = new Assignment2(1005,"Corsair Scimitar Pro",4,5999);
		
		System.out.println("Enter the Product ID: ");
		retrieve =sc.nextInt();
		
		switch(retrieve){
			
		case 1001:
			System.out.println(product1);
			break;
			
		case 1002:
			System.out.println(product2);
			break;
		
		case 1003:
			System.out.println(product3);
			break;
			
		case 1004:
			System.out.println(product4);
			break;
			
		case 1005:
			System.out.println(product5);
			break;
			
		default:
			System.out.println("The product with Product ID: "+retrieve+" doesn't exist.");
			System.out.println("Thank you for using this application.");
			System.out.println("-------------------------------------");
			System.exit(0);
		}
	}

}