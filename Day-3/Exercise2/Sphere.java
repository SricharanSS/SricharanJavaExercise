package Exercise2;

class Sphere implements CalcVolume {
	int r;
	public int volume;
	
	Sphere(int num) {
		r = num;
	}
	
	public void Volume() {
		volume = ((r*r*r)*(22/7)*(4/3));
	}
}
