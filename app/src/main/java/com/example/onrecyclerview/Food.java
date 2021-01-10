package com.example.onrecyclerview;

import java.util.ArrayList;
import java.util.Arrays;

public class Food {
    private String name;
    private Integer price;
    private String address;
    private Integer image;

    public Food(String name, Integer price, String address, Integer image) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public static ArrayList<Food> mock(){
        return new ArrayList<Food>(
                Arrays.asList(
                        new Food("Chân gà om", 35000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.changanom),
                        new Food("Cơm gà đặc biệt", 50000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.comgadacbiet),
                        new Food("Cơm lá dứa", 35000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.comladua),
                        new Food("Đậu om nấm", 35000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.dauomnam),
                        new Food("Đậu phụ hầm kim chi", 40000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.dauphuhamkimchi),
                        new Food("Gà hầm nhân sâm", 150000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.gahamnhansam),
                        new Food("Gà hầm thuốc bắc", 135000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.gahamthuocba),
                        new Food("Gà tiềm", 100000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.gatiem),
                        new Food("Mực om nước mắm", 115000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.mucomnuocmam),
                        new Food("Thang cuốn", 50000, "Quận Tân Bình, Tp. Hồ Chí Minh", R.drawable.thangcuon)
                )
        );
    }
}
