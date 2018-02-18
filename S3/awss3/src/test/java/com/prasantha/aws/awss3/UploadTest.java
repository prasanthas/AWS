package com.prasantha.aws.awss3;

import org.junit.Test;

import static org.junit.Assert.*;

public class UploadTest {

    @Test
    public void test() {
        System.out.println("test");


        Upload upload = new Upload();
        upload.uploadFile();

    }



}