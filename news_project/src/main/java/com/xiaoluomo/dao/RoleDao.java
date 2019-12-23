package com.xiaoluomo.dao;

import com.xiaoluomo.po.Role;

import java.util.List;

public interface RoleDao {
    //获取所有角色信息
    public List<Role> selectRoleList();


}
