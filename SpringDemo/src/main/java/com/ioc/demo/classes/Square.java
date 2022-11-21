package com.ioc.demo.classes;

import java.util.List;
import java.util.Set;

public class Square {
	List<point>list;
	Set<Integer>Nos;
	public Square(List<point> list, Set<Integer>nos ) {
		super();
		this.list = list;
		Nos = nos;
	}

	public List<point> getList() {
	return list;
	}
//
//	public void setList(List<point> list) {
//		this.list = list;
//	}
//
	public Set<Integer> getNos() {
		return Nos;
	}
//
//	public void setNos(Set<Integer> nos) {
//		Nos = nos;
//	}

	

}
