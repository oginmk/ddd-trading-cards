package mk.finki.ukim.emt.ordercatalog.order.services;

import mk.finki.ukim.emt.ordercatalog.order.domain.models.Order;
import mk.finki.ukim.emt.ordercatalog.order.domain.models.OrderId;
import mk.finki.ukim.emt.ordercatalog.order.services.forms.OrderForm;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    OrderId placeOrder(OrderForm orderform);
    List<Order> findAllOrders();
    Optional<Order> findById();

    void addItem(OrderId orderid, OrderForm orderForm) throws Exception;

    void deleteItem(OrderId orderid);
}
