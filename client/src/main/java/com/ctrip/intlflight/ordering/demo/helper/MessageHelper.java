package com.ctrip.intlflight.ordering.demo.helper;

import com.ctrip.intlflight.ordering.contract.commontype.v1.DeliveryTypeType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.GenderType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.IDCardInfoType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.MessageHeaderType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.RequestHeaderType;
import com.ctrip.intlflight.ordering.contract.commontype.v1.TravelerCategoryCodeType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.ActionType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.AffiliateInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.ContactInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.DeliveryInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.IDCardExtType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.OrderMiscInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.PayInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.PaymentInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.QTEInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.SaveOrderRequestType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.TravelerInfoType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.XProductInfoType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @description:
 * @author: tangxinyi
 * @create: 2020-03-05
 */
public class MessageHelper {

    private static final String SEARCH_CRITERIA_TOKEN = "KLUv_QBQKQIACwgBEMyABhiTJCCAgPbbjS4MEwgBEAEYARQYAyABKA0wgb4GQygAMAA4AEAASABQAIABAJABAKgBALgBAERIAFAAYNJG";
    private static final String ROUTE_CRITERIA_TOKEN = "800000000iH6G06F02IbJH800000000020000000000W01FDx510G002QeHgG02JmG8000o-qLDD1";

    public static SaveOrderRequestType buildSaveOrder_CreateOrderRequest(){
        SaveOrderRequestType createOrder = new SaveOrderRequestType();
        createOrder.setRequestHeader(buildRequestHeader());
        createOrder.setAction(ActionType.CreateOrder);
        createOrder.setSearchCriteriaToken(SEARCH_CRITERIA_TOKEN);
        createOrder.setRouteSearchToken(ROUTE_CRITERIA_TOKEN);
        createOrder.setQteInfo(buildQTEInfo());
        createOrder.setTravelerInfoList(buildTravelerInfoList());
        createOrder.setContactInfo(buildContactInfo());
        createOrder.setDeliveryInfo(buildDeliveryInfo());
        createOrder.setOrderMiscInfo(buildOrderMiscInfo());
        createOrder.setXProductList(buildXProductList());
        return createOrder;
    }

    public static SaveOrderRequestType buildSaveOrder_SubmitOrderRequest(long orderid){
        SaveOrderRequestType submitOrder = new SaveOrderRequestType();
        submitOrder.setOrderID(orderid);
        submitOrder.setRequestHeader(buildRequestHeader());
        submitOrder.setAction(ActionType.SubmitOrder);
        submitOrder.setSearchCriteriaToken(SEARCH_CRITERIA_TOKEN);
        submitOrder.setRouteSearchToken(ROUTE_CRITERIA_TOKEN);
        submitOrder.setPaymentInfo(buildPaymentInfo());
        return submitOrder;
    }

    private static PaymentInfoType buildPaymentInfo() {
        PayInfoType payInfo = new PayInfoType();
        payInfo.setPayType("ALIAN");
        // usually, you can get the total amount from the createorder response with the AmountDetail value
        payInfo.setAmount(BigDecimal.valueOf(265));
        List<PayInfoType> payInfoList = new ArrayList<>();
        payInfoList.add(payInfo);

        PaymentInfoType paymentInfo = new PaymentInfoType();
        paymentInfo.setPayInfoList(payInfoList);
        return paymentInfo;
    }

    private static List<XProductInfoType> buildXProductList() {
        // if you want to create additional products, you should fill in this node
        return new ArrayList<>();
    }

    private static OrderMiscInfoType buildOrderMiscInfo() {
        OrderMiscInfoType orderMiscInfo = new OrderMiscInfoType();
        orderMiscInfo.setSourceURL("your website url");
        AffiliateInfoType affiliateInfo = new AffiliateInfoType();
        affiliateInfo.setAllianceID(1111111);
        affiliateInfo.setSid(1111111);
        orderMiscInfo.setAffiliateInfo(affiliateInfo);
        orderMiscInfo.setBookingValidationTokenNumber("token obtained from verify service");
        return orderMiscInfo;
    }

    private static DeliveryInfoType buildDeliveryInfo() {
        DeliveryInfoType deliveryInfo = new DeliveryInfoType();
        deliveryInfo.setDeliveryType(DeliveryTypeType.PJN);
        return deliveryInfo;
    }

    private static ContactInfoType buildContactInfo() {
        ContactInfoType contactInfo = new ContactInfoType();
        contactInfo.setPersonName("LastName/FirstName");
        contactInfo.setGender(GenderType.Male);
        contactInfo.setMobilePhone("15537299349");
        IDCardInfoType idCardInfo = new IDCardInfoType();
        idCardInfo.setIdCardNo("NO12376653");
        idCardInfo.setIdCardType("PASSPORT");
        idCardInfo.setCardTimeLimit(Calendar.getInstance());
        contactInfo.setIdCard(idCardInfo);
        return contactInfo;
    }

    private static List<TravelerInfoType> buildTravelerInfoList() {
        // For example: the order has 2 adults and 1 child
        TravelerInfoType travelerInfo1 = new TravelerInfoType();
        travelerInfo1.setGender(GenderType.Female);
        travelerInfo1.setTravelerCategoryCode(TravelerCategoryCodeType.ADT);
        // Birthday format "yyyy-MM-dd"
        travelerInfo1.setBirthday("1980-05-20");
        travelerInfo1.setNationality("CN");
        travelerInfo1.setEmail("e479234728@qq.com");
        travelerInfo1.setMobilephone("13033335849");
        // countrycode for mobilephone
        travelerInfo1.setCountryCode("86");
        IDCardExtType idCardExt1 = new IDCardExtType();
        idCardExt1.setPersonName("LastName1/FirsName1");
        idCardExt1.setIdCardNo("NO1234833");
        idCardExt1.setIdCardType("PASSPORT");
        // CardTimeLimit should filled in the real time limit
        idCardExt1.setCardTimeLimit(Calendar.getInstance());
        List<IDCardExtType> idCardList1 = new ArrayList<>();
        idCardList1.add(idCardExt1);
        travelerInfo1.setIdCardList(idCardList1);

        TravelerInfoType travelerInfo2 = new TravelerInfoType();
        travelerInfo2.setGender(GenderType.Male);
        travelerInfo2.setTravelerCategoryCode(TravelerCategoryCodeType.ADT);
        travelerInfo2.setBirthday("1975-08-02");
        travelerInfo2.setNationality("CN");
        travelerInfo2.setEmail("65463565@qq.com");
        travelerInfo2.setMobilephone("13073579648");
        travelerInfo2.setCountryCode("86");
        IDCardExtType idCardExt2 = new IDCardExtType();
        idCardExt2.setPersonName("LastName2/FirsName2");
        idCardExt2.setIdCardNo("NO12376653");
        idCardExt2.setIdCardType("PASSPORT");
        idCardExt2.setCardTimeLimit(Calendar.getInstance());
        List<IDCardExtType> idCardList2 = new ArrayList<>();
        idCardList2.add(idCardExt2);
        travelerInfo2.setIdCardList(idCardList2);

        TravelerInfoType travelerInfo3 = new TravelerInfoType();
        travelerInfo3.setGender(GenderType.Male);
        travelerInfo3.setTravelerCategoryCode(TravelerCategoryCodeType.CHD);
        travelerInfo3.setBirthday("2000-10-15");
        travelerInfo3.setNationality("CN");
        travelerInfo3.setEmail("862345756945@qq.com");
        travelerInfo3.setMobilephone("13075654635");
        travelerInfo3.setCountryCode("86");
        IDCardExtType idCardExt3 = new IDCardExtType();
        idCardExt3.setPersonName("LastName3/FirsName3");
        idCardExt3.setIdCardNo("NO12ffd3");
        idCardExt3.setIdCardType("PASSPORT");
        idCardExt3.setCardTimeLimit(Calendar.getInstance());
        List<IDCardExtType> idCardList3 = new ArrayList<>();
        idCardList3.add(idCardExt3);
        travelerInfo3.setIdCardList(idCardList3);

        List<TravelerInfoType> travelerInfoList = new ArrayList<>(3);
        travelerInfoList.add(travelerInfo1);
        travelerInfoList.add(travelerInfo2);
        travelerInfoList.add(travelerInfo3);
        return travelerInfoList;
    }

    private static QTEInfoType buildQTEInfo() {
        // For example: there are 2 adults and 1 child
        // and the flight's saleprice is 100 for adult, 40 for child, and tax is 10 for adult, 5 for child
        // then the qteinfo should be:
        QTEInfoType qteInfo = new QTEInfoType();
        // summation of (saleprice * count) of each traveler category
        qteInfo.setSalePrice(BigDecimal.valueOf(240));
        // summation of (tax * count) of each traveler category
        qteInfo.setTax(BigDecimal.valueOf(25));
        return qteInfo;
    }

    private static RequestHeaderType buildRequestHeader() {
        MessageHeaderType messageHeaderType = new MessageHeaderType();
        // SourceAppID: fill in your application id
        messageHeaderType.setSourceAppID("11111111");
        messageHeaderType.setTransactionID("a226dfdb-bdd8-4aa3-ae4c-de7cba43904e");
        messageHeaderType.setChannelID("Affiliate");
        // SubChannelID: fill in the sub channelID you applied for
        messageHeaderType.setSubChannelID(1111111);
        // CustomerID: fill in user id
        messageHeaderType.setCustomerID("UID");

        RequestHeaderType headerType = new RequestHeaderType();
        headerType.setMessageHeader(messageHeaderType);
        return headerType;
    }

}
