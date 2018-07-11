package org.jenkinsci.plugins.habitat;

import jenkins.security.MasterToSlaveCallable;

import java.io.File;

public class FilePathFinder extends MasterToSlaveCallable<String,RuntimeException> {

    private String file;

    public FilePathFinder(String file) {
        this.file = file;
    }
    @Override
    public String call() throws RuntimeException {
        return new File(this.file).getAbsolutePath();
    }
}
