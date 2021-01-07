package com.qa.main;

public class Play {
	
	int number1;
	int number2;
	int bigger;
	
	public Play (int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}
	
	public int playCompare() {
		if (this.number1 > 21 && this.number2 > 21) {
			System.out.println("Both hands fold");
			return 0;
		}
		
		else if (this.number1 <= 0 || this.number2 <= 0) {
			System.out.println("One of the numbers if below or equal to 0");
			return 0;
		}
		
		else if (this.number1 == this.number2) {
			System.out.println("These numbers are the same");
		}
		else if (this.number1 > 21) {
			return this.number2;
		}
		
		else if (this.number2 > 21) {
			return this.number1;
		}
		
		if (this.number1 > this.number2) {
			bigger = this.number1;
		}
		
		else if (this.number1 < this.number2) {
			bigger = this.number2;
		}
		return bigger;
	}
}

