
package pbo3.pkg10117110.latihan57.vehicle;


public class PBO310117110Latihan57Vehicle {


    public static void main(String[] args) {
        
        Bicycle obj = new Bicycle();
        obj.setMyBrand("Trex Bike");
        obj.setMyModel("7.4FX");
        obj.setMyGearCount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : "+obj.getMyBrand());
        System.out.println("Model : "+obj.getMyModel());
        System.out.println("Jumlah Gear : "+obj.getMyGearCount());
        
        System.out.println("");
        
        Skateboard obj1 = new Skateboard();
        obj1.setMyBrand("Trex Bike");
        obj1.setMyModel("7.4FX");
        obj1.setMyBoardLength(54.5);
        System.out.println("SkateBoard");
        System.out.println("Brand : "+obj1.getMyBrand());
        System.out.println("Model : "+obj1.getMyModel());
        System.out.println("Panjangnya Board : "+obj1.getMyBoardLength());

    }
    
}
