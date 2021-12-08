package uz.jl.models;

import lombok.*;
import uz.jl.utils.BaseUtils;

import java.time.LocalDateTime;

/**
 * @author Elmurodov Javohir, Mon 11:40 AM. 12/6/2021
 */

@Getter
@Setter
@ToString
public class Auditable implements BaseEntity {
    private String id;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
    private int deleted;

    public Auditable() {
        this.id = BaseUtils.genId();
    }

    @Builder(builderMethodName = "parentBuilder", buildMethodName = "parentBuild")
    public Auditable(LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy, int deleted) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.deleted = deleted;
    }



    public static void main(String[] args) {

    }


}
