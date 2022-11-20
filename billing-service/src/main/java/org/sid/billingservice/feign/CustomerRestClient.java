package org.sid.billingservice.feign;

import org.sid.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping(path = "/customers/{id}?projection=full")
    Customer getCustomerById(@PathVariable("id") Long id);




    @GetMapping(path = "/customers?projection=full")
    PagedModel<Customer> getCustomers();
}
