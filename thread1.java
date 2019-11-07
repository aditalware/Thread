public class thread1 extends Thread
{
public void run()
{
System.out.println("running");
System.out.println(Thread.currentThread().getName());//to know which thread is working

}

public static void main(String args[])
{
    thread1 a=new thread1();
    a.start();//isme run ko call karne ka prototype hai
    //only agar run call kiya to thread nahi ban payega
    //a.run() se naya thread nahi banega hi nahi.
}

}
