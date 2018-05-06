package com.oxoo88oo.months.program;

import java.util.Scanner;

import com.oxoo88oo.months.enums.Months;
import com.oxoo88oo.months.enums.Seasons;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static int proposal(){
		int i = 0;
		while(true){
		System.out.println("Enter '1' to show if the month exists or not exist \n" + 
						   "Enter '2' to show all months of given month season \n" +
						   "Enter \"3\" to show all months equal to amount of days of given month \n" +
						   "Enter \"4\" to show all months where amount of days less than amount of days of given month \n" +
						   "Enter \"5\" to show all months where amount of days more than amount of days of given month \n" +
						   "Enter \"6\" to show last season of given month season \n" +
						   "Enter \"7\" to show next season of given month season \n" +
						   "Enter \"8\" to show all months with even days count \n" +
						   "Enter \"9\" to show all months with no even days count\n" +
						   "Enter \"10\" to show given month has even days count or not \n");
		try{
		i = Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e){
			System.out.println("please enter number\n\n");
			continue;
		}
		if(i > 10 || i < 0)
			System.out.println("please enter number from '1' till '10'\n\n");
		
		else break;
		}
		
			return i;
	}
	
	
	public static String getMonth(){
		System.out.println("\f");
		System.out.println("enter month name\n");
		System.out.println("\n");
		return sc.nextLine();
	}

	public static void start() {
		int viborAct;
		
		while(true){
			viborAct = proposal();
			
			try{
			result(viborAct);
			}
			catch(IllegalArgumentException e){
				System.out.println("no, month name: '" + viborAct + "' isn\'t exist\n");
				//e.printStackTrace();
			}
			
			System.out.println("Enter 'e' to exit or any other keys to continue");
			if(sc.nextLine().toLowerCase().equals("e")) {
				System.out.println("Good bye");
				System.exit(0);}
			
		}
		
		
	}
	private static void result(int viborAct) throws IllegalArgumentException {
		Months month;		
		Months arr[] = Months.values(); 
		Seasons season = null;
		int tempDayCount = 0;
		int ordinalOfSeason;
		
		switch(viborAct){
		case 1: 
				month = Months.valueOf(getMonth().toUpperCase());
				System.out.println("yes, month '" + month + "' is exist\n\n" );						
			break;	
		
		case 2:
			month = Months.valueOf(getMonth().toUpperCase());
			season = month.getSeason();
			System.out.println(month + " belong to season of: " + season);
			System.out.print("'" + season + "' consist of: ");
											
			for(Months monthsTemp: arr){
				if(monthsTemp.getSeason().equals(season))
					System.out.print("'" + monthsTemp + "', ");
			}
			System.out.println("\b\b.\n\n");
			break;
			
		case 3:
			month = Months.valueOf(getMonth().toUpperCase());
			tempDayCount = month.getCountOfDays();
			System.out.print(month + " is equal by count days to: ");
			
			for(Months monthsTemp: arr){
				
				if(monthsTemp.getCountOfDays() == tempDayCount && 
						!monthsTemp.equals(month))
					System.out.print("'" + monthsTemp + "', ");
			}
			System.out.println("\b\b.\n\n");
			break;
			
		case 4:
			month = Months.valueOf(getMonth().toUpperCase());
			tempDayCount = month.getCountOfDays();
			System.out.print("Count of day of " + month +" is less than: ");
			for(Months monthsTemp: arr){
				if(monthsTemp.getCountOfDays() > tempDayCount)
					System.out.print("'" + monthsTemp + "', ");
			}
			System.out.println("\b\b.\n\n");
			break;
			
		case 5:
			month = Months.valueOf(getMonth().toUpperCase());
			tempDayCount = month.getCountOfDays();
			System.out.print("Count of day of " + month +" is more than: ");
			for(Months monthsTemp: arr){
				if(monthsTemp.getCountOfDays() < tempDayCount)
					System.out.print("'" + monthsTemp + "', ");
			}
			System.out.println("\b\b.\n\n");
			break;
			
		case 6:			
			month = Months.valueOf(getMonth().toUpperCase());
			season = month.getSeason();
			
			ordinalOfSeason = month.getSeason().ordinal();
			ordinalOfSeason++;
			if(ordinalOfSeason > 3) ordinalOfSeason = 0;
						
			for(Months monthsTemp: arr){
				if(ordinalOfSeason == monthsTemp.getSeason().ordinal())
					season = monthsTemp.getSeason();
				
			}
			System.out.println("The next season for " + month + " is " + season);
			
			break;
		case 7: 
			month = Months.valueOf(getMonth().toUpperCase());
			season = month.getSeason();
			
			ordinalOfSeason = month.getSeason().ordinal();
			ordinalOfSeason--;
			if(ordinalOfSeason < 0) ordinalOfSeason = 3;
						
			for(Months monthsTemp: arr){
				if(ordinalOfSeason == monthsTemp.getSeason().ordinal())
					season = monthsTemp.getSeason();
				
			}
			System.out.println("The previous season for " + month + " is " + season);
			
			break;
		case 8:
			System.out.print("all months with %2 days: ");
			for(Months monthsTemp: arr){
				if(monthsTemp.getCountOfDays()%2 == 0)
					System.out.print("'" + monthsTemp + "', ");
			}
			System.out.print("\b\b.\n\n");
			break;
			
		case 9:
			System.out.print("all months with !%2 days: ");
			for(Months monthsTemp: arr){
				if(monthsTemp.getCountOfDays()%2 != 0)
					System.out.print("'" + monthsTemp + "', ");
			}
			System.out.print("\b\b.\n\n");
			break;
			
		case 10:
			month = Months.valueOf(getMonth().toUpperCase());
			String not = "";
			if(month.getCountOfDays()%2 != 0) not = " not";
			System.out.println("month: " + month + " has" + not + " even days count");
			
			break;
		
		default: System.out.println("invalid number");// unreacheable
		}
		
	}

}
