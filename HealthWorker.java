
public class HealthWorker {
	String name;
	int age;
	String employeeId;
	
	String work() {
		return this.name+"Emp is working";
	}
	
	String details() {
		return "Name:"+this.name+" age:"+this.age+" ID:"+this.employeeId;
		
	}

}
