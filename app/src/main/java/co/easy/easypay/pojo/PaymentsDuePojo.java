package co.easy.easypay.pojo;

/**
 * Created by tc on 12/12/16.
 */

public class PaymentsDuePojo {
    String biller,nickName,amount,dueDate;

    public PaymentsDuePojo(String biller, String nickName, String amount, String dueDate) {
        this.biller = biller;
        this.nickName = nickName;
        this.amount = amount;
        this.dueDate = dueDate;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
