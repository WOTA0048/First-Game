package Game;

public class Hantei {

	boolean playerzoro; //プレイヤーはゾロ目なのか
	boolean tekizoro; //敵はゾロ目なのか
	int result; //0 = null, 1 = win, 2 = lose, 3 = draw
	int playerMax; //プレイヤーの大きい方
	int tekiMax; //敵の大きい方
	int status; //状態

	//ｺﾝｽﾄﾗｸﾀ-------------------
	public Hantei(){
		playerzoro = false;
		tekizoro = false;
		result = 0;
		playerMax = 0;
		tekiMax = 0;
		status = 0;
	}



	//------------------
	//	勝敗
	//	勝敗はぞろ目が優先
	//	1-1>6-6>5-5>4-4>3-3>2-2
	//	数の合計が多いほうが勝ち
	//	0:引き分け
	//	1;ﾌﾟﾚｲﾔｰの勝ち
	//	2;敵の勝ち
	//-----------------
	public int judgment(int a,int b,int z,int x) {
		
		int ok,pf,tf;
		tf=pf=ok=0;
		
		if(a==b) pf=1;//ﾌﾟﾚｲﾔｰはぞろ目
		if(z==x) tf=1;//敵はぞろ目
		
		if(pf==1 && tf==1) {//両方ともぞろ目
			if(a==1 && z==1) return 0;//1-1引き分け
			if(a==1 ) return 1;//1-1ﾌﾟﾚｲﾔ勝利
			if(z==1 ) return 2;//1-1敵勝利
			if(a==z) return 0;//1-1以外引き分け
			if(a>z) return 1;//1-1以外ﾌﾟﾚｲﾔ勝利
			if(a<z) return 2;//1-1以外敵勝利
		}else{//どっちかぞろ目
			if(pf==1) return 1;//ﾌﾟﾚｲﾔ勝利
			if(tf==1) return 2;//敵勝利
		}
		//両方ぞろ目ではない!!
		if((a+b)>(z+x)) return 1;//合計がﾌﾟﾚｲﾔ勝利
		if((a+b)<(z+x)) return 2;//合計が敵勝利
		
		if((a+b)==(z+x)) {//出目合計が同じ
		
			//大きい数の大きいほうが勝ち??
			int n=Math.max(a,b);
			int m=Math.max(z,x);

			if(n==m) return 0;//大きい数が同じ引き分け
			if(n>m)return 1;//大きい数がﾌﾟﾚｲﾔ勝利
			if(n<m)return 2;//大きい数が敵勝利
		
			
		}

		return ok;
	}
		



	//------------------
	//	勝敗
	//	勝敗はぞろ目が優先
	//	1-1>6-6>5-5>4-4>3-3>2-2
	//	数の合計が多いほうが勝ち
	//	0:引き分け
	//	1;ﾌﾟﾚｲﾔｰの勝ち
	//	2;敵の勝ち
	//-----------------
	public int judgment2(int a,int b,int z,int x) {
		int pAll,tAll;
		pAll=a+b;tAll=z+x;
		if(a==b && a==1) pAll+=100;	//1-1=102
		if(a==b)  pAll+=50;			//6-6=62
		if(z==x && z==1) tAll+=100;
		if(z==x) tAll+=50;
		//大小判定!!----------------------------
		if(pAll>tAll) return 1;//合計がﾌﾟﾚｲﾔ勝利
		if(pAll<tAll) return 2;//合計が敵勝利
		if(pAll==tAll) {//出目合計==
			int n=Math.max(a,b);
			int m=Math.max(z,x);
			if(n==m) return 0;//大きい数が同じ引き分け
			if(n>m)return 1;//大きい数がﾌﾟﾚｲﾔ勝利
			if(n<m)return 2;//大きい数が敵勝利
		}
		return 0;
	}



}
