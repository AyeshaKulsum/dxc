
public class Main {

	public static void main(String args[]) {
		Customer2 customer1= new Customer2(1,"Kavya","Ongole",900);
		customer1.display();
		System.out.println("###########################");
	Customer2 customer2= new Customer2(2,"Ayesha","Mettur",1000);
	customer2.display();
		System.out.println("###########################");
	Customer2 customer3= new Customer2();
	customer3.display();
		System.out.println("###########################");
	Customer2 customer4= new Customer2(4,"Sharmila","Ap",2000);
	customer4.display();
		System.out.println("###########################");
	Customer2 customer5= new Customer2();
	customer5.display();
		System.out.println("###########################");
		Customer2 customer6= new Customer2(23,"Ayesh");
		customer6.display();
			System.out.println("###########################");
			customer1.setBillAmount(10000);
			System.out.println(customer1.getBillAmount());
			Customer2 customer10= new Customer2(1,"Kavya","Ongole",900);
			Customer2 customer11= new Customer2(2,"Kavya","Ongole",900);
			Customer2 customer12= customer10;
			System.out.println(customer10.equals(customer11));
			System.out.println(customer11.equals(customer12));
			System.out.println(customer10.equals(customer12));
			System.out.println(customer10.hashCode());
			System.out.println(customer11.hashCode());
			System.out.println(customer10.hashCode());
	}

}
