package com.qunadai.channel.bean;

/**
 * Created by wayne on 2017/8/29.
 */

public class Loan {

    /**
     * id : 3d77f0bc-5c91-43ae-b337-323a319f30dd
     * createdTime : 1492660800000
     * updatedTime : 1503403558000
     * status : NORMAL
     * provider : {"id":"c7ead9d0-0ebc-4f9a-be8f-9a746f2c941d","createdTime":1491019200000,"updatedTime":1491019200000,"status":"NORMAL","name":"中腾信","type":null,"address":null,"code":null,"contactsPerson":null,"contactsPhoneNumber":null,"icon":null,"lppStatus":"ENABLED"}
     * productNo : ZXT
     * name : 中腾信
     * describe : 有社保、3分钟最高借15万
     * type : H5
     * icon : 8e649b4f-d5a7-42f0-8345-b90ce5289f89
     * amount : 10000-15000
     * minAmount : 10000
     * maxAmount : 150000
     * term : 12,24,36,48期
     * minTerm : 12
     * maxTerm : 48
     * termUnit : 月
     * applicationConditions : 1.月入2000及以上 2.有社保 3.有公积金
     * applicationMaterials : 身份证、工作证明、收入证明
     * url : http://mjk.chinatopcredit.com/?channel=WAPYK5
     * num : 5173
     * rate : 0.7%-5%
     * loanTime : 3分钟
     * pStatus : ENABLED
     * showIndexStatus : SHOW
     * minRate : 0.007
     * maxRate : 0.05
     * rateStatus : MONTH
     * sucRate : 10%
     * pOrder : 1
     * balanceRatio : null
     * balanceType : null
     */

    private String id;
    private long createdTime;
    private long updatedTime;
    private String status;
    private ProviderBean provider;
    private String productNo;
    private String name;
    private String describe;
    private String type;
    private String icon;
    private String amount;
    private int minAmount;
    private int maxAmount;
    private String term;
    private int minTerm;
    private int maxTerm;
    private String termUnit;
    private String applicationConditions;
    private String applicationMaterials;
    private String url;
    private int num;
    private String rate;
    private String loanTime;
    private String pStatus;
    private String showIndexStatus;
    private double minRate;
    private double maxRate;
    private String rateStatus;
    private String sucRate;
    private int pOrder;
    private Object balanceRatio;
    private Object balanceType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProviderBean getProvider() {
        return provider;
    }

    public void setProvider(ProviderBean provider) {
        this.provider = provider;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getMinTerm() {
        return minTerm;
    }

    public void setMinTerm(int minTerm) {
        this.minTerm = minTerm;
    }

    public int getMaxTerm() {
        return maxTerm;
    }

    public void setMaxTerm(int maxTerm) {
        this.maxTerm = maxTerm;
    }

    public String getTermUnit() {
        return termUnit;
    }

    public void setTermUnit(String termUnit) {
        this.termUnit = termUnit;
    }

    public String getApplicationConditions() {
        return applicationConditions;
    }

    public void setApplicationConditions(String applicationConditions) {
        this.applicationConditions = applicationConditions;
    }

    public String getApplicationMaterials() {
        return applicationMaterials;
    }

    public void setApplicationMaterials(String applicationMaterials) {
        this.applicationMaterials = applicationMaterials;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    public String getPStatus() {
        return pStatus;
    }

    public void setPStatus(String pStatus) {
        this.pStatus = pStatus;
    }

    public String getShowIndexStatus() {
        return showIndexStatus;
    }

    public void setShowIndexStatus(String showIndexStatus) {
        this.showIndexStatus = showIndexStatus;
    }

    public double getMinRate() {
        return minRate;
    }

    public void setMinRate(double minRate) {
        this.minRate = minRate;
    }

    public double getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(double maxRate) {
        this.maxRate = maxRate;
    }

    public String getRateStatus() {
        return rateStatus;
    }

    public void setRateStatus(String rateStatus) {
        this.rateStatus = rateStatus;
    }

    public String getSucRate() {
        return sucRate;
    }

    public void setSucRate(String sucRate) {
        this.sucRate = sucRate;
    }

    public int getPOrder() {
        return pOrder;
    }

    public void setPOrder(int pOrder) {
        this.pOrder = pOrder;
    }

    public Object getBalanceRatio() {
        return balanceRatio;
    }

    public void setBalanceRatio(Object balanceRatio) {
        this.balanceRatio = balanceRatio;
    }

    public Object getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(Object balanceType) {
        this.balanceType = balanceType;
    }

    public static class ProviderBean {
        /**
         * id : c7ead9d0-0ebc-4f9a-be8f-9a746f2c941d
         * createdTime : 1491019200000
         * updatedTime : 1491019200000
         * status : NORMAL
         * name : 中腾信
         * type : null
         * address : null
         * code : null
         * contactsPerson : null
         * contactsPhoneNumber : null
         * icon : null
         * lppStatus : ENABLED
         */

        private String id;
        private long createdTime;
        private long updatedTime;
        private String status;
        private String name;
        private Object type;
        private Object address;
        private Object code;
        private Object contactsPerson;
        private Object contactsPhoneNumber;
        private Object icon;
        private String lppStatus;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public long getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(long createdTime) {
            this.createdTime = createdTime;
        }

        public long getUpdatedTime() {
            return updatedTime;
        }

        public void setUpdatedTime(long updatedTime) {
            this.updatedTime = updatedTime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getCode() {
            return code;
        }

        public void setCode(Object code) {
            this.code = code;
        }

        public Object getContactsPerson() {
            return contactsPerson;
        }

        public void setContactsPerson(Object contactsPerson) {
            this.contactsPerson = contactsPerson;
        }

        public Object getContactsPhoneNumber() {
            return contactsPhoneNumber;
        }

        public void setContactsPhoneNumber(Object contactsPhoneNumber) {
            this.contactsPhoneNumber = contactsPhoneNumber;
        }

        public Object getIcon() {
            return icon;
        }

        public void setIcon(Object icon) {
            this.icon = icon;
        }

        public String getLppStatus() {
            return lppStatus;
        }

        public void setLppStatus(String lppStatus) {
            this.lppStatus = lppStatus;
        }
    }
}
