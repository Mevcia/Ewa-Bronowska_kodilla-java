package com.kodilla.good.patterns.challenges.service;

public class Application {
    public static void main(String[] args) {
        OrderRequestCollector orderRequestCollector = new OrderRequestCollector();
        OrderRequest orderRequest = orderRequestCollector.collect();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRegister());
        orderProcessor.process(orderRequest);
    }
}
