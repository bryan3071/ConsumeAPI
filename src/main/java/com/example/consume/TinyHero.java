package com.example.consume;

public class TinyHero {
	
	private String name;
	private String innovation;
	private int year;
	public TinyHero(String name, String innovation, int year) {
		super();
		this.name = name;
		this.innovation = innovation;
		this.year = year;
	}
	public TinyHero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInnovation() {
		return innovation;
	}
	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "TinyHero [name=" + name + ", innovation=" + innovation + ", year=" + year + "]";
	}
	
	
	

}
