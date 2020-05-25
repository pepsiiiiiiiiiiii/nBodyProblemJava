/*
 * TO BE IMPLEMENTED
 * 
 * Creating new objects live
 * Easier input for the user overall
 * Selecting an object to see more info
 * Changing shit about an object in real time
 */

package nBodyProblem;

import java.util.ArrayList;

public class nBodyProblemMain {

	static float g = 39.5f;
	static float s = 0.15f;
	static float dt = 0.008f;
	
	public static void main(String[] args) {
		
		// Remove these in favor of user input later
		
		// Sun type body
		MassObject sun = new MassObject(500, 0, 0, 0, 0);
		
		// Planets
		MassObject p1 = new MassObject(30, 80, 80, 30, 30);
		MassObject p2 = new MassObject(50, 220, 250, 45, 45);
		
		// Make the array
		ArrayList<MassObject> objects = new ArrayList<MassObject>();
		
		// Start Sim
		sim(objects);
	}
	
	public static void sim(ArrayList<MassObject> objs) {
		
		while(true) {
		
			for(int i = 0; i < objs.size(); i++) {
				
				if(!objs.get(i).ignore()) {
					
					for(int x = 0; x < objs.size(); x++) {
						
						float ax = 0, ay = 0;
						
						if(x != i) {
							
							float f = (float) (g * objs.get(i).mass()/(dist(objs.get(i).x(), objs.get(x).x(), objs.get(i).y(), objs.get(x).y()) * Math.sqrt((dist(objs.get(i).x(), objs.get(x).x(), objs.get(i).y(), objs.get(x).y()) + s))));
							ax += (objs.get(i).x() - objs.get(x).x()) * f;
							ay += (objs.get(i).y() - objs.get(x).y()) * f;
							
							objs.get(i).updateStuff(dt,  ax,  ay);
						}
					}
				}
			}
			
			// Now draw
			
			
			
			// Blah blah stop check blah blah
		
			
			
		}
	}
	
	public static float dist(float x1, float x2, float y1, float y2) {
		
		return (float) (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
	}
}
