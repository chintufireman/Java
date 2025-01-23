package predicates;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 1;
		System.out.println(supplier.get());
	}
}
