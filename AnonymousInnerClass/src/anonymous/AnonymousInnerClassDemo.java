package anonymous;

public class AnonymousInnerClassDemo {
	
	public static void main(String[] args) {
		Bicycle mb=new MountainBike();
		mb.canApplyBreak();
		mb.canSpeedUp();
		//below is anonymous class     ctrl+space
		Bicycle by=new Bicycle() {
			
			@Override
			public void canSpeedUp() {
				System.out.println("can speed up mountain bike");
				
			}
			
			@Override
			public void canApplyBreak() {
				System.out.println("can apply break");
				
			}
		};
		
		by.canSpeedUp();
		by.canApplyBreak();
		
	}

}
