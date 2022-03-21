package com.aca.exam.exam2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
Each method of FileSourceUserRepository should read a data from the users.txt file,
process it and return the result without encapsulating any object in it for data storing purposes.
There is no need to create a separate class to read a data from a file.

 */
@Repository
public class FileSourceUserRepository implements CrudRepository<User, String> {

    public static FileSourceUserRepository singletonUserService;

    static {
        try {
            singletonUserService = new FileSourceUserRepository();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private List<User> usersList;

    public FileSourceUserRepository() throws FileNotFoundException {
        usersList = new ArrayList<>();
        fill();
    }

    public static FileSourceUserRepository getInstance() throws FileNotFoundException {
        if (singletonUserService == null) {
            singletonUserService = new FileSourceUserRepository();
        }
        return singletonUserService;
    }

    private void fill() throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File("C:\\Users\\User\\IdeaProjects\\Javalvl1firstproject\\src\\main\\com\\aca\\exam\\exam2\\users.txt")
        );
        scanner.nextLine();
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String lines = scanner.nextLine();
            String[] array = lines.split(",");
            User user = new User();
            user.setId(array[0]);
            user.setFirstName(array[1]);
            user.setLastName(array[2]);
            usersList.add(user);
        }
    }


    @Override
    public User findById(String s) {
        if (s == null) {
            return null;
        }
        for (User users : usersList) {
            if (users.getId().equals(s)) {
                return users;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return usersList;
    }

    public List<User> getUsersList() {
        return usersList;
    }
}