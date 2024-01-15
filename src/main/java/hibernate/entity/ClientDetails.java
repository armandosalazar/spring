package hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_details")
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String web;
    private String phone;
    private String comments;
    @OneToOne(mappedBy = "clientDetails")
    @JoinColumn(name = "client_id")
    private Client client;

    public ClientDetails() {

    }

    public ClientDetails(String web, String phone, String comments) {
        this.web = web;
        this.phone = phone;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "ClientDetails{" +
                "id=" + id +
                ", web='" + web + '\'' +
                ", phone='" + phone + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
