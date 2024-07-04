package com.thinkconstructive.rest_demo.service;

import java.util.List;

import com.thinkconstructive.rest_demo.model.CloudVendor;

public interface CloudVendorService {
    public List<CloudVendor> getAllCloudVendors();
    public CloudVendor getCloudVendor(String cloudVendorId);
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
}
