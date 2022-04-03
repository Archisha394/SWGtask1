
package com.company;

class Car{
    double speed;
    String color;
    double regularPrice;
    double salePrice = regularPrice;

    public double getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
class Truck extends Car{
    double weight;
    double salePriceTruck;
    public double getSalePriceTruck() {
        return salePriceTruck;
    }
    public void setSalePriceTruck(double salePriceTruck) {
        if(salePriceTruck>2300)
        {
            salePriceTruck -= salePriceTruck/10;
        }
        else
        {
            salePriceTruck -= (salePriceTruck*2)/10;
        }
        this.salePriceTruck = salePriceTruck;

    }
}
public class Choice1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car king1 = new Car();
        System.out.println("Enter the Colour of the Car ");
        String str1 = sc.next();
        System.out.println("Enter the Speed of the Car ");
        int  sp1 = sc.nextInt();
        System.out.println("Enter the Regular price of Car ");
        double pr1 = sc.nextDouble();
        king1.setSalePrice(pr1);
        System.out.println("Colour of the Car is " + str1);
        System.out.println("Speed of the Car is " + sp1);
        System.out.println("The price of the Car is " + king1.getSalePrice());
    }
}
