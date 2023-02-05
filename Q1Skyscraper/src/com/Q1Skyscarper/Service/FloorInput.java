package com.Q1Skyscarper.Service;

import java.util.*;
public class FloorInput {
	int numberOfFloor;
	int floor[];
	public int[] getData() {
		
		numberOfFloor = 0;
		
		try (Scanner sc = new Scanner(System.in)){
			
			System.out.println("Entet the total number of floors in the building");
			
			try {
			
				numberOfFloor =sc.nextInt();
				
			} catch (InputMismatchException e) {
				
				throw new InputMismatchException("Only positive Integers are allowed for Max Floors");
			}
		
			if (numberOfFloor < 1) {
			
				System.out.println("Max floors lesser than 1 is not allowed");
				throw new InputMismatchException("Expecting Positive integers");
			}
			
			floor  = new int[numberOfFloor];

			for (int i = 0; i < getMaxFloors(); i++) {
			
				int floorSize = 0;

				System.out.println("Enter the floor size given on day: "+(i+1));
			
				try {
					floorSize = sc.nextInt();
				
				} catch (InputMismatchException e) {
			
					throw new InputMismatchException("Only positive Integers are allowed"); 
				}
			
				if(floorSize > getMaxFloors()) {
				
					System.out.println("entered floor size is greater than Max Floors, retry");
					i--;
					continue;
				}
			
				if (duplicateFloorsCheck(floor, floorSize)) {
				
					System.out.println("entered floor size already exists, retry");
					i--;
					continue;
				}
			
				if (floorSize < 1) {
				
					System.out.println("Floor size lesser than 1 is not allowed, retry ");
					i--;
					continue;
				}
			
				floor[i] = floorSize;
			}
					
		} catch (InputMismatchException e) {
			
			System.out.println("Exception occured : " + e);
		}
		return floor;	
			
	}
	
	public  int getMaxFloors() {
		
		return numberOfFloor;
	}

	public boolean duplicateFloorsCheck(int floor[], int floorSize) {
	
		for (int i = 0; i < floor.length; i++) {
				
				if(floor [i] == floorSize) 
					
					return true;
		}
		
		return false;
	}


}
