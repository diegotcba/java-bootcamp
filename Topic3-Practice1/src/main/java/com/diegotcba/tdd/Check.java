package com.diegotcba.tdd;

public class Check {

	private double amount;

	private static final String[] lowNames = {
	   "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
	   "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	private static final String[] tensNames = {
	   "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	private static final String[] bigNames = {
	   "thousand", "million", "billion"};

	public Check(double amount) {
		this.setAmount(amount);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAmountText() {
		String result="";
		String aux;
		String[] amountString;
		String cents="";
		String dollars="";
		
		aux=String.valueOf(amount);
		amountString=aux.split("\\.");
		if (!amountString[1].equals("0"))
		{
			cents=" and " + amountString[1]+"/100";			
		}
		
		dollars=convertIntToText(Integer.valueOf(amountString[0]));
		
		result=dollars + cents + " dollars";
		return result;
	}
	
	public String convertIntToText(int n) 
	{
	   if (n < 0) {
	      return "minus " + convertIntToText(-n); }
	   if (n <= 999) {
	      return convert999(n); }
	   String s = null;
	   int t = 0;
	   while (n > 0) {
	      if (n % 1000 != 0) {
	         String s2 = convert999(n % 1000);
	         if (t > 0) {
	            s2 = s2 + " " + bigNames[t-1]; }
	         if (s == null) {
	            s = s2; }
	          else {
	            s = s2 + ", " + s; }}
	      n /= 1000;
	      t++; }
	   return s; 
	}

	private String convert999 (int n) 
	{
	   String s1 = lowNames[n / 100] + " hundred";
	   String s2 = convert99(n % 100);
	   if (n <= 99) {
	      return s2; }
	    else if (n % 100 == 0) {
	      return s1; }
	    else {
	      return s1 + " " + s2; }
	}

	private String convert99 (int n) 
	{
	   if (n < 20) {
	      return lowNames[n]; }
	   String s = tensNames[n / 10 - 2];
	   if (n % 10 == 0) {
	      return s; }
	   return s + "-" + lowNames[n % 10]; 
	}	

}
