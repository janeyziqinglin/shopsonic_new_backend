package com.shopme.common;

import org.springframework.beans.factory.annotation.Value;

public class Constants {
	public static final String S3_BASE_URI;
	
	static {
		String bucketName = System.getenv("AWS_BUCKET_NAME");
//		String region = System.getenv("AWS_REGION");
		String pattern = "https://%s.s3.amazonaws.com";
		
		S3_BASE_URI = bucketName == null ? "" : String.format(pattern, bucketName);
	}

//	public static void main(String[] args) {
//		String bucketName = System.getenv("AWS_BUCKET_NAME");
//		System.out.println(bucketName);
//		System.out.println("s3 BAESE URI:" + S3_BASE_URI);
//	}
}
