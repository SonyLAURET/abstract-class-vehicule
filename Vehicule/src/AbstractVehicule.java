public abstract class AbstractVehicule implements Vehicule {
	private float north;
	private float south;
	private float west;
	private float east;
	private float speed;
	private Position pos;
	private float poids;
	private String marque;
	private String couleur; 
	private String modele;

	public AbstractVehicule() {
		north = 0.0F;
		south = 0.0F;
		west = 0.0F;
		east = 0.0F;
		speed = 0.0F;
		pos= new Position();
		couleur="";
		modele="";
		marque="";
		poids=0.0F;
	}

	public Position getPosition() {
		return this.pos;
	}
	public AbstractVehicule(float north, float south, float west, float east,float speed,Position pos,float poids,String Marque,String Couleur,String Modele) {
		this.north = north;
		this.south = south;
		this.west = west;
		this.east = east;
		this.pos=pos;
		this.speed=speed;

	}

	public void setDirection(float north, float south, float west, float east) {
		this.north = north;
		this.south = south;
		this.west = west;
		this.east = east;

	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

}
