package co.easy.easypay.pojo;

/**
 * Created by tc on 12/12/16.
 */

public class AdhocPojo {
    String biller, nickName;

    public AdhocPojo(String biller, String nickName) {
        this.biller = biller;
        this.nickName = nickName;
    }

    public String getBiller() {
        return biller;
    }

    public void setBiller(String biller) {
        this.biller = biller;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
