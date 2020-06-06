package com.mabf;

import com.mabf.entity.User;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    /**
     * 导出数据
     */
    @Test
    public void test2() throws IOException {
//        0.准备数据
        User user = new User();
        user.setCenter_name("12312");
        user.setCenter_no("hhhh");
        user.setIs_open("男");

        String[] titles = {"编号","名字","性别"};

        /**
         * 先写入 标题栏数据
         */
//        1.创建文件对象   创建HSSFWorkbook只能够写出为xls格式的Excel
//        要写出 xlsx 需要创建为 XSSFWorkbook 两种Api基本使用方式一样
        HSSFWorkbook workbook = new HSSFWorkbook();

//        2.创建表对象
        HSSFSheet sheet = workbook.createSheet("users");

//        3.创建标题栏（第一行）  参数为行下标  行下标从0开始
        HSSFRow titleRow = sheet.createRow(0);

//        4.在标题栏中写入数据
        for (int i = 0; i < titles.length; i++) {
//            创建单元格
            HSSFCell cell = titleRow.createCell(i);
            cell.setCellValue(titles[i]);
        }
        /**
         * 写入用户数据
         */
//       5 创建行 如果是用户数据的集合 需要遍历
        HSSFRow row = sheet.createRow(1);

//       6 将用户数据写入到行中
        row.createCell(0).setCellValue(user.getCenter_name());
        row.createCell(1).setCellValue(user.getCenter_no());
        row.createCell(2).setCellValue(user.getIs_open());

//        文件保存到本地 参数为要写出的位置
        workbook.write(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\hhh.xls"));

    }
    @Test
    public void test3() throws Exception {
//        1.通过流读取Excel文件
        FileInputStream inputStream = new FileInputStream("/Users/k/Desktop/hhh.xls");
//        2.通过poi解析流 HSSFWorkbook 处理流得到的对象中 就封装了Excel文件所有的数据
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
//        3.从文件中获取表对象  getSheetAt通过下标获取
        HSSFSheet sheet = workbook.getSheetAt(0);
//        4.从表中获取到行数据  从第二行开始 到 最后一行  getLastRowNum() 获取最后一行的下标
        int lastRowNum = sheet.getLastRowNum();

        for (int i = 1; i <= lastRowNum; i++) {
//            通过下标获取行
            HSSFRow row = sheet.getRow(i);
//            从行中获取数据

            /**
             * getNumericCellValue() 获取数字
             * getStringCellValue 获取String
             */
            double id = row.getCell(0).getNumericCellValue();
            String name = row.getCell(1).getStringCellValue();
            String sex = row.getCell(2).getStringCellValue();

//            封装到对象中
            User user = new User();
            user.setCenter_name(String.valueOf(id));
            user.setCenter_no(name);
            user.setIs_open(sex);

//            将对象添加数据库
            System.out.println(user);
        }
    }
}
