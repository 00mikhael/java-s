class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		alpha = a;
	}
	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		//you cannot access alpha like this:
		//ob.alpha = 10;
		//these are ok because beta and gamma are public
		ob.beta = 88;
		ob.gamma = 99;
		
	}
}
