package com.zzzhc.demo.model;

import com.zzzhc.base.lang.Lists;
import com.zzzhc.demo.entity.Permission;
import com.zzzhc.demo.entity.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleModel extends Role {
    
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
    
    public List<Long> getPermissionIds() {
        if (permissions == null) {
            return new ArrayList<>();
        }
        return Lists.map(permissions, "id");
    }
}
