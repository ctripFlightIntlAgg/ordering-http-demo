package com.ctrip.intlflight.ordering.demo;

import com.alibaba.fastjson.JSONObject;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.SaveOrderRequestType;
import com.ctrip.intlflight.ordering.contract.saveorder.v2.SaveOrderResponseType;
import com.ctrip.intlflight.ordering.demo.helper.MessageHelper;
import com.ctrip.intlflight.ordering.tokenmanager.app.AppTokenManager;
import com.ctrip.intlflight.ordering.tokenmanager.app.CerberusApp;
import java.net.URL;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: tangxinyi
 * @create: 2020-03-04
 */
@Slf4j
public class OrderingHttpClient {
    private static RestTemplate restTemplate = new RestTemplate();

    /**
     * the url described in README
     */
    private static final String BASE_URL = "http://apiproxy.ctrip.com/apiproxy/soa2/15169";
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // AppTokenManager&CerberusApp：used for gateway validation in production environment
    private static AppTokenManager appTokenManager;
    private static CerberusApp app;

    public static void main(String[] args) {
        try {
            // gateway validation in prod
            initForProd();
            // saveOrder
            // get url by Cerberus
            String saveOrderUrl = BASE_URL + "/saveOrder";
            URL url = new URL(saveOrderUrl);
            String completeURI = app.updateRequestUri(url.getPath());
            URL completeURL = new URL(url.getProtocol(), url.getHost(), completeURI);
            System.out.println("completeURL1:" + completeURL);

            // 1. create order
            SaveOrderRequestType createOrderRequest = MessageHelper.buildSaveOrder_CreateOrderRequest();
            SaveOrderResponseType createOrderResponse = getResponse(completeURL.toString(), createOrderRequest, SaveOrderResponseType.class);
            // 2. submit order
            // get the order id from createorder response, submitorder need the id
            long orderid = createOrderResponse.getOrderID();
            SaveOrderRequestType submitOrderRequest = MessageHelper.buildSaveOrder_SubmitOrderRequest(orderid);
            SaveOrderResponseType submitOrder = getResponse(completeURL.toString(), createOrderRequest, SaveOrderResponseType.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * refer to gateway.doc
     *
     * appId:302
     * appKey:6e874df9281f82cf
     * appSecret:c11edbecb682f3ca612c9b28d4cf4b288cb4dba09a4441f01170210d79d2ee49
     */
    private static void initForProd() {
        try {
            appTokenManager = new AppTokenManager();
            app = new CerberusApp(302L, "6e874df9281f82cf",
                    "c11edbecb682f3ca612c9b28d4cf4b288cb4dba09a4441f01170210d79d2ee49");
            appTokenManager.addApp(app);
            appTokenManager.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * post http request
     */
    private static <I, O> O getResponse(String url, I request, Class<O> responseClass) {
        O response;
        try {
            String responseResult = restTemplate.postForObject(url, JSONObject.toJSONStringWithDateFormat(request, DATE_FORMAT), String.class);
            response = JSONObject.parseObject(responseResult, responseClass);
        } catch (Exception ex) {
            log.error("OrderingHttpClient", ex);
            response = null;
        }

        return response;
    }
}
