package com.gingerpayments.example;

import com.gingerpayments.sdk.ApiClient.ApiClient;
import com.gingerpayments.sdk.Ginger;

import org.json.JSONArray;
import org.json.JSONObject;

public class PaymentWithMethodSelection {
    public static void main(String[] args) throws Exception {
        String endpoint = System.getenv("GINGER_ENDPOINT");
        String apiKey = System.getenv("GINGER_API_KEY");

        ApiClient client = Ginger.createClient(endpoint, apiKey);

        JSONObject order = client.createOrder(new JSONObject()
            .put("amount", 250)  // in cents
            .put("currency", "EUR")
        );

        System.out.println("Payment URL: " + order.getString("order_url"));
    }
}
