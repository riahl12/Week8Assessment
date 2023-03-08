/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Mar 7, 2023
 */
package vet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vet.beans.Owner;

/**
 * @author riley
 *
 */
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
