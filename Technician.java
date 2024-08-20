
public class Technician extends HealthWorker {
	String equipment;
	
	void setEquipment(String e) {
		this.equipment=e;
	}
	
	String operate() {
		return "technician is operating on Equipment "+this.equipment;
	}
	
	String technicianDeatils() {
		return this.details()+" Equipment: "+this.equipment;
	}

}
