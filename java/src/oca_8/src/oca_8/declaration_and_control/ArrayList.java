package oca_8.declaration_and_control;

//	import java.util.ArrayList;			CE conflict with class name


@SuppressWarnings("unused")
public class ArrayList {

	private final int x = 5;
	
	public static void main(String[] args) {
		

		ArrayList a = new ArrayList();
		System.out.println(a.x);
		
//		ArrayList<String> arrayList = new ArrayList<>();		CE 
		java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();

	}

}
