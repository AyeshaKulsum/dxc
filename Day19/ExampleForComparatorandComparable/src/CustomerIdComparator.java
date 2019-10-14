import java.util.Comparator;

public class CustomerIdComparator implements Comparator<Customer>{
@Override
public int compare(Customer o1, Customer o2) {
	// TODO Auto-generated method stub
	if (o1.getCustomerId() > o2.getCustomerId())
		return 0;
	else
		return -1;
}
}
