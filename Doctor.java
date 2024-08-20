
public class Doctor extends HealthWorker {
	String specialization;
	
	void setspecialization(String s) {
		this.specialization=s;
	}
	
	String diagnosis() {
		return this.name+" doctor diagnosis client";
	}
	
	String doctorDetails() {
		return this.details()+" Specialization:"+this.specialization;
	}
	

}
