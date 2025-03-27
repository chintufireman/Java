package interview.coding.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class EcommerceStreamQstn {

	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				new Order(101, "Alice", LocalDate.now().minusMonths(2),
						Arrays.asList(new Item("Laptop", "Electronics", 1200, 1),
								new Item("Headphones", "Electronics", 150, 2))),
				new Order(102, "Bob", LocalDate.now().minusMonths(8),
						Arrays.asList(new Item("T-Shirt", "Clothing", 20, 5), new Item("Jeans", "Clothing", 60, 2))),
				new Order(103, "Charlie", LocalDate.now().minusMonths(3),
						Arrays.asList(new Item("Smartphone", "Electronics", 800, 1))),
				new Order(104, "Alice", LocalDate.now().minusMonths(10),
						Arrays.asList(new Item("Refrigerator", "Appliances", 1000, 1))),
				new Order(105, "David", LocalDate.now().minusMonths(1),
						Arrays.asList(new Item("TV", "Electronics", 700, 1))),
				new Order(106, "Eve", LocalDate.now().minusMonths(5),
						Arrays.asList(new Item("Sneakers", "Footwear", 200, 2))),
				new Order(107, "Charlie", LocalDate.now().minusMonths(7),
						Arrays.asList(new Item("Groceries", "Groceries", 150, 3))));

//		1.Filter orders placed in the last 6 months containing 
//		at least one item worth $100 or more.

//		orders.stream()
//		.filter(e -> e.getOrderDate().isAfter(LocalDate.now().minusMonths(6)))
//		.filter(e-> e
//				.getItems()
//				.stream()
//				.anyMatch( item -> item.getPrice() >= 100))
//		.collect(Collectors.toList()).forEach(System.out::println);

//		2. Calculate total revenue generated for each item category.

//		orders.stream()
//		.flatMap(e -> e.getItems().stream())
//		.collect(Collectors.groupingBy(item -> item.getCategory()
//			, Collectors.summingDouble(s->s.getPrice())
//		))
//		.entrySet()
//		.forEach(System.out::println);

//		3. Identify the top 3 customers who spent the most in the past 12 months

		/*
		 * Map<String, Double> customerSpending = orders.stream() .filter(o ->
		 * o.orderDate.isAfter(LocalDate.now().minusYears(1)))
		 * .collect(Collectors.groupingBy( order -> order.customerName,
		 * Collectors.summingDouble(Order::getTotalOrderValue) ));
		 * 
		 * List<String> top3Customers = customerSpending.entrySet().stream()
		 * .sorted(Map.Entry.<String, Double> comparingByValue().reversed()) .limit(3)
		 * .map(Map.Entry::getKey) .collect(Collectors.toList());
		 * System.out.println("Top 3 Customers: " + top3Customers);
		 */
//	     4. Partition orders into two groups:**
//	     - **"High Value"** (total order value >= $500)
//	     - **"Regular"** (total order value < $500)

		/*
		 * orders.stream() .collect(Collectors .partitioningBy(order ->
		 * order.getTotalOrderValue() >= 500 , Collectors.toList())) .entrySet()
		 * .forEach(e -> e.getValue().stream() .forEach(o2 -> System.out
		 * .println("Customer name -> " + o2.getCustomerName() +
		 * ", Total order value -> " + o2.getTotalOrderValue()))); ;
		 */

//		5. For each customer, find their most expensive order 
//		and return a map of `<CustomerName, Order>`

		orders.stream().collect(Collectors.toMap(o -> o.getCustomerName(), o -> o,
				(o1, o2) -> o1.getTotalOrderValue() > o2.getTotalOrderValue() ? o1 : o2))
		.entrySet().forEach(System.out::println);

	}
}

class Order {
	int orderId;
	String customerName;
	LocalDate orderDate;
	List<Item> items;

	public Order(int orderId, String customerName, LocalDate orderDate, List<Item> items) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Ecom [orderId=" + orderId + ", customerName=" + customerName + ", orderDate=" + orderDate + ", items="
				+ items + "]";
	}

	public double getTotalOrderValue() {
		return items.stream().mapToDouble(Item::getTotalPrice).sum();
	}
}

class Item {
	String itemName;
	String category;
	double price;
	int quantity;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item(String itemName, String category, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", category=" + category + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}

	public double getTotalPrice() {
		return price * quantity;
	}
}