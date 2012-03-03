import java.util.ArrayList;

/*
 * An amalgam has a basic functional unit and a list of extensions in order of
 * when they were instantiated.  When an amalgam is disrupted, the controller of the disrupted
 * amalgam gets to distribute the disruption how he chooses.
 */

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
	
	public int becomeDisrupted(){
		return 0;
	}

	@Override
	public int becomeDisrupted(int amtDisruption) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void disrupt(Adhesive target, int amtDisruption) {
		// TODO Auto-generated method stub
		
	}
	
	public void addExtension()
	
	
	
}
