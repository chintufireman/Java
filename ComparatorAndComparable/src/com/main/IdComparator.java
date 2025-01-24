package com.main;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp arg0, Emp arg1) {
		return arg0.getId() - arg1.getId();
	}

}
