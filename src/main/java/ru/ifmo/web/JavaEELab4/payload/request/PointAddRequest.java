package ru.ifmo.web.JavaEELab4.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointAddRequest {

    @NotNull(message = "Enter X value")
    @Min(value = -4, message = "Must be from -4 to 4") @Max(value = 4, message = "Must be from -4 to 4")
    private Double x;

    @NotNull(message = "Enter Y value")
    @Min(value = -3, message = "Must be from -3 to 5") @Max(value = 5, message = "Must be from -3 to 5")
    private Double y;

    @NotNull(message = "Enter R value")
    @Min(value = 1, message = "Must be from 1 to 2") @Max(value = 4, message = "Must be from 1 to 2")
    private Double r;
}
