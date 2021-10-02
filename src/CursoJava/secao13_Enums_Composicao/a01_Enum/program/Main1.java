package CursoJava.secao13_Enums_Composicao.a01_Enum.program;

import CursoJava.secao13_Enums_Composicao.a01_Enum.entities.Order;
import CursoJava.secao13_Enums_Composicao.a01_Enum.entities.enums.OrderStatus;

import java.util.Date;

public class Main1 {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus order1 = OrderStatus.DELIVERED; //recebe o status de Delivered
        OrderStatus order2 = OrderStatus.valueOf("DELIVERED"); //recebe o status a partir de uma String

        System.out.println(order1); //os dois resultados devem ser iguais
        System.out.println(order2);

    }
}
