import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);


        System.out.println(helloWorldBean1.getMessage());
        System.out.println(helloWorldBean2.getMessage());

        System.out.println("result for hello: " + (helloWorldBean1 == helloWorldBean2));
        System.out.println("result for hello: " + (cat1 == cat2));
    }
}