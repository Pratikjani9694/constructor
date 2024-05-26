class student
{
	int id;
	String name;
	student() // no parameter
	{
		id=10;
		System.out.println(" No parameter : "+id);
	}
	student(int id,String name) //with parameter
	{
		this.id=id;
		this.name=name;
		System.out.println("with parameter :"+id);
		System.out.println("with parameter :"+name);
	}
	student(student s) //copy constructor
	{
		id=s.id;
		name=s.name;
		System.out.println("with parameter :"+id);
		System.out.println("with parameter :"+name);
	}
}
class constructor
{
	public static void main(String args[])
	{
		student s1 = new student();
		student s2 = new student(10,"priyanka");
		student s3 = new student(s2);
		s3=s2; ////copy constructor s2
	}
}