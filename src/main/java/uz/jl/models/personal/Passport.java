package uz.jl.models.personal;

import lombok.*;
import uz.jl.enums.extras.Gender;
import uz.jl.models.Auditable;

import java.time.LocalDateTime;

/**
 * @author Elmurodov Javohir, Mon 12:06 PM. 12/6/2021
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passport extends Auditable {
    private String serial;
    private String number;
    private Gender gender;
    private String firstName;
    private String lastName;
    private String fatherName;

    @Builder(builderMethodName = "childBuilder")
    public Passport(String id, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy, int deleted, String serial, String number, Gender gender, String firstName, String lastName, String fatherName) {
        super(id, createdAt, createdBy, updatedAt, updatedBy, deleted);
        this.serial = serial;
        this.number = number;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
    }
}