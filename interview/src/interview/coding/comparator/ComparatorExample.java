package interview.coding.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employe> emplist = new ArrayList<Employe>();
		createEmpList(emplist);
		System.out.println("Employee List before sorting");
		/*
		 * emplist.forEach(e ->
		 * System.out.println(e.getName()+"-"+e.getId()+"-"+e.getCity()));
		 * emplist.sort(Comparator.comparing(Employe :: getName));
		 * System.out.println("Employee list after sorting"); emplist.forEach(e ->
		 * System.out.println(e.getName()+"-"+e.getId()+"-"+e.getCity()));
		 * System.out.println("Employee list after sorting in reversed order");
		 * emplist.sort(Comparator.comparing(Employe :: getName).reversed());
		 * emplist.forEach(e ->
		 * System.out.println(e.getName()+"-"+e.getId()+"-"+e.getCity()));
		 */
		Comparator<Employe> groupBySorting = Comparator.comparing(Employe :: getCity).
				thenComparing(Employe::getName);
		emplist.sort(groupBySorting);
		emplist.forEach(e -> System.out.println(e.getCity()+" - "+e.getName()));
	}
	
	static void createEmpList(List<Employe> emp) {
		Employe e1 = new Employe("Rajat", 01, "aurangabad");
		Employe e2 = new Employe("Swarnim", 02, "agra");
		Employe e3 = new Employe("Harsh", 03, "delhi");
		Employe e4 = new Employe("Dokh", 04, "h");
		Employe e5 = new Employe("gandu", 05, "mumbai");
		Employe e6 = new Employe("akki", 06, "mumbai");
		Employe e7 = new Employe("tupe", 07, "mumbai");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
	}
}
