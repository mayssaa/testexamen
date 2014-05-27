package edu.esprit.examen;

public class exam {
	public exam(){
	
	}
	public int process(int n){
		if(n<2)
		{return 60;
		}
		else
		{
			return process(n-1)+process(n-2);
			
		}
	}

}
