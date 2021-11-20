package springLifeCycle;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main
	{
		public static void main(String[] args) 
		{
			@SuppressWarnings("resource")
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("springlifecycle.xml");
			context.registerShutdownHook();
			
			Demo demo = (Demo) context.getBean("demo");
			System.out.println(demo);	
		}

	}


