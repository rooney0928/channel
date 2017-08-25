package com.qunadai.channel.bean;

/**
 * Created by wayne on 2017/8/22.
 */

public class User {


    /**
     * account : {"createdTime":1498098114000,"enabled":true,"expired":false,"id":"60023bce-4b79-4ce0-98d1-fc9d76abc1b9","locked":false,"name":"17301841751","password":"456","state":"NORMAL","status":"NORMAL","updatedTime":1498099287000,"verificationCode":"105376"}
     * accountNonExpired : true
     * accountNonLocked : true
     * authorities : {}
     * avatarUrl : 1
     * bank : 1
     * bankCardName : 1
     * bankCardNumber : 1
     * commision : 1
     * companyName : 1
     * createdTime : 1498098115000
     * credentialsNonExpired : true
     * email : 1
     * enabled : true
     * id : 821867ec-566a-4eff-a7bb-b37aa8f5914a
     * lastLoginTime : 1498099898802
     * lastSMS : 1498099168000
     * loanCount : 1
     * loanSum : 1
     * mobileNumber : 1
     * name : 1
     * password : 456
     * qq : 1
     * status : NORMAL
     * underCount : 1
     * updatedTime : 1498099898816
     * username : 17301841751
     */

    private AccountBean account;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private AuthoritiesBean authorities;
    private String avatarUrl;
    private String bank;
    private String bankCardName;
    private String bankCardNumber;
    private int commision;
    private String companyName;
    private long createdTime;
    private boolean credentialsNonExpired;
    private String email;
    private boolean enabled;
    private String id;
    private long lastLoginTime;
    private long lastSMS;
    private int loanCount;
    private int loanSum;
    private String mobileNumber;
    private String name;
    private String password;
    private String qq;
    private String status;
    private int underCount;
    private long updatedTime;
    private String username;

    public AccountBean getAccount() {
        return account;
    }

    public void setAccount(AccountBean account) {
        this.account = account;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public AuthoritiesBean getAuthorities() {
        return authorities;
    }

    public void setAuthorities(AuthoritiesBean authorities) {
        this.authorities = authorities;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankCardName() {
        return bankCardName;
    }

    public void setBankCardName(String bankCardName) {
        this.bankCardName = bankCardName;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public long getLastSMS() {
        return lastSMS;
    }

    public void setLastSMS(long lastSMS) {
        this.lastSMS = lastSMS;
    }

    public int getLoanCount() {
        return loanCount;
    }

    public void setLoanCount(int loanCount) {
        this.loanCount = loanCount;
    }

    public int getLoanSum() {
        return loanSum;
    }

    public void setLoanSum(int loanSum) {
        this.loanSum = loanSum;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUnderCount() {
        return underCount;
    }

    public void setUnderCount(int underCount) {
        this.underCount = underCount;
    }

    public long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static class AccountBean {
        /**
         * createdTime : 1498098114000
         * enabled : true
         * expired : false
         * id : 60023bce-4b79-4ce0-98d1-fc9d76abc1b9
         * locked : false
         * name : 17301841751
         * password : 456
         * state : NORMAL
         * status : NORMAL
         * updatedTime : 1498099287000
         * verificationCode : 105376
         */

        private long createdTime;
        private boolean enabled;
        private boolean expired;
        private String id;
        private boolean locked;
        private String name;
        private String password;
        private String state;
        private String status;
        private long updatedTime;
        private String verificationCode;

        public long getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(long createdTime) {
            this.createdTime = createdTime;
        }

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public boolean isExpired() {
            return expired;
        }

        public void setExpired(boolean expired) {
            this.expired = expired;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isLocked() {
            return locked;
        }

        public void setLocked(boolean locked) {
            this.locked = locked;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public long getUpdatedTime() {
            return updatedTime;
        }

        public void setUpdatedTime(long updatedTime) {
            this.updatedTime = updatedTime;
        }

        public String getVerificationCode() {
            return verificationCode;
        }

        public void setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
        }
    }

    public static class AuthoritiesBean {
    }
}
