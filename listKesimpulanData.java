package com.lianda.mudabergerak.ib;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lenovo on 05/12/2017.
 */

public class listKesimpulanData {

    public static String [] data = new String[] {
            "Curug Bidadari",
            "Curug Cilember",
            "Curug Leuwi Hejo"
    };

    public static String [] tanggal = new String [] {
        "10 oktober 2017", "25 oktober 2017", "1 november 2017"
    };


    public static int [] foto = new int[] {
            R.drawable.bidadari, R.drawable.cilember, R.drawable.hejo};

    public static ArrayList<listKesimpulanModel> getListData(){
        listKesimpulanModel artikel = null;
        ArrayList<listKesimpulanModel> list = new ArrayList<>();

        for (int i = 0; i<data.length; i++){
            artikel = new listKesimpulanModel();

            artikel.setJudulListKesimpulan(data[i]);
            artikel.setTanggalListKesimpulan(tanggal[i]);
            artikel.setFotoListKesimpulan(foto[i]);

            list.add(artikel);
        }
        return list;
    }

}
