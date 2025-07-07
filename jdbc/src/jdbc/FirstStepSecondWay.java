package jdbc;
public class FirstStepSecondWay {
   public static void main(String[] args) {
	//load or register driver
	   //2nd way
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Completed");
	 }
	 catch (ClassNotFoundException e) {
		 e.printStackTrace();
	 }
}
}
