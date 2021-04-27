package pdp.uz.lesson6.payload;

import lombok.Data;

@Data
public class StaffDto {
    private String userName;

    private String fullName;

    private Integer roleId;

    private Integer filialId;

    private String position;

    private String password;

}
