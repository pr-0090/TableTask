package com.example.demo.controller;

import com.example.demo.entity.Role;
import service.shared.pojo.GlobalApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RoleServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleServices roleService;

    @GetMapping
    public GlobalApiResponse<List<Role>> getAllRoles() {
        return GlobalApiResponse
                .<List<Role>>builder()
                .data(RoleServices.getAllRoles())
                .statusCode(200)
                .message("Roles retrieved successfully")
                .build();
    }

    @PostMapping
    public GlobalApiResponse<String> saveRole(@RequestBody @Valid Role roles) {
        roleService.saveRole(roles);
        return GlobalApiResponse
                .<String>builder()
                .data("saved")
                .statusCode(200)
                .message("Role saved successfully")
                .build();
    }

    @PutMapping("/{id}")
    public GlobalApiResponse<String> updateRole(@PathVariable Integer id, @RequestBody @Valid roles roles) {
        Role.setId(id);
        roleService.saveRole(Role);
        return GlobalApiResponse
                .<String>builder()
                .data("updated")
                .statusCode(200)
                .message("Role updated successfully")
                .build();
    }

    @GetMapping("/{id}")
    public GlobalApiResponse<Role> getRoleById(@PathVariable Integer id) {
        Optional<Role> role = roleService.getRoleById(id);
        return role.map(value ->
                        GlobalApiResponse.<Role>builder()
                                .data(value)
                                .statusCode(200)
                                .message("Role retrieved successfully")
                                .build())
                .orElseGet(() ->
                        GlobalApiResponse.<Role>builder()
                                .statusCode(404)
                                .message("Role not found")
                                .build());
    }

    @DeleteMapping("/{id}")
    public GlobalApiResponse<String> deleteRoleById(@PathVariable Integer id) {
        roleService.deleteRoleById(id);
        return GlobalApiResponse
                .<String>builder()
                .data("deleted")
                .statusCode(200)
                .message("Role deleted successfully")
                .build();
    }
}
