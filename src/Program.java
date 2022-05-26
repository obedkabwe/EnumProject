import java.util.Date;

import entities.Order;
import entities.enums.OderStatus;

public class Program {

	

	public static void main(String[] args) {


		
		Order order = new Order(12, new Date(), OderStatus.DELIVERED );
		
		
		
		System.out.println(order);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
