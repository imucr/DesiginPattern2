package singleton.practice;

public class MeteorMedal implements Medal {

	private static MeteorMedal meteor = new MeteorMedal();
	
	private MeteorMedal(){
		
	}
	
	public static MeteorMedal getInstance(){
		return meteor;
	}
	
  @Override
  public void value() {
	  System.out.println("このメダルの価値は数えられません。");
  }
}
