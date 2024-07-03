package main.java.com.thinkconstructive.rest_demo.service;

import java.util.List;

import main.java.com.thinkconstructive.rest_demo.model.CloudVendor;

public interface CloudVendorService {
    public List<CloudVendor> getAllCloudVendors();
    public CloudVendor getCloudVendor(String cloudVendorId);
    public void createCloudVendor(CloudVendor cloudVendor);
    public void updateCloudVendor(CloudVendor cloudVendor);
    public void deleteCloudVendor(String cloudVendorId);
}
