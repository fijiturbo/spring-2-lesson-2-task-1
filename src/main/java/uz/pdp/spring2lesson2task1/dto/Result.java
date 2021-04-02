package uz.pdp.spring2lesson2task1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private String message;
    private boolean status;
    private Object object;

    public Result(String message, boolean status) {
        this.message = message;
        this.status = status;
    }
}
