package pdp.uz.lesson6.payload;

import lombok.Data;

@Data
public class PaymentDto {
    private String simCardNumber;

    private String payType;

    private double amount;

    private String payerName;

    private String payerId;
}
