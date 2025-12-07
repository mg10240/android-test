package org.cryptomator.domain.usecases;

import org.cryptomator.domain.exception.BackendException;
import org.cryptomator.domain.repository.UpdateCheckRepository;
import org.cryptomator.generator.Parameter;
import org.cryptomator.generator.UseCase;

@UseCase
public class DoLicenseCheck {

    private final UpdateCheckRepository updateCheckRepository;
    private String license;

    DoLicenseCheck(final UpdateCheckRepository updateCheckRepository, @Parameter final String license) {
        this.updateCheckRepository = updateCheckRepository;
        this.license = license;
    }

    public LicenseCheck execute() throws BackendException {
        return () -> "valid";
    }
}
