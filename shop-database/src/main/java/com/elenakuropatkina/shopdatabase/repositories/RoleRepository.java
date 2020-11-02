package com.elenakuropatkina.shopdatabase.repositories;

import com.elenakuropatkina.shopdatabase.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findOneByName(String name);
}
