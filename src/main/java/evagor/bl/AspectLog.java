package evagor.bl;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLog {
	@Pointcut("execution(void *.MyService.*(..))")
	public void serviceMethods() {
	}

	@Before("serviceMethods()")
	public void beforeServiceMethod() {
		System.out.println("Before executing a service method.");
	}
}
