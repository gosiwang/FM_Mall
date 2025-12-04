package com.sesac.fmmall.Repository;

import com.sesac.fmmall.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByUserId(Long userId);

    Optional<Address> findByUserIdAndIsDefault(Long userId, String isDefault);
}
