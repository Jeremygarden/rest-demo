package com.demo.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.model.Customer;
import com.demo.service.CustomerService;

@Path("/customer")
public class CustomerResource {

    @EJB
    private CustomerService service;
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getList() {
        return service.getCustomerList();
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Customer getCustomer(@PathParam("id") Long id) {
        return service.getCustomer(id);
    }
}
