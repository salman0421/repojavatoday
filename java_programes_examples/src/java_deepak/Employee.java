package java_deepak;

public class Employee {
	 private String name;
	 public String getName() {
	 return name;
	 }
	 public String setName(String name) {
	 return this.name = name;
	 }
	 public static void main(String[] args) {
		 Employee em=new Employee();
		 System.out.println(em.getName());
		String na=em.setName("salman khan");
		System.out.println(em.setName("salman khan"));
		
	 }
}
