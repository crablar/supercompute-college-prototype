package abstract_types;

/*
 * Class for Semaphore
 * 
 * Each decrement and increment returns the resulting sum/diff
 */

public class Semaphore extends Instance{
	private Character type;
	private int amount;
	
	public Semaphore(Character t){
		type = t;
		amount = 0;
	}
	
	public int increment(){
		return ++amount;
	}
	
	public int increment(int amt){
		amount += amt;
		return amount;
	}
	
	public int decrement(){
		if(amount == 0)
			throw new RuntimeException("Semaphore underflow!");
		return --amount;
	}
	
	public int decrement(int amt){
		if(amount - amt < 0)
			throw new RuntimeException("Semaphore underflow!");
		amount -= amt;
		return amount;
	}
	
	public Character getType(){
		return type;
	}

	public int getAmount() {
		return amount;
	}
	

}
