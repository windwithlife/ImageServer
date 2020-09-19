package com.project.meetinglive.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 系统配置文件参数
 * @author hejinguo
 * @version $Id: ApplicationConfig.java, v 0.1 2019年11月18日 上午2:06:39
 */
@Component
public class ApplicationConfig {
    /**图片访问地址*/
    public static String upload_image_httpUrl;
    /**图片上传目录*/
    public static String upload_image_dirPath;
    /**图片访问目录*/
    public static String upload_image_path;
    /**文件上传目录*/
    public static String upload_file_dirPath;
    /**文件访问目录*/
    public static String upload_file_path;

    @Value("${upload.image.httpUrl}")
    public void setUpload_image_httpUrl(String upload_image_httpUrl) {
        ApplicationConfig.upload_image_httpUrl = upload_image_httpUrl;
    }

    @Value("${upload.image.dirPath}")
    public void setUpload_image_dirPath(String upload_image_dirPath) {
        ApplicationConfig.upload_image_dirPath = upload_image_dirPath;
    }

    @Value("${upload.image.path}")
    public void setUpload_image_path(String upload_image_path) {
        ApplicationConfig.upload_image_path = upload_image_path;
    }

    @Value("${upload.file.dirPath}")
    public void setUpload_file_dirPath(String upload_file_dirPath) {
        ApplicationConfig.upload_file_dirPath = upload_file_dirPath;
    }

    @Value("${upload.file.path}")
    public void setUpload_file_path(String upload_file_path) {
        ApplicationConfig.upload_file_path = upload_file_path;
    }
}
