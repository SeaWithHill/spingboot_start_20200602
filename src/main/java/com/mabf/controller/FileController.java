package com.mabf.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/upload")
    public String upload(MultipartFile aa, HttpServletRequest request) throws IOException {
//获取upload文件夹的路径
        String realPath = request.getRealPath("/upload");
//将上传的文件写入 upload文件夹 中
        aa.transferTo(new File(realPath, aa.getOriginalFilename()));//文件上传
        return "index";
    }

    @RequestMapping("/download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response) throws Exception {
//获取upload文件夹的路径
        String realPath = request.getRealPath("/upload");
//通过流读取文件
        FileInputStream is = new FileInputStream(new File(realPath, fileName));
//获得响应流
        ServletOutputStream os = response.getOutputStream();
//设置响应头信息
        response.setHeader("content-disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));
//通过响应流将文件输入流读取到的文件写出
        IOUtils.copy(is, os);
//关闭流
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);

    }
}
