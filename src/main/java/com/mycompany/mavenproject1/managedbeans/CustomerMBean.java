/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.mavenproject1.managedbeans;

import com.mycompany.mavenproject1.Customer;
import com.mycompany.mavenproject1.session.CustomerManager;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Fadwa Guermane
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {

 
  private List<Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  
        
  public CustomerMBean() {  }  
        
  /** 
   *  
   * @return 
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  

    /**
     * Creates a new instance of CustomerMBean
     */
    
 
    
}
