package Game;

//----------------------
//勝敗の表示と記録
//----------------------

public class Kekka {

	public int vc[] = new int[4];

	//ｺﾝｽﾄﾗｸﾀ-------------------
	public Kekka(){
	
	}

	public void count(int kekka){

		vc[kekka]++;
		System.out.println("勝："+vc[1]+"　　敗："+vc[2]+"　　引き分け："+vc[0]);
		System.out.println("");

	}
}
