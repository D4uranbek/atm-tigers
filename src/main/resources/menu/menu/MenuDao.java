package uz.jl.daos.menu;

import uz.jl.enums.Permission;
import uz.jl.enums.UserRole;
import uz.jl.services.session.SessionService;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MenuDao {
    public static Map<Permission, Integer> getMenuList() {
        Map<Permission, Integer> permissionMap = new TreeMap<>();

        if (Objects.isNull(SessionService.getSessionUser())) {
            permissionMap.put(Permission.LOGIN, 1);
            permissionMap.put(Permission.REGISTER, 2);
            permissionMap.put(Permission.EXIT, 3);
            return permissionMap;
        }

        UserRole role = SessionService.getSessionUser().getUser().getRole();

        if (role.equals(UserRole.SUPER)) {
            permissionMap.put(Permission.CREATE_BANK, 1);
            permissionMap.put(Permission.UPDATE_BANK, 2);
            permissionMap.put(Permission.DELETE_BANK, 3);
            permissionMap.put(Permission.LIST_BANK, 4);
            permissionMap.put(Permission.BLOCK_BANK, 5);
            permissionMap.put(Permission.UN_BLOCK_BANK, 6);
            permissionMap.put(Permission.BLOCK_LIST_BANK, 7);
            permissionMap.put(Permission.CREATE_ADMIN, 8);
            permissionMap.put(Permission.DELETE_ADMIN, 9);
            permissionMap.put(Permission.LIST_ADMIN, 10);
            permissionMap.put(Permission.BLOCK_ADMIN, 11);
            permissionMap.put(Permission.UN_BLOCK_ADMIN, 12);
            permissionMap.put(Permission.BLOCK_LIST_ADMIN, 13);
            permissionMap.put(Permission.PROFILE, 14);
            permissionMap.put(Permission.LOGOUT, 15);
        }

        if (role.equals(UserRole.ADMIN)) {
            permissionMap.put(Permission.CREATE_BRANCH, 1);
            permissionMap.put(Permission.UPDATE_BRANCH, 2);
            permissionMap.put(Permission.DELETE_BRANCH, 3);
            permissionMap.put(Permission.LIST_BRANCH, 4);
            permissionMap.put(Permission.BLOCK_BRANCH, 5);
            permissionMap.put(Permission.UN_BLOCK_BRANCH, 6);
            permissionMap.put(Permission.BLOCK_LIST_BRANCH, 7);
            permissionMap.put(Permission.CREATE_MANAGER, 8);
            permissionMap.put(Permission.DELETE_MANAGER, 9);
            permissionMap.put(Permission.LIST_MANAGER, 10);
            permissionMap.put(Permission.BLOCK_MANAGER, 11);
            permissionMap.put(Permission.UN_BLOCK_MANAGER, 12);
            permissionMap.put(Permission.BLOCK_LIST_MANAGER, 13);
            permissionMap.put(Permission.PROFILE, 14);
            permissionMap.put(Permission.LOGOUT, 15);
        }

        if (role.equals(UserRole.MANAGER)) {
            permissionMap.put(Permission.CREATE_ATM, 1);
            permissionMap.put(Permission.UPDATE_ATM, 2);
            permissionMap.put(Permission.DELETE_ATM, 3);
            permissionMap.put(Permission.LIST_ATM, 4);
            permissionMap.put(Permission.BLOCK_ATM, 5);
            permissionMap.put(Permission.UN_BLOCK_ATM, 6);
            permissionMap.put(Permission.BLOCK_LIST_ATM, 7);
            permissionMap.put(Permission.CREATE_EMPLOYEE, 8);
            permissionMap.put(Permission.DELETE_EMPLOYEE, 9);
            permissionMap.put(Permission.LIST_EMPLOYEE, 10);
            permissionMap.put(Permission.BLOCK_EMPLOYEE, 11);
            permissionMap.put(Permission.UN_BLOCK_EMPLOYEE, 12);
            permissionMap.put(Permission.BLOCK_LIST_EMPLOYEE, 13);
            permissionMap.put(Permission.PROFILE, 14);
            permissionMap.put(Permission.LOGOUT, 15);
        }

        if (role.equals(UserRole.EMPLOYEE)) {
            permissionMap.put(Permission.DELETE_USER, 1);
            permissionMap.put(Permission.LIST_USER, 2);
            permissionMap.put(Permission.BLOCK_USER, 3);
            permissionMap.put(Permission.UN_BLOCK_USER, 4);
            permissionMap.put(Permission.BLOCK_LIST_USER, 5);
            permissionMap.put(Permission.PROFILE, 6);
            permissionMap.put(Permission.LOGOUT, 7);
        }

        if (role.equals(UserRole.USER)) {
            permissionMap.put(Permission.PROFILE, 1);
            permissionMap.put(Permission.LOGOUT, 2);
        }

        return permissionMap;
    }

    public static Integer getCode(Map<Permission, Integer> map, Integer choice) {
        for (Integer value : map.values()) {
            if (value.equals(choice)) return choice;
        }
        return null;
    }
}
