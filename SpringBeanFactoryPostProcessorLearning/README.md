### BeanFactoryPostProcessor
```java
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        System.out.println("实例化 MyBeanFactoryPostProcessor Bean");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("Bean定义的个数："+beanDefinitionCount);
    }

    @Component
    static class TestBean{
        public TestBean(){
            System.out.println("实例化 TestBean Bean");
        }
    }
}
```
控制台输出：
```bash
实例化 MyBeanFactoryPostProcessor Bean
Bean定义的个数：138
实例化 TestBean Bean
```
> postProcessBeanFactory: 在所有的 Bean 定义加载之后，但是还没有实例化 Bean 可以在此修改 Bean ,快速初始化 Bean。
### BeanDefinitionRegistryPostProcessor
```java
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    public MyBeanDefinitionRegistryPostProcessor() {
        System.out.println("实例化 MyBeanDefinitionRegistryPostProcessor Bean");
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        int beanDefinitionCount = registry.getBeanDefinitionCount();
        System.out.println("Bean定义个数："+beanDefinitionCount);
        //添加一个Bean定义
        /*RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Object.class);
        registry.registerBeanDefinition("Hello",rootBeanDefinition);*/
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
```
控制台输出：
```bash
实例化 MyBeanDefinitionRegistryPostProcessor Bean
Bean定义个数：139
实例化 MyBeanFactoryPostProcessor Bean
Bean定义的个数：140
实例化 TestBean Bean
```
>postProcessBeanDefinitionRegistry: 在应用程序上下文的标准初始化之后修改其内部bean定义注册中心。加载所有的常规化 Bean 定义(不包括 MyBeanFactoryPostProcessor)，但还没有实例化 Bean ,在下一个后处理阶段开始之前添加更多的 Bean 定义。从实验结果可知，此方法执行在postProcessBeanFactory 之前。