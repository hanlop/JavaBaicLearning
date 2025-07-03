package com.oracle.practice.demo2;

public class Company implements Money{
    private double totalFund;

    public Company(double totalFund) {
        this.totalFund = totalFund;
    }

    public double getTotalFund() {
        return totalFund;
    }

    public void setTotalFund(double totalFund) {
        this.totalFund = totalFund;
    }

    @Override
    public void play(Employee e) {
        double newTotal=this.getTotalFund() - e.getSalary();
        this.setTotalFund(newTotal);
    }
}
