package stacks;

public class Stack {
	private int tos = 0;
	private int[] stack = new int [1024];
	
	public Stack(){
		
	}
	
	public Stack(int[] stack){
		this.stack = stack;
	}
	
	public boolean push(int x){
		if (!this.isFull()){
			++ tos;
			stack[tos] = x;
			return true;
		}else{
			return false;
		}
	}
	
	public void add(){
		this.push(this.pull() + this.pull());
	}
	public void subtract(){
		this.push(this.pull() - this.pull());
	}
	public void multiply(){
		this.push(this.pull() * this.pull());
	}
	public void divide(){
		this.push(this.pull() / this.pull());
	}
	public void mod(){
		this.push(this.pull() % this.pull());
	}
	
	public String toString(){
		String s_stack = "";
		
		for(int i = 0; i < tos; i++){
			s_stack = s_stack  + "\n Number " + this.stack[i] + " Position " + i;
		}
		
		return s_stack;
		
	}
	
	public int print_latest(){
		try{
		if(tos < 0) return 0;

		
		return stack[tos];
		}catch(Exception e){
			System.out.println("Dummy");
		}
		return tos;

	}

	public int pull(){
		if(tos < 0) return 0;
		
		return stack[tos--];
	}
	
	public boolean isFull(){
		return tos==1023;
	}
	public boolean isEmpty(){
		return tos<0;
	}

	
}
