
class Thread2 extends Thread
{
	private Shared s1;
	private Shared s2;

	// constructor to initialize fields
	public Thread2(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}

	// run method to start a thread
	@Override
	public void run()
	{
		System.out.println("t2 call test1 locking object s2");
		s2.test1(s1);
	}
}