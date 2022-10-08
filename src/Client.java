import java.util.Objects;

public class Client {

    private final int clientId;
    private  String name;
    private int age;


    public Client(int id, String name, int age) {
        this.clientId = id;
        this.name = name;
        this.age = age;

    }
    public int getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Client(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return this.clientId == ((Client) obj).clientId;
    }

    @Override
    public String toString() {
        return "\nClient [clientId=" + clientId
                + ", clientName=" + name
                + ", clientAge=" + age + "]";
    }
}
