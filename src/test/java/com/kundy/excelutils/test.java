package com.kundy.excelutils;

import sun.util.resources.LocaleData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Write class comments
 * hereUser: lvzhen
 * Date: 2020/5/20 11:23
 * version $Id: test.java$
 */
public class test {

    public static void main(String[] args) {
        // 生成100000条数据
        String file = new String("E:\\123.sql");

        try (Writer writer = new FileWriter(new File(file));) {
            String sql = "";
            for (int i = 0; i < 100000; i++) {
                sql = "insert ttl_product_info values ('" + (i + 100) + "','product" + i + "','" + i + "','category" + i + "'," +
                        "'" + i + "','branch" + i + "','" + i + "','shop" + i + "','" + i + ".00','" + i + "'," +
                        "'" + i + "','" + formatDate() + "','" + formatDate() + "','1');\n";
                writer.write(sql);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static  String formatDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return sdf.format(new Date());
    }

}
