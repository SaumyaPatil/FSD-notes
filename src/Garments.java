import java.util.Scanner;

public class Garments {
    String GCode;
    String GType;
    int GSize;
    String GFabric;
    float GPrice;

    Garments(String GCode, String GType, int GSize, String GFabric, float GPrice){
        this.GCode = "Not Allowed";
        this.GType = "Not Allowed";
        this.GFabric = "Not Allowed";
        this.GSize = 0;
        this.GPrice = 0.0f;
    }
    Garments(){}

    void Assign(){
        if (GFabric == "COTTON"){
            if (GType == "Trouser")GPrice=1300;
            else if (GType == "Shirt") {
                GPrice=1100;
            }
        } else {
            if (GType == "Trouser")GPrice=1300-(1300*10/100);
            else if (GType == "Shirt") {
                GPrice=1100-(1100*10/100);
            }
        }
    }

    void Input(){
        this.GCode = GCode;
        this.GType = GType;
        this.GFabric = GFabric;
        this.GSize = GSize;
        this.GPrice = GPrice;
        Assign();
    }

    void Display(){
        System.out.println(GCode);
        System.out.println(GType);
        System.out.println(GSize);
        System.out.println(GFabric);
    }

    public static void main(String[] args) {
        Garments obj = new Garments();
        obj.Input();
        obj.Display();
    }
}
