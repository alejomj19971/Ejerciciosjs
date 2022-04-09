package src;

import java.util.Scanner;
public class Main{

    public static void main(String[] arg){


        Scanner inputData=new Scanner(System.in);
       Double productPrice;
       int productModel;
        String productName,productBrand;

        System.out.println("Ingrese el modelo del producto : ");
        productModel= Integer.parseInt(inputData.nextLine());

        System.out.println("Ingrese el precio : ");

        productPrice=Double.parseDouble(inputData.nextLine());

        System.out.println("Ingrese el nombre del producto :");
        productName= inputData.nextLine();
        System.out.println("Ingrese la marca del producto :");
        productBrand= inputData.nextLine();

        Producto monitorHp=new Producto(productName,productBrand,productPrice,productModel);
        System.out.println("El nombre es "+monitorHp.getName()+" y la marca es "+monitorHp.getBrand()+"el precio es "+monitorHp.getPrice() + " el modelo es  "+monitorHp.getModel()) ;



    }
}
