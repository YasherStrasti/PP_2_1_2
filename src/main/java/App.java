import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBeanOne = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");

        System.out.println(beanOne.getMessage());
        System.out.println(beanTwo.getMessage());
        System.out.println(catBeanOne.getMessage());
        System.out.println(catBeanTwo.getMessage());

        System.out.println(beanOne == beanTwo);
        System.out.println(catBeanOne == catBeanTwo);
    }
}