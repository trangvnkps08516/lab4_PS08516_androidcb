package com.ps08516.lab4_ps08516_androidcb;

public class Contact {
    private String avatar;
    private String name;
    private String phone;

    public Contact(String name, String phone,String avatar) {
        this.avatar = avatar;
        this.name = name;
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
