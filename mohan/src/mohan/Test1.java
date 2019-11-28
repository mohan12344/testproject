package mohan;


 class Test1 extends Demo1 {
		public void set(int a)
		{
			System.out.println(this.a=a);	
		}
	
	public static void main(String [] args)
	{
	Test1 t= new Test1();
	t.set(20);
	}
	
}
