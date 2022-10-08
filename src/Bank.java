import java.security.Key;
import java.util.*;

public class Bank {
    private static final UserInput input = new ConsoleUserInput();


    public static void main(String[] args) {
        Client client = new Client(1, "Jack London", 21);
        Client client1 = new Client(2, "John Doe", 35);
        Client client2 = new Client(3, "Alice Cooper", 44);

        Account account = new Account(1, 1231231);
        Account account1 = new Account(2, 123);
        Account account2 = new Account(3, 1123);
        Account account3 = new Account(4, 17567);
        Account account4 = new Account(5, 97586);
        Account account5 = new Account(6, 8677456);
        Account account6 = new Account(7, 343);
        Account account7 = new Account(8, 5);

        Map<Client, List<Account>> map = new HashMap<>();
        map.put(client, List.of(account, account1, account2));
        map.put(client1, List.of(account3, account4));
        map.put(client2, List.of(account5, account6, account7));

        Map<Account, Client> map2 = new HashMap<>();
        map2.put(account,client);
        map2.put(account1,client);
        map2.put(account2,client);
        map2.put(account3, client1);
        map2.put(account4, client1);
        map2.put(account5, client2);
        map2.put(account6, client2);
        map2.put(account7, client2);

//        searchAccountsByClient(map);
        searchСlientByAccount(map2);
    }

    public static int searchAccountsByClient(Map<Client, List<Account>> map) {
        System.out.println("Введите ID клиента: ");
        int clientIdFromConsole = input.read();
        Client searchClient = new Client(clientIdFromConsole);
        List<Account> accounts = map.get(searchClient);
        return clientIdFromConsole;
    }

    public static int searchСlientByAccount(Map<Account, Client> map2) {
        System.out.println("Введите ID аккаунта: ");
        int accountIdFromConsole = input.read();
        Account account = new Account(accountIdFromConsole);
        Client client = map2.get(account);
        return accountIdFromConsole;
    }
}
