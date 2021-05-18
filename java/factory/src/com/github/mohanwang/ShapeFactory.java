package com.github.mohanwang;

/**
 * 工厂模式
 * 1、定义一个产品抽象接口
 * 2、实现几个产品类
 * 3、定义一个工厂方法，通过产品名称统一生产对象
 * 4、使用方统一使用工厂获取产品对象
 *
 * 缺点：新增产品时，需要实现一个产品类，并且修改工厂方法
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;

        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
