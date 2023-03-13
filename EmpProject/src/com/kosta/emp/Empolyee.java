package com.kosta.emp;

abstract public class Empolyee {
	String id;
	String name;
	
	Empolyee() {
	}
	
	Empolyee(String id, String name){
		this.id=id;
		this.name=name;
	}//생성자
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "사번 : "+ getId()+" 이름 : "+getName()+" 급여 : "+getPay();
	}//toString
	
	abstract public int getPay();
}//Empolyee