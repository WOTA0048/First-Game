package Game;

public class Game_Main {
	//-----------------------
	//インスタンス
	//-----------------------

	Random RN = new Random();
	Player PL = new Player();
	//Player PL2 = new Player();
	Teki TK = new Teki();
	//Teki2 TK2 = new Teki2();
	Hantei HT = new Hantei();
	Kekka K = new Kekka();


	//-----------------------
	//  コンストラクタ
	//-----------------------

	public Game_Main(){

		int kekka = 0;

		for (int i = 0; i <50; i++){
			//二人サイコロ振る-------
			PL.dice();
			TK.dice();
			//サイコロ表示-----------
			System.out.println("プレイヤー：　"+PL.Dice1+"　　"+PL.Dice2);
			System.out.println("敵："+TK.Dice1+"　　"+TK.Dice2);
			//サイコロ判定-----------
			kekka = HT.judgment(PL.Dice1,PL.Dice2,TK.Dice1,TK.Dice2);
			K.count(kekka);
			if ((K.vc[1] >= 3) ||  (K.vc[2] >= 3)) break;
		}
	}

	public void rnd_check(){
		int []rc = new int[10];
		for (int i=0; i<1000 ; i++ ){
			int a = RN.getRand();
			rc[a]++; 
		}
		System.out.println("1: "+rc[1]);
		System.out.println("2: "+rc[2]);
		System.out.println("3: "+rc[3]);
		System.out.println("4: "+rc[4]);
		System.out.println("5: "+rc[5]);
		System.out.println("6: "+rc[6]);

	}




	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Game_Main GM = new Game_Main();

	}

}
