class Student{
	
		private String name;
		private int exam1;
		private int exam2;
		private int exam3;
		

		String getName(){
			return name;
		}
		
		boolean validateMarks(int marks)throws Exception{
		if(marks>0 && marks<=100){
			return true;
		}
		else{

			return false;
			
		}
	}
	
	Student (String name,int e1, int e2, int e3)throws Exception{
		this.name=name;
			
		if(validateMarks(e1)&& validateMarks(e2)&& validateMarks(e3)){
			exam1=e1;
			exam2=e2;
			exam3=e3;
		}
		else{
				System.out.println("Exam Scores must be Between 0 to 100");
				throw new Exception ("Notice is Invalid!!!");
			}
		}
		
		
		int getExam1(){
			return exam1;
		}
		
		int getExam2(){
			return exam2;
		}
		
		int getExam3(){
			return exam3;
		}
		
	double CalculateAverage(){
		double avg;
		avg=(exam1+exam2+exam3)/3;
		return avg;
	}
		
	
}
class CalculateAvg{
	public static void main(String[] args){
	

	try {
		Student s1=new Student("John",75,110,90);
		Student s2=new Student("jw",75,100,90);
		Student s3=new Student("JD",7,100,90);
		System.out.println("Student "+s1.getName()+" Average is "+s1.CalculateAverage());
		System.out.println("Student "+s2.getName()+" Average is "+s2.CalculateAverage());
		System.out.println("Student "+s3.getName()+" Average is "+s3.CalculateAverage());
		}
		catch(Exception e){
			System.out.println("Notice is Invalid!!!");
			System.out.println("The Error is "+e.getMessage());
		}
		
	}
}

