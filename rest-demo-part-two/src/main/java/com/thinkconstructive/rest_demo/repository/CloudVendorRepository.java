package com.thinkconstructive.rest_demo.repository;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    // Here if JpaRepository<T(Entity/Model Class), ID(Primary Key/Wrapper Class)>, then T and ID are type parameters
    
}
