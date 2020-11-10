package org.alie.designmode.structuralmode.proxy.dynamicproxy;

public class CarDaoImpl implements ICarDao{
    @Override
    public void addCar(String param) {
        System.out.println("===addCar :"+param);
    }

    @Override
    public int delCar() {
        System.out.println("===delCar ");
        return 0;
    }

    @Override
    public void updateCar() {

    }

    @Override
    public String selectCar() {
        return null;
    }
}
