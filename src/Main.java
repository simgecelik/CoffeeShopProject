import Adapters.MernisServiceAdapters;
import Concrete.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1,"Engin","Demiroð","12345678901",1998));
		

	}

}
