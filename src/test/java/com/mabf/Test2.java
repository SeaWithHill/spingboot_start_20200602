package com.mabf;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.mabf.entity.Teacher;
import com.mabf.entity.User;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * easypoi导出
     */
    @Test
    public void test4() throws IOException {
//        模拟数据
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(1,"李老师","hhh.jpg",1));
        list.add(new Teacher(2,"李老师","hhh.jpg",1));
        list.add(new Teacher(3,"李老师","hhh.jpg",1));
        list.add(new Teacher(4,"李老师","hhh.jpg",1));
        list.add(new Teacher(5,"李老师","hhh.jpg",1));
        list.add(new Teacher(6,"李老师","hhh.jpg",1));
        /**
         * 导出参数对象
         * 参数1 标题
         * 参数2 表的名字
         */
        ExportParams exportParams = new ExportParams("所有老师数据","teacher");
        /**
         * exportExcel 导出Excel文件
         * 参数1 导出参数对象
         * 参数2 要导出的实体类的类对象
         * 参数3 要导出的数据 需要一个集合  数据库查询出来的老师对象的集合
         *
         * 返回值就是封装好的文件对象
         */
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, Teacher.class, list);

        workbook.write(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\teachers.xls"));

    }


    /**
     * easypoi导入
     */
    @Test
    public void test5() throws Exception {
        FileInputStream inputStream = new FileInputStream("/Users/lubingyang/Desktop/teachers.xls");
        /**
         * ImportParams 导入参数对象
         * 定义标题栏和表头数据
         */
        ImportParams importParams = new ImportParams();
        importParams.setTitleRows(1);
        importParams.setHeadRows(1);
        /**
         * importExcel 导入方法
         * 参数1 流 读取要导入的文件
         * 参数2 要导入的实体类的类对象  上师对象的类对象
         * 参数3 导入参数对象
         *
         * 返回值 导入数据 直接封装为集合对象
         */
        List<Teacher> teachers = ExcelImportUtil.importExcel(inputStream, Teacher.class, importParams);

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }


//    @Test
//    public void test10() throws IOException {
//        Date start = new Date();
////        查询数据库 用户表总条数
//        Integer userCount = userDao.selectCount(null);
////        计算总页数
//        Integer pageCount = userCount / 200000 + 1;
//
//        List<CmfzUser> users = null;
//        Workbook workbook = null;
//        ExportParams params = new ExportParams("大数据测试", "测试");
//
////        查询测试 页数  每次查询20w条数据
//        for (int i = 1; i <= pageCount; i++) {
//            System.out.println(i);
//            users = userDao.selectPage(new Page<>(i, 200000), null).getRecords();
////            通过 EasyPoi 的大数据导出方法 导出
//            workbook = ExcelExportUtil.exportBigExcel(params, CmfzUser.class, users);
//            users.clear();
//        }
//        Date end = new Date();
//        System.out.println(new Date().getTime() - start.getTime());
//        workbook.write(new FileOutputStream("/Users/lubingyang/Desktop/hhhh.xlsx"));
//
//    }


//    @Test
//    public void fe_map() throws Exception {
////        读取模板文件
//        TemplateExportParams params = new TemplateExportParams(
//                "/Users/k/Desktop/专项支出用款申请书_map.xls");
//
////        模拟要写入模板的数据
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("date", "2014-12-25");
//        map.put("money", 2000000.00);
//        map.put("upperMoney", "贰佰万");
//        map.put("company", "执笔潜行科技有限公司");
//        map.put("bureau", "财政局");
//        map.put("person", "JueYue");
//        map.put("phone", "1879740****");
//        List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
//        for (int i = 0; i < 4; i++) {
//            Map<String, String> lm = new HashMap<String, String>();
//            lm.put("id", i + 1 + "");
//            lm.put("zijin", i * 10000 + "");
//            lm.put("bianma", "A001");
//            lm.put("mingcheng", "设计");
//            lm.put("xiangmumingcheng", "EasyPoi " + i + "期");
//            lm.put("quancheng", "开源项目");
//            lm.put("sqje", i * 10000 + "");
//            lm.put("hdje", i * 10000 + "");
//
//            listMap.add(lm);
//        }
//        map.put("maplist", listMap);
//
////        导出模板
//        Workbook workbook = ExcelExportUtil.exportExcel(params, map);
//
//        FileOutputStream fos = new FileOutputStream("/Users/k/Desktop/专项支出用款申请书111_map.xls");
//        workbook.write(fos);
//        fos.close();
//    }
}
