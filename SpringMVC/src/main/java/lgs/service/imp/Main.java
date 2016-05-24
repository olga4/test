package lgs.service.imp;

import lgs.dao.BookD;
import lgs.dao.imp.BookDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
			
		
//			BookS bookS = applicationContext.getBean(BookS.class);
//			bookS.save("bukvar");
//		
//		BookD bookI = applicationContext.getBean(BookD.class);
		
		applicationContext.close();
		
	}
}
