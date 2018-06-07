package com.kodilla.good.patterns.challenges.service;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRegister productOrderRegister;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final ProductOrderRegister productOrderRegister) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRegister = productOrderRegister;
    }
    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrderDate());
        if(isOrdered) {
            informationService.sendMessage(orderRequest.getCustomer());
            productOrderRegister.createOrder(orderRequest.getCustomer(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new OrderDTO(orderRequest.getCustomer(), true);
        } else {
            return new OrderDTO(orderRequest.getCustomer(), false);
        }
    }
}
