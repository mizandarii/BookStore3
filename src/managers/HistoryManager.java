/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Book;
import entity.Client;
import entity.OrderHistory;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HistoryManager {
        public OrderHistory returnNewOrderHistory(List<Book> books, List<Client> clients){
        System.out.println("----------Продажа книги клиенту----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список книг: ");
        int countBooks = books.size();
        for (int i = 0; i<countBooks; i++){
            System.out.println(i + 1 + ". " + books.get(i).getBookName());
        }
        
        System.out.println("список клиентов");
        int countClients = clients.size();
        for (int i = 0; i<countClients; i++){
            System.out.println(i + 1 + ". "+ clients.get(i).getName() + " " + clients.get(i).getName());
        }
        
        System.out.println("Выберите номер книги: ");
        int numberBook = scanner.nextInt();
        Book book = books.get(numberBook - 1);
        
        System.out.println("выберите номер клиента: ");
        int numberClient = scanner.nextInt();
        Client client = clients.get(numberClient - 1);
        Calendar c = new GregorianCalendar();
        OrderHistory orderHistory = new OrderHistory(null, book, client, c.getTime());
        
        
        
        return orderHistory;
    }
}