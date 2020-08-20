package com.hb.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author hb
 * @create 2020-06-18 21:29
 */
@Controller
public class LoadController {
    @RequestMapping("upload")
    public String upload(MultipartFile multipartFile) throws IOException {
        //指定文件上传位置
        //将文件分类存放 按日期
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dirname = format.format(new Date());
        File file=new File("D:/upload/"+dirname);
        //文件名重复解决
        String uid = UUID.randomUUID().toString().replace("-","" ).toUpperCase();
        String oldfilename=multipartFile.getOriginalFilename();
        String newfilename=uid+oldfilename.substring(oldfilename.lastIndexOf("."));
        //上传文件
        multipartFile.transferTo(new File(file,newfilename));
        return "success";
    }

    @RequestMapping("download")
    public ResponseEntity<byte[]> download() throws Exception {
        //下载文件名称
        String fileName="57fcb3b8d01a4.jpg";
        //下载目录
        String path = "D:/upload/";
        //下载后文件名称 处理中文
        String newfileName=new String(fileName.getBytes("gbk"),"iso-8859-1");
        //文件下载地址
        File file = new File(path+fileName);
        //文件响应头
        HttpHeaders headers = new HttpHeaders();

        headers.setContentDispositionFormData("attachment", newfileName);

        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        //执行下载
        ResponseEntity<byte[] > responseEntity=new ResponseEntity<byte[]>(
                FileUtils.readFileToByteArray(file),
                headers,
                HttpStatus.OK );

        return responseEntity;
    }
}
