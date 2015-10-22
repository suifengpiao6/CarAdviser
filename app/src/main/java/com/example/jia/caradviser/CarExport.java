package com.example.jia.caradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jia on 2015/10/20.
 */
public class CarExport {
    List<String> getCars(String type) {
        List<String> cars = new ArrayList<>();
        switch (type) {
            case "电动车":
                cars.add("特斯拉");
                cars.add("日立");
                break;
            case "皮卡":
                cars.add("长城");
                cars.add("金杯");
                break;
            case "SUV":
                cars.add("哈弗H6");
                cars.add("江淮S3");
                break;
            case "跑车":
                cars.add("阿斯顿.马丁");
                cars.add("保时捷");
                break;
            default:
                break;
        }
       return cars;
    }
}
