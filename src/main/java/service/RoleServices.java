package service;

import com.example.demo.entity.Role;
import com.example.demo.entity.Ground;
import java.util.List;
import java.util.Optional;

public interface RoleServices {
    Optional<Role> getRoleById(Integer id);
    List<Role> getAllRoles();
    void saveRole(Role roles);
    void deleteRoleById(Integer id);
}
