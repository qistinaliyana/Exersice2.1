
public class Main {

	public static void main(String[] args) {
		Perfume V = new Perfume();
		V.Brand = "Victori'as Secret";
		V.Model = "Victori'as secret BombShell New York edp";
		V.ML = 100;
		V.MadeIn = "U.S.A";
		V.Colour = "Black and pink";
		System.out.println(V.Brand);
		System.out.println(V.Model);
		System.out.println(V.ML + "ML");
		System.out.println(V.MadeIn);
		System.out.println(V.Colour);
		V.open();
		V.sprayVictoria();
		V.close();
		
		
		Perfume YSL = new Perfume();
		YSL.Brand = "Yvessaintlaurent(YSL)";
		YSL.Model = "YSL Mon Paris";
		YSL.ML = 90;
		YSL.MadeIn = "France";
		YSL.Colour = "Black, pink, and white";
		System.out.println(V.Brand);
		System.out.println(V.Model);
		System.out.println(V.ML + "ML");
		System.out.println(V.MadeIn);
		System.out.println(V.Colour);
		YSL.open();
		YSL.sprayYSL();
		YSL.close();	
	}
}
