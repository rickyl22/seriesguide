package com.example.ricardo.seriesguide;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GotMock {
    ArrayList<String> data = new ArrayList<>();
    ArrayList<Integer> images = new ArrayList<>();
    Map<String,Integer> imgMap = new HashMap<>();

    public GotMock() {
        this.data.add("Winter is Coming");
        this.data.add("The Kingsroad");
        this.data.add("Lord Snow");
        this.data.add("Crpples, Bastards and Broken Things");
        this.data.add("The Wolf and the Lion");
        this.data.add("A Golden Crown");
        this.data.add("You Win or You Die");
        this.data.add("The Pointy End");
        this.data.add("Baelor");
        this.data.add("Fire and Blood");

        this.imgMap.put(this.data.get(0),R.drawable.got_1);
        this.imgMap.put(this.data.get(1),R.drawable.got_2);
        this.imgMap.put(this.data.get(2),R.drawable.got_3);
        this.imgMap.put(this.data.get(3),R.drawable.got_4);
        this.imgMap.put(this.data.get(4),R.drawable.got_5);
        this.imgMap.put(this.data.get(5),R.drawable.got_6);
        this.imgMap.put(this.data.get(6),R.drawable.got_7);
        this.imgMap.put(this.data.get(7),R.drawable.got_8);
        this.imgMap.put(this.data.get(8),R.drawable.got_9);
        this.imgMap.put(this.data.get(9),R.drawable.got_10);


    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    public ArrayList<Integer> getImages() {
        return images;
    }

    public void setImages(ArrayList<Integer> images) {
        this.images = images;
    }
}
