package reusing_classes;

public class Ex_11_delegation {

	public static void main(String[] args) {
		DelgedDogFromMan dog = new DelgedDogFromMan();
		dog.walk();
		
	}
	
	public static DelgedDogFromMan getDelgedDogFromMan () {
		return new DelgedDogFromMan();
	}

}

class Man {
	void walk () {
		System.out.println("walk");
	}
}

class DelgedDogFromMan {
	Man man = new Man();
	void walk () {
		man.walk();			//		delegate method
	}
}