package com.buddhika;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AddEjb
 */
@Stateless
@LocalBean
public class AddEjb {
	
	private int number1;
	private int number2;

	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int sum() {
		
		return number1+number2;
	}

  
}
