import java.util.ArrayList;

public class Amalgam extends Instance implements Disruptive, Adhesive{
	private int topDisruption;
	private int topAdhesion;
	private int totalAdhesion;
	private FoundationalUnit foundation;
	private ArrayList<Extension> extensions;
	
	public int getAdhesion() {
		return 0;
	}
	
	public int setAdhesion() {
		return 0;
	}
	
	public void disrupt(Adhesive target) {
	}
	
	public int becomeDisrupted(){
		return 0;
	}
	
	
	
}
