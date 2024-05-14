package service;


import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleServices {
    private final RoleRepository rolesRepository;


    @Override
    public Optional<Role> getRoleById(Integer id) {
        return rolesRepository.findById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public void saveRole(Role roles) {
        rolesRepository.save(roles);
    }

    @Override
    public void deleteRoleById(Integer id) {
        rolesRepository.deleteById(id);
    }
}
