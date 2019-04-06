package com.zf;

public class DemoModule {

    private String accountName;
    private Double account = 0.0;

    public DemoModule() {
    }

    public DemoModule(String accountName) {

        this.accountName = accountName;
    }

    public DemoModule(String accountName, Double account) {
        this.accountName = accountName;
        this.account = account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    //收红包
    public void shouBalance(){
        System.out.println("现在红包有："+account+"元");
    }
    //抢红包
    public void qiangBalance(Double number){
        account = account + number;
    }
    //发红包
    public void faBalance(Double number){
        account = account - number;
    }
}
