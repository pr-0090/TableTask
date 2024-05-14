package service.shared.pojo;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;
import java.security.PrivateKey;
import java.util.List;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GlobalApiResponse <T> {
    private String message;
    private Integer statusCode;
    private List<T> data;
}
