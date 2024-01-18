package aop;

public class Client {
    private String fullName;
    private String type;

    public Client() {
    }

    public Client(String fullName, String type) {
        this.fullName = fullName;
        this.type = type;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
