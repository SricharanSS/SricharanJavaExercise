package Exercise2;

class Cuboid implements CalcVolume {
	int a;
	public int volume;
	
	Cuboid(int num) {
		a = num;
	}
	
	public void Volume() {
		volume = a*a*a;
	}
}