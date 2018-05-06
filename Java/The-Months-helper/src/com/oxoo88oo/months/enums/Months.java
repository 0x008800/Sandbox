package com.oxoo88oo.months.enums;

public enum Months {
	

	DECEMBER(31, Seasons.WINTER),
	JANUARY(31, Seasons.WINTER),
	FEBRUARY(28, Seasons.WINTER),
	MARCH(31, Seasons.SPRING),
	APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING),
	JUNE(30, Seasons.SUMMER),
	JULY(31, Seasons.SUMMER),
	AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.AUTUMN),
	OCTOBER(31, Seasons.AUTUMN),
	NOVEMBER(30, Seasons.AUTUMN);
	
	private int day;
	private Seasons season;
	
	Months(int day, Seasons season){
		this.day = day;
		this.season = season;
	}
	public int getCountOfDays(){
		return day;
	}
	public Seasons getSeason(){
		return season;
	}
}
