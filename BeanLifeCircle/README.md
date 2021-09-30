### Spring Bean生命周期测试
> 控制台输出顺序
```bash
setBeanName被调用了---->BeanNameAware接口方法

setBeanFactory被调用了---->BeanFactoryAware接口方法

setApplicationContext被调用了---->ApplicationContextAware接口方法

afterPropertiesSet被调用了---->InitializingBean接口方法

postProcessBeforeInitialization被调用了---->BeanPostProcessor接口方法

postProcessAfterInitialization被调用了---->BeanPostProcessor接口方法

destroy被调用了---->DisposableBean接口方法
```
由此可知Bean生命周期中实例化，依赖注入之后的执行顺序