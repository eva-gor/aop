package evagor.bl;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLog {
	@Pointcut("execution(public void evagor.bl.MyService.doSomething())")
	public void serviceMethods() {
	}

	@Before("serviceMethods()")
	public void beforeServiceMethod() {
		System.out.println("Before executing a service method.");
	}
}
