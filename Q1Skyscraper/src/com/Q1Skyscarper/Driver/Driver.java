package com.Q1Skyscarper.Driver;

import com.Q1Skyscarper.Service.*;

public class Driver {

	public static void main(String[] args) {
		
		FloorInput input = new FloorInput();
		
		int floor[] = input.getData();
		
		FloorConstruction service = new FloorConstruction();
		service.floorsConstruction(floor);
		
	}

}