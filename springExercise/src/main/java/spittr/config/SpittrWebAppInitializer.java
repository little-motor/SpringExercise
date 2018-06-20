package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//配置DispatcherServlet

public class SpittrWebAppInitializer extends 
  AbstractAnnotationConfigDispatcherServletInitializer{
  
  @Override
  //映射的是"/"，表示它会是应用的默认Servlet，处理所有请求
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }
  
  //这个类会同时创建DispatcherServlet和ContextLoaderListener
  //他们分别会创建一个应用上下文
  //我们希望DispatcherServlet加载包含Web组件的bean
  //ContextLoaderListener加载其他bean
  
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { RootConfig.class };
  }
  
  @Override 
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }
}
