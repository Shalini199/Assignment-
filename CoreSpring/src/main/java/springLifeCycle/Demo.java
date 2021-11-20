package springLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Demo 
{
	private String marks;

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [marks=" + marks + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Starting The Method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Ending The Method");
	}
	

}


