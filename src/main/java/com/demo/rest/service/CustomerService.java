package com.demo.rest.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.rest.model.Customer;

@Stateless
public class CustomerService {

    @PersistenceContext
    EntityManager em;
    
    public void createCustomer(Customer customer) {
        em.persist(customer);
    }
    
    public Customer getCustomer(Long id) {
        return em.find(Customer.class, id);
    }
    
    public Customer updateCustomer(Customer customer) {
        return em.merge(customer);
    }
    
    public void deleteCustomer(Customer customer) {
        em.remove(customer);
    }
}
