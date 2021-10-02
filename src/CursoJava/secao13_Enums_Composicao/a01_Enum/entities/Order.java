package CursoJava.secao13_Enums_Composicao.a01_Enum.entities;

import CursoJava.secao13_Enums_Composicao.a01_Enum.entities.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status; //veja a classe Order do tipo Enum

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus (OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
