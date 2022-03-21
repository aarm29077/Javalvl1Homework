package com.aca.exam.exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository
public class FileSourceOrderRepository implements CrudRepository<Order, Integer> {

    private List<Order> orderedList;

    private FileSourceUserRepository fileSourceUserRepository;

    public FileSourceOrderRepository(FileSourceUserRepository fileSourceUserRepository) throws FileNotFoundException {
        orderedList = new ArrayList<>();
        this.fileSourceUserRepository = fileSourceUserRepository;
        fill();
    }

    private void fill() throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File("C:\\Users\\User\\IdeaProjects\\Javalvl1firstproject\\src\\main\\com\\aca\\exam\\exam2\\orders.txt")
        );
        scanner.nextLine();
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String lines = scanner.nextLine();
            String[] array = lines.split(",");

            Order order = new Order();

            order.setId(Integer.parseInt(array[0]));
            order.setName(array[1]);
            order.setPrice(Integer.parseInt(array[2]));

            for (User users : fileSourceUserRepository.getUsersList()) {
                if (array[3].equals(users.getId())) {
                    order.setPurchasedUser(users);
                    break;
                }
                break;
            }
            orderedList.add(order);
        }
    }


    @Override
    public Order findById(Integer s) {

        if (s < 1 || s > 9) {
            return null;
        }
        for (Order orders : orderedList) {
            if (orders.getId() == s) {
                return orders;
            }
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        return orderedList;
    }

    public List<Order> getOrderedList() {
        return orderedList;
    }

    public FileSourceUserRepository getFileSourceUserRepository() {
        return fileSourceUserRepository;
    }

    public List<Order> findAllByUserId(String userId) {
        List<Order> newList = new ArrayList<>();

        for (User users : fileSourceUserRepository.getUsersList()) {
            if (users.getId().equals(userId)) {
                for (Order orders : orderedList) {
                    if (orders.getPurchasedUser().equals(users)) {
                        newList.add(orders);
                    }
                }
            }
        }
        return newList;
    }
}
