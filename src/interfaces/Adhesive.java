package interfaces;

public interface Adhesive {
	public int getAdhesion();
	public int setAdhesion();
	void beDisrupted(Adhesive target, int amtDisruption);
}
