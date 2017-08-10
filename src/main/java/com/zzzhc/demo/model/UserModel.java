package com.zzzhc.demo.model;

import com.zzzhc.base.lang.Lists;
import com.zzzhc.demo.entity.Role;
import com.zzzhc.demo.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserModel extends User {
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Long> getRoleIds() {
        if (roles == null) {
            return new ArrayList<>();
        }
        return Lists.map(roles, "id");
    }
}
