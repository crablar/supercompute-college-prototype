package abstract_types;

import interfaces.*;

import java.util.ArrayList;

/*
 * An amalgam has a basic functional unit and a list of extensions in order of
 * when they were instantiated.  When an amalgam is disrupted, the controller of the disrupted
 * amalgam gets to distribute the disruption how he chooses.
 */

public class Amalgam extends Instance implements Disruptive, Adhesive{
	private int totalDisruption;
	private int totalAdhesion;
	private FoundationalUnit foundation;
	private ArrayList<Extension> extensions;
	
//	public void viewExtensions(){
//		//StringBuilder result = new StringBuilder();
//		int numTabs = 0;
//		for(int i = extensions.size() - 1; i >= 0; i--){
//			for(int j = 0; j < numTabs; j++)
//				System.out.print("\t");
//			System.out.print("\t" + extensions.get(i).getName();
//			
//		}
//	}
	
	public int getAdhesion() {
		return totalAdhesion;
	}
	
	public void loseAdhesion() {
	}

	public int becomeDisrupted(int amtDisruption) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void disrupt(Adhesive target, int amtDisruption) {
		// TODO Auto-generated method stub
		
	}
	
	public void addExtension(){
	
	}

	@Override
	public void beDisrupted(Adhesive target, int amtDisruption) {
		//ask player for amounts of disruption at each index of the extension array
		//getPlayerDisruptionDistribution(extensions);
	}

	@Override
	public void disrupt(Adhesive target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDisruption() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int setAdhesion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
