package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireDependencyInjectionApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(AutowireDependencyInjectionApplication.class, args);

//Even if we comment the lines of Object Creation from 15-16 the Object of Class Alien will be Created because byDefaoult @COMPONET follow SINGLETON SCOPE  so it MAKES object ready even before your call		
//		Alien a=context.getBean(Alien.class); 
//		a.show();

		
// Now what will happen if we try to create two object of Alien 
// You will see that Spring creates only ONE OBJECT .....since ALIEN is Having SingleTon Scope@COMPONENT
//		Alien a=context.getBean(Alien.class); 
//		a.show();
//		Alien a1=context.getBean(Alien.class);
//		a1.show();
		
		
// how can we create >=TWO Objects ?? for That we have to ADD the PROTOTTPE SCOPE_Annotation to ALien Class i.e. @SCOPE(Value="prototype");
//Now Try 

//		Alien a=context.getBean(Alien.class); 
//		a.show();
//		Alien a1=context.getBean(Alien.class);
//		a1.show();	
// we saw two objects were created this time
// now what if We remove all line for Object Creation what do u think will there be any instance like we get in SINGLETON ???
// TRIED AND GOT ERROR ??
// NO! WE WONT GET ANY BYDEFAULT INSATANCE , WE HAVE TO CREATE IT AS PER OUR USE BY .getBean();
		
		Alien a=context.getBean(Alien.class); 
		a.show();
		
		
	}

}
