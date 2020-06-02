public class Coronavirus {
	
	public static void main(String[] args) {
		Coronavirus catalunya = new Coronavirus();
		System.out.println(catalunya.toString());
		
		Coronavirus china = new Coronavirus(1000000F, 10000F);
		System.out.println(china.toString());
	}

	private float infeccio;
	private float mortaldat;

	public Coronavirus() {}

	public Coronavirus(float infeccio, float mortaldat) {
		this.infeccio=infeccio;
		this.mortaldat=mortaldat;
	}

	public float getInfeccio() {
		return infeccio;
	}

	public void setInfeccio(float infeccio) {
		this.infeccio = infeccio;
	}

	public float getMortaldat() {
		return mortaldat;
	}

	public void setMortaldat(float mortaldat) {
		this.mortaldat = mortaldat;
	}

	@Override
	public String toString() {
		return "Coronavirus: {infeccio:" + infeccio + ", mortaldat:" + mortaldat + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coronavirus other = (Coronavirus) obj;
		if (this.getInfeccio() != other.infeccio)
			return false;
		if (this.getMortaldat() != other.mortaldat)
			return false;
		return true;
	}

}