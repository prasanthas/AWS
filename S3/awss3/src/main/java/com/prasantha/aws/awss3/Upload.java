package com.prasantha.aws.awss3;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.io.File;
import java.util.List;

public class Upload {


    public void uploadFile() {
        AWSCredentials credentials = new BasicAWSCredentials(
                "",
                ""
        );

        AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.AP_SOUTHEAST_2)
                .build();

        List<Bucket> buckets = s3client.listBuckets();
        for(Bucket bucket : buckets) {
            System.out.println(bucket.getName());
        }

        s3client.putObject(
                "prasantha-work",
                "GTR/application.properties",
                new File("/Users/prasanthasivabalasunderam/GITHUB/AWS/AWS/S3/awss3/src/main/resources/application.properties")
        );

    }

}

