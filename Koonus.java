public class Koonus{
    double r, h, m, m2;
    public Koonus(double raadius, double k6rgus, double moodustaja, double mass){
        if(raadius<=0){throw new RuntimeException("Sobimatu raadius");}
        if(k6rgus<=0){throw new RuntimeException("Sobimatu korgus");}
        if(moodustaja<=0){throw new RuntimeException("Sobimatu korgus");}
		if(mass<=0){throw new RuntimeException("Sobimatu mass");}
        r=raadius;
        h=k6rgus;
        m=moodustaja;
		m2=mass;
    }
    public double rpindala(){
        return 3.14*(r*r);
    }
    public double ruumala(){
        return 1.0/3*3.14*r*r*h;
    }
    public double pindala(){
        return 3.14* r *(r+m);
    }
	public double tihedus () {
		return m2/(1.0/3*3.14*r*r*h);
	}
}
