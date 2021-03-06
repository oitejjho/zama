package org.zama.examples.multitenant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zama.examples.multitenant.model.Company;

import java.util.Optional;

/**
 * RoleRepository.
 * @author Zakir Magdum
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findOneByName(String name);
    Optional<Company> findOneByCompanyKey(String companyKey);
}
