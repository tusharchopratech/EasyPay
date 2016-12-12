package co.easy.easypay.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import co.easy.easypay.pojo.AdhocPojo;
import co.easy.easypay.pojo.PaymentsDuePojo;
import co.easy.easypay.pojo.PaymentsMadePojo;

/**
 * Created by tc on 12/12/16.
 */

public class Data {

    public static ArrayList<AdhocPojo> adhocPojoArrayList = new ArrayList<>(Arrays.asList(
            new AdhocPojo("Idea", "9891435687"),
            new AdhocPojo("Airtel", "A4C DTH"),
            new AdhocPojo("Videocon", "Dwarka DTH"),
            new AdhocPojo("Vodafone", "Papajee Mobile")
    ));

    public static ArrayList<PaymentsDuePojo> paymentsDuePojoArrayList = new ArrayList<>(Arrays.asList(
            new PaymentsDuePojo("BSES", "A4C 1st Floor", "4,328", "22-Dec-16"),
            new PaymentsDuePojo("MTNL", "A4C Landline", "567", "24-Dec-16"),
            new PaymentsDuePojo("LIC", "Amit", "20,000", "29-Dec-2016"),
            new PaymentsDuePojo("Standard Charted", "Amit CreditCard", "46,500", "02-Jan-17")
    ));

    public static ArrayList<PaymentsMadePojo> paymentsMadePojoArrayList =new ArrayList<>(Arrays.asList(
            new PaymentsMadePojo("BSES","A4C 1st Floor","4,100","20-Nov-2016"),
            new PaymentsMadePojo("Idea","Amit Postpaid","2,987","17-Nov-2016"),
            new PaymentsMadePojo("Delhi Jal","A4C/74","1,500","17-Nov-2016"),
            new PaymentsMadePojo("Idea","Tushar","350","01-Nov-2016"),
            new PaymentsMadePojo("Airtel","A4C DTH","5,000","15-Oct-2016")
    ));


}
