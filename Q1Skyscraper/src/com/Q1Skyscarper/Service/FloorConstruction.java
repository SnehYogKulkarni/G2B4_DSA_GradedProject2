package com.Q1Skyscarper.Service;

import java.util.*;
public class FloorConstruction {

	int max;
	PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
	
	public void floorsConstruction(int floor[]) {

		System.out.println("The order of construction is as follows");
		
		System.out.println();
		
		int numberOfFloor = floor.length;
		max = numberOfFloor;

		for (int i = 0; i < numberOfFloor; i++) {
			
			
			System.out.println("Day: " + (i + 1));

			queue.add(floor[i]);

			while (!queue.isEmpty() && queue.peek() == max) {
		
				System.out.print(queue.poll() + "    ");
				max--;
				
			}

			System.out.println("\n");
		}
	}
}

