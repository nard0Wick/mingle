package backend.mingle.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    private String name;
    private String lastName;
    @Email(message = "email should be valid")
    private String email;
    @NotBlank(message = "password is mandatory")
    @Size(min = 8, message = "password must be at least eight characters long")
    private String password;
}
