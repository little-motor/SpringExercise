package spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import spring.domain.*;
import spring.form.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class SaveProductController implements Controller{
  private static final Log logger = LogFactory
      .getLog(SaveProductController.class);
  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    logger.info("SaveProductController called");
    ProductForm productForm = new ProductForm();
    productForm.setName(request.getParameter("name"));
    productForm.setDescription(request.getParameter(
        "description"));
    productForm.setPrice(request.getParameter("price"));
    
    Product product = new Product();
    product.setName(productForm.getName());
    product.setDescription(productForm.getDescription());
    try {
      product.setPrice(
          Float.parseFloat(productForm.getPrice()));
    }catch (NumberFormatException e) {}
    
    return new ModelAndView("/WEB-INF/jsp/ProductDetails.jsp",
        "product",product);
  }
  
}
