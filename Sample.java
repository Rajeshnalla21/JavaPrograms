class Sample {
	public static int i=0;
	int a = 0;
	public int add(int b,int c){
		a=b+c;
		return a;
	}
	public static int sum(int x,int y){
		return x+y;
	}
	//public static double sum2(double x, double y){
	public static double sum(double x, double y){
		return x+y;
	}
	Sample(){
		for(int j=0;j<5;j++){
			i++;
		}
	}
	public static int get(){
		return i;
	}
	public int method1(){
		this.method2();
		return 1;
	}
	public void method2(){
		System.out.println("Hello");
	}
	public int method3(){
		return 9+10;
	}
}
