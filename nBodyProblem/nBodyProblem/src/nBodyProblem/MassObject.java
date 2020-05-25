package nBodyProblem;

public class MassObject {

	private float mass, x, y, vx, vy; // Mass, X position, Y position, X velocity, Y velocity
	private boolean ignore;
	
	public MassObject(float m, float xp, float yp, float xv, float yv) { // Constructor method duh
		
		mass = m;
		x = xp;
		y = yp;
		vx = xv;
		vy = yv;
		ignore = false;
	}
	
	// Interaction methods
	
	public void addMass(float nm) { // Adds mass (or takes away if thats your thing)
		
		mass += nm;
	}
	
	public void updateStuff(float dt, float ax, float ay) { // Updates all the move-y bits
		
		// Update velocity
		vx = ax * dt;
		vy = ay * dt;
		
		// Update position
		x += vx * dt;
		y += vy * dt;
	}
	
	public void kill() {
		
		mass = 0;
		x = 0;
		y = 0;
		vx = 0;
		vy = 0;
		ignore = true;
	}
	
	// Icky return methods
	// They literally just return the variable they share their name with
	
	public float mass() {
		
		return mass;
	}
	
	public float x() {
		
		return x;
	}
	
	public float y() {
		
		return y;
	}
	
	public float vx() {
		
		return vx;
	}
	
	public float vy() {
		
		return vy;
	}
	
	public boolean ignore() {
		
		return ignore;
	}
}
