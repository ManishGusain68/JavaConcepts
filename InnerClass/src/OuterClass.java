
public class OuterClass {
	
	class InnerClass{
		public void display() {
			System.out.println("this is a inner class method");
		}
	}
	
	
	
	void outerClassMethod() {
		
		System.out.println("method of outer class");
		
		class MethodLocalClass {
			void localInnerMethod() {
				System.out.println("in the method local class method");
			}
		}
		
		MethodLocalClass mlc=new MethodLocalClass();
		mlc.localInnerMethod();
	}

}
