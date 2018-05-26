package setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
  private String firstName;
  private String lastName;
  private Address add;
  
//  public Employee(String firstName,String lastName,
//      Address add) {
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.add = add;
//  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public String getFirstName() {
    return firstName;
  }
  public void setLastName( String lastName ){
    this.lastName = lastName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public void setAdd(Address add) {
    this.add = add;
  }
  
  public Address getAdd() {
    return add;
  }
  
  @Override
  public String toString() {
    return "firstName: " + firstName
        + " lastName: " + lastName
        + " Address: " + add.toString();
  }
  
  public static void main(String[] args) {
    //创建Spring的IoC容器对象
    ApplicationContext context = 
        new ClassPathXmlApplicationContext("Beans.xml");
    //从IoC容器中获得Bean实例
    Employee employee = (Employee)context.getBean("employee");
    //调用toString方法
    System.out.println(employee.toString());
  }
}
