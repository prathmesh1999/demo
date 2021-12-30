
public class Patient {
	String patientName="Mahesh";
	double height=1.65,weight=55;
	double computeBMI(){
		double BMI=weight/(height*height);
		return BMI;
	}
	public static void main(String[] args) {
		Patient patient=new	Patient();
		System.out.println("Patient Name: "+patient.patientName);
		System.out.println("Patient Height: "+patient.height+"m");
		System.out.println("Patient Weight: "+patient.weight+"Kg");
		System.out.printf("BMI of Patient is: %.2f",patient.computeBMI());
	}

}
