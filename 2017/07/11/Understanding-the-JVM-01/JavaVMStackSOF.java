/**
* VM Args: -Xss128k
* @author armysheng
*/
public class JavaVMStackSOF {
	private int stackLength = 1;
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
}
public static void main(String[] args) throw Throwable {
	JavaVMStackSOF oom = new JavaVMStackSOF();
	try{
		oom.stackLeak();
	}catch(Throwable e) {
		System.out.println("stack length:" + oom.length);
		throw e;
	}
}