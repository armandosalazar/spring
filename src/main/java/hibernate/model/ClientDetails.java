package hibernate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "client_details")
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "client_id")
    private Long clientId;
    private String web;
    private String phone;
    private String comments;

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
