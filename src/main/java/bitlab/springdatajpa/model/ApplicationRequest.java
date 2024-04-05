package bitlab.springdatajpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_requests")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApplicationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")  //не обязательно писать это
    private String userName;

    @Column(name = "courseName")
    private String courseName;

    @Column(name = "commentary", columnDefinition = "TEXT")
    private String commentary;

    @Column(name = "phoneNumber")
    private String phone;

    @Column(name = "handled")
    private boolean handled;

}