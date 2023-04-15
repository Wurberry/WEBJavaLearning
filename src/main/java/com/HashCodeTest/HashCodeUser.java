package com.HashCodeTest;

public class HashCodeUser {

    private long id;
    private String name;
    private String email;

    // region Setters Getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // endregion

    public HashCodeUser(long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int hashCode() {
        return (int) id * name.hashCode() *  email.hashCode();
//        return (int) id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        HashCodeUser user = (HashCodeUser) o;
        return id == user.id
                && (name.equals(user.name))
                && email.equals(user.email);
    }
}
