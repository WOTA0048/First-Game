package Game;

//------------------
//サイコロ振る
//-------------------

public class Teki {

		//外で使える変数
		public int Dice1,Dice2; //敵のサイコロ

		Random RD = new Random(); //読み込み

		//ｺﾝｽﾄﾗｸﾀ-------------------
		public Teki(){


		}


		//サイコロ振り-------------------
		public void dice(){
			Dice1 = RD.getRand1();
			Dice2 = RD.getRand1();
		}


}