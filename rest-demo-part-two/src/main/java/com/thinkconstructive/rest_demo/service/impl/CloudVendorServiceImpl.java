package com.thinkconstructive.rest_demo.service.impl;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;

    @Override
    public CloudVendor createCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public CloudVendor updateCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public void deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        Optional<CloudVendor> cloudVendor = cloudVendorRepository.findById(cloudVendorId);
        return cloudVendor.orElse(null);
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
