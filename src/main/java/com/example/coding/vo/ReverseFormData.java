package com.example.coding.vo;

public class ReverseFormData {
    private int number;

    public ReverseFormData(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        ReverseFormData formData = new ReverseFormData(3);
        System.out.println(formData.getNumber());
        System.out.println(formData.number);
        formData.setNumber(5);
        System.out.println(formData.getNumber());
        System.out.println(formData.number);
        int i = formData.number;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        ++i;
        System.out.println(i);
    }
}
