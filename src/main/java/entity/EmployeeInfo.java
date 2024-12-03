package entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "EmployeeInfo")
public class EmployeeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    private String employeeFirstName;
    private String employeeLastName;
    private String email;
    private String mobileNo;
    private int age;
    private String Address;
    private String dateOfJoining;
    private double salary;
    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedTime;



}