public class Covid19 extends Coronavirus {

	private int diesDeQuarentena;
	
	public Covid19() {
		super();
	}

	public Covid19(float infeccio, float mortaldat, int diesDeQuarentena) {
		super(infeccio, mortaldat);
		this.diesDeQuarentena = diesDeQuarentena;
	}

	public int getDiesDeQuarentena() {
		return diesDeQuarentena;
	}

	public void setDiesDeQuarentena(int diesDeQuarentena) {
		this.diesDeQuarentena = diesDeQuarentena;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Covid19 other = (Covid19) obj;
		if (diesDeQuarentena != other.diesDeQuarentena)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Covid19 {diesDeQuarentena:" + diesDeQuarentena + "}";
	}
	
	
	
}
