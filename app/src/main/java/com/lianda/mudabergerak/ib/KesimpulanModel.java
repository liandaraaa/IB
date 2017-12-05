package com.lianda.mudabergerak.ib;

import java.io.Serializable;

/**
 * Created by lenovo on 04/12/2017.
 */

public class KesimpulanModel implements Serializable {

    public int fotoKesimpulan;
    public String judulKesimpulan;

    public int getFotoKesimpulan() {
        return fotoKesimpulan;
    }

    public void setFotoKesimpulan(int fotoKesimpulan) {
        this.fotoKesimpulan = fotoKesimpulan;
    }

    public String getJudulKesimpulan() {
        return judulKesimpulan;
    }

    public void setJudulKesimpulan(String judulKesimpulan) {
        this.judulKesimpulan = judulKesimpulan;
    }

    public String getLinkKesimpulan() {
        return linkKesimpulan;
    }

    public void setLinkKesimpulan(String linkKesimpulan) {
        this.linkKesimpulan = linkKesimpulan;
    }

    public String linkKesimpulan;




}
