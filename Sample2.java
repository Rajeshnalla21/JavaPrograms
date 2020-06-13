class Sample2 {
	public static void main(String[] args){
		Sample s = new Sample();
		int sum = s.add(5,6);
		System.out.println(sum);
		int num1 = s.sum(1,2);
		double num2 = s.sum(2.8,3.5);  //method overriding
		System.out.println("int value"+num1);
		System.out.println("double value"+num2);
		int methodobj = s.method1();
		System.out.println(methodobj);//using this operator
		int objectsize = Sample.get();
		System.out.println(objectsize);
		int num3 = Sample.sum(2,3);//calling static to static
		int methodobj2 = s.method3();//calling non static method into static method
		System.out.println("num3 is "+num3);
		System.out.println(methodobj2);
		Sample2 name = new Sample2("Rajesh");
		System.out.println(name);
		int parse = Integer.parseInt("444",16);
		System.out.println("Parseint value is "+parse);

	}
	String name; 
    public Sample2(String name) 
    {
        this.name = name; 
    }
    // method 1 
    public String getName() 
    { 
        return name; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()); 
    } 
}
