import java.util.Scanner;

public class Supply {
    String FoodName;
    String Sticker;
    String FoodType;

    void GetType(){
        if (Sticker == "Green")FoodType="Vegetarian";
        else if (Sticker == "Yellow") {
            FoodType="Contains Egg";
        }else if (Sticker == "Red")FoodType="Non-Vegetarian";
    }

    void FoodIn(){
        Scanner sc = new Scanner(System.in);
        FoodName = sc.next();
        Sticker = sc.next();
        GetType();
    }

    void FoodOut(){
        System.out.println(FoodName);
        System.out.println(Sticker);
        System.out.println(FoodType);
    }

    public static void main(String[] args) {
        Supply obj = new Supply();
        obj.FoodIn();
        obj.FoodOut();
    }
}
