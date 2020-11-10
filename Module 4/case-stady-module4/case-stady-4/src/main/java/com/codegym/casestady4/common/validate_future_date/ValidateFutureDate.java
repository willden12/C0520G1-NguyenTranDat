package com.codegym.casestady4.common.validate_future_date;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = FutureDateConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateFutureDate {
    String message() default "Invalid value !!!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
