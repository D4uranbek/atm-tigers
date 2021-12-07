package uz.jl.models.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.annotations.Unique;
import uz.jl.enums.auth.Role;
import uz.jl.enums.auth.UserStatus;
import uz.jl.models.Auditable;
import uz.jl.models.card.Cards;
import uz.jl.models.personal.Passport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Elmurodov Javohir, Mon 11:40 AM. 12/6/2021
 */
@Getter
@Setter
@NoArgsConstructor
public class User extends Auditable {
    private String id;
    @Unique
    private String username;
    private String password;
    private String bankId;
    private Role role;
    private UserStatus status;
    private List<Passport> passportData = new ArrayList<>(1);
    private List<Cards> cards = new ArrayList<>(1);
    @Unique
    private String phoneNumber;


/*    @Builder(builderMethodName = "childBuilder", buildMethodName = "childBuild")
    public User(LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy, int deleted, String username) {
        super(createdAt, createdBy, updatedAt, updatedBy, deleted);
        this.username = username;
    }*/
}
