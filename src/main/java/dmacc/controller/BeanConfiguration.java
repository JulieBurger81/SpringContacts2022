/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 3, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {

    @Bean
    public Contact contact() {
        Contact bean = new Contact("Eric Carle");
//			bean.setName("Dr.Seuss");
//			bean.setPhone("555-555-5555");
//			bean.setRelationship("friend");
        return bean;
    }

    @Bean
    public Address address() {
        Address bean = new Address("123 Main Street", "Des Moines", "IA");
        return bean;
    }
}
