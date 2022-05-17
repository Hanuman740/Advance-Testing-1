package OopsInterface;

public class FortisHospital extends UNGC implements USMedical,UKMedical,IndiaMedical {
public void Physioservices() {
	System.out.println("FH--Physioservices");
}
public void Oncoservices() {
	System.out.println("FH--Oncoservices");
}
public void Cardioservices() {
	System.out.println("FH--Cardioservices");
}
public void EntServices() {
	System.out.println("FH--EntServices");
}
public void PediaServices() {
	System.out.println("FH--PediaServices");
}
public void orthoServices() {
	System.out.println("FH--orthoServices");
}
public void dentalServices() {
	System.out.println("FH--dentalServices");
}
public void test() {
	System.out.println("Covid-19");
}

}



