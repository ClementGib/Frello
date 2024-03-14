package com.cdx.frello.version;

import org.springframework.stereotype.Service;

@Service
public class VersionService {

    public String getVersion() {
        return this.getClass().getPackage().getImplementationVersion();
    }
}
