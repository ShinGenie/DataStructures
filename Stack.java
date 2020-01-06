/**
 * Stack
 */
public class Stack {

	// stack 크기를 정해야 한다 int[] arr = new int[10];  
  //stack a+b*c 후위표기
	// a넣었다 빼고 + 연산자 넣고 b 넣었다 빼고 * 연산자 넣기전에 +연산자 빼고 
	// * 연산자 넣고 + 연산자 넣고 c 연산자 넣었다 빼고 +연산자 빼고 * 연산자 뺀다

	String[] arr = new String[10];
	int top=0;
	String cur;//pop 하고난 꼭대기
	String val;//push할때 꼭대기
	public void push(String val){
		// int a 가 들어왔을때 배열에 차례로 담겨야한다 
		this.val = val;
		arr[top] = this.val;
		//System.out.println(this.val);
		System.out.println("[push] " + arr[top]);
		top = top + 1;
	}

	public String pop(){
		if (top >= 0){
			val = arr[--top];
			System.out.println("[pop] " + val);
			return val;
		}else {
			System.out.println("stack is empty");
			return null;
		}
	}

	// 연산자 우선순위 함수를 만들어야한다
	// * / + -  
	// 만약 * / + - 이고 우선순위  + 가 / 보다 먼저 들어왔을때   
	// 입력받는 수가 있어야 하는구나 !! 
	// 입력받는 수를 받고, 변수에 담고, 변수에 담은 글자를 하나하나 쪼개고,
	// 쪼갠 값을 배열에 담아서 스택 함수에 넣는다.
	// "a*b+c" 을 입력받음.
	// 
 

	String cal = "aaaa";

	array_word = cal.split("");



	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("a");
		s.pop();
		s.push("+");
		s.push("b");
		s.pop();
		s.pop();
		s.push("*");
		s.push("+");
		s.push("c");
		s.pop();
		s.pop();
		s.pop();
		
	}
}