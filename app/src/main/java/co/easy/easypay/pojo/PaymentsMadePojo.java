package co.easy.easypay.pojo;

/**
 * Created by tc on 12/12/16.
 */

public class PaymentsMadePojo {

    String biller,nickName, amount, paymentDate;

    public PaymentsMadePojo(String biller, String nickName, String amount, String paymentDate) {
        this.biller = biller;
        this.nickName = nickName;
        this.amount = amount;
        this.paymentDate = paymentDate;
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

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
