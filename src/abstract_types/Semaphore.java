package abstract_types;

public class Semaphore extends Instance{
	private Character type;
	private int amount;
	
	public void increment(){
		amount++;
	}
	
	public void increment(int amt){
		amount += amt;
	}
	
	public Character getType(){
		return type;
	}
	
	public Semaphore(Character t){
		type = t;
		amount = 0;
	}
	
}
