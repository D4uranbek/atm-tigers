package uz.jl.models.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.models.BaseEntity;
import uz.jl.utils.BaseUtils;

/**
 * @author Elmurodov Javohir, Tue 12:18 PM. 12/7/2021
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Language implements BaseEntity {
    private String id = BaseUtils.genId();
    private String name;
    private String code;
}
