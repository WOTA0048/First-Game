package Game;

public class Player {
	//外で使える変数
	public int Dice1,Dice2; //プレイヤーのサイコロ2つ

	Random RD = new Random(); //読み込み

	//ｺﾝｽﾄﾗｸﾀ-------------------
	public Player(){


	}


	//サイコロ振り-------------------
	public void dice(){
		Dice1 = RD.getRand();
		Dice2 = RD.getRand();
	}



}
