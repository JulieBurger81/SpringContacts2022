/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 4, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
