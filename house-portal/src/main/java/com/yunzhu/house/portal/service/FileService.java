package com.yunzhu.house.portal.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/23 16:53
 */
public interface FileService {

    String upload(MultipartFile file);
}
