###AOP Terminologies

Understanding AOP Terminology - Pointcut, Advice, Aspect, Join Point

**Pointcut**  
`Pointcut` is the expression used to define when a call to a method should be intercepted. In the above example, execution(* com.in28minutes.springboot.tutorial.basics.example.aop.data.*.*(..)) is the pointcut.

Advice  
`Advice` is what do you want to do? It is the logic that you would want to invoke when you intercept a method. In the above example, it is the code inside the before(JoinPoint joinPoint) method.

Aspect  
A combination of defining when you want to intercept a method call (Pointcut) and what to do (Advice) is called an `Aspect`.

Join Point  
When the code is executed and the condition for pointcut is met, the advice is executed. The `Join Point` is a specific execution instance of an advice.

Weaver  
`Weaver` is the framework which implements AOP - AspectJ or Spring AOP.