package com.thinkconstructive.rest_demo.service.impulse;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thinkconstructive.rest_demo.model.CloudVendor;

import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpulse implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpulse(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Bussiness Logic
        return cloudVendorRepository.findAll();
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Bussiness Logic
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Created Successfully!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Bussiness Logic
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Updated Successfully!";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Cloud Vendor Deleted Successfully!";
    }
    
}
