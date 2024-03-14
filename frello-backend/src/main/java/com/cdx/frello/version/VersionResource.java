package com.cdx.frello.version;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionResource {

    VersionService versionService;

    @Autowired
    VersionResource(VersionService versionService) {
        this.versionService = versionService;
    }

    @GetMapping("/version")
    public String getVersion() {
        final String version = versionService.getVersion();
        return version == null ? "local" : version;
    }
}
