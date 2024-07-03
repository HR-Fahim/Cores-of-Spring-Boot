package main.java.com.thinkconstructive.rest_demo.service.impulse;

import com.thinkconstructive.rest_demo.model.CloudVendor;

import main.java.com.thinkconstructive.rest_demo.repository.CloudVendorRepository;

@Service
public class CloudVendorServiceImpulse implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpulse(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Bussiness Logic
        return CloudVendorRepository.findAll(cloudVendorId);
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return CloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Bussiness Logic
        CloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Created Successfully!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Bussiness Logic
        CloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Updated Successfully!";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        CloudVendorRepository.deleteById(cloudVendorId);
        return "Cloud Vendor Deleted Successfully!";
    }
    
}
