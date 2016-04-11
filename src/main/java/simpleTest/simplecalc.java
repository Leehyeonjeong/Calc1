package simpleTest;

public class simplecalc {
	private int result;
	
	public void add(int a,int b){
		result = a+b;
	}
	
	public int getresult(){
		return result;
	}
	
	public void sub(int a,int b){
		result=a-b;
	}


	public void mul(int a,int b){
		result=a*b;
	}
	public void div(int a,int b){
		if(b!=0) result=a/b; // b가 0인경우
		}
	public void inc(int a){
		result+=a;
	}
}
