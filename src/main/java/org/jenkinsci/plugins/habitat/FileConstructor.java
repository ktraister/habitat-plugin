package org.jenkinsci.plugins.habitat;

import jenkins.security.MasterToSlaveCallable;

import java.io.File;
import java.util.List;

public class FileConstructor extends MasterToSlaveCallable<String,RuntimeException> {

    private List<String> files;

    public FileConstructor(List<String> files) {
        this.files = files;
    }
    @Override
    public String call() throws RuntimeException {
        return String.join(File.separator, this.files);
    }
}
