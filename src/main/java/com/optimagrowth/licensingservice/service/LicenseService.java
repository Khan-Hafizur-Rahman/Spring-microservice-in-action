package com.optimagrowth.licensingservice.service;

import com.optimagrowth.licensingservice.model.License;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;
import java.util.SplittableRandom;

/*
 * @author Khan Hafizur Rahman
 * @since 1/11/21
 */
@Service
@AllArgsConstructor
public class LicenseService {
    MessageSource messageSource;

    public License getLicense(String licenseId, String organizationId) {
        License license = License.builder().build();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizatonId(organizationId);
        license.setDescription("Software Product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId, Locale locale){
        String responseMessage = null;
        if (license != null){
            license.setOrganizatonId(organizationId);
            responseMessage = String.format(messageSource.getMessage("license.create.message", null, locale), license.toString());
        }

        return responseMessage;
    }

    public String updateLicense(License license, String organizationId){
        String responseMessage = null;
        if (license != null){
            license.setOrganizatonId(organizationId);
            responseMessage = String.format(messageSource.getMessage("license.update.message", null, null),
                                            license.toString()); // will use default locale
        }

        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId){
        String responseMessage = String.format("Deleting license with id %s for the organization %s", licenseId, organizationId);
        return responseMessage;
    }
}
