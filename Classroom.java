public class Classroom{
	
	public static void main(String[] args) {
		Wilder ario = new Wilder("Ario", true);
		System.out.println(ario.whoAmI());
		ario.setAware(false);
		System.out.println(ario.whoAmI());
	}
	
}