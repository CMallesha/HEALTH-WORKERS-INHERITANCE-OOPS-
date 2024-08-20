
public class Nurse extends HealthWorker {
	String ward;
	
	void setWard(String w) {
		this.ward=w;
	}
	
	String assist() {
		return "Nurse assisting in "+this.ward+" Ward";
	}
	
	String nurseDetails() {
		return this.details()+" ward:"+this.ward;
	}

}
