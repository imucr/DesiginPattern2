package singleton.practice;

public class Main {
	public static void main(String[] args){
		NormalMedal n1 = new NormalMedal();
		n1.value();
		
		NormalMedal n2 = new NormalMedal();
		n2.value();
		
		if(n1!=n2){ //MEMO アプリを実行した時に結果が出力できるように
			System.out.println("-> "+"n1とn2は異なるインスタンス"); 
		}
		
		System.out.println("====================="); 
		
		MeteorMedal m = MeteorMedal.getInstance();
		MeteorMedal m2 = MeteorMedal.getInstance();
		
		m.value();
		m2.value();
		
		if(m==m2){
			System.out.println("-> "+"二つは同じ"); //MEMO singletonが普通のインスタンスの生成と違う結果になることを出力した方が良いです。
		}
		
	}
}
