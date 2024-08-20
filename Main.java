
public class Main {
	public static void main(String[] args) {
		
		Doctor d=new Doctor();
		d.name="Vijay";
		d.age=23;
		d.employeeId="v17";
		d.setspecialization("BAMS");
		System.out.println(d.diagnosis());
		System.out.println(d.doctorDetails());
		
		
		Technician t=new Technician();
		t.name="Mallesh";
		t.age=23;
		t.employeeId="M18";
		t.setEquipment("Oxyzen Cylinder");
		System.out.println(t.operate());
		System.out.println(t.technicianDeatils());
		
		Nurse n=new Nurse();
		n.name="Vinodh";
		n.age=23;
		n.employeeId="V33";
		n.setWard("OPD");
		System.out.println(n.assist());
		System.out.println(n.nurseDetails());
		
	}

}
