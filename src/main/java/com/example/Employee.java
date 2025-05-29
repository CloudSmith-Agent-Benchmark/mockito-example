package com.example;

import java.time.LocalDateTime;

public class Employee {

        private String id;
        private double salary;
        private boolean paid;
        private LocalDateTime lastPaymentTime;

        public Employee(String id, double salary) {
                this.id = id;
                this.salary = salary;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public boolean isPaid() {
                return paid;
        }

        public void setPaid(boolean paid) {
                this.paid = paid;
                if (paid) {
                        this.lastPaymentTime = LocalDateTime.now();
                }
        }

        public LocalDateTime getLastPaymentTime() {
                return lastPaymentTime;
        }

        @Override
        public String toString() {
                return "Employee [id=" + id + ", salary=" + salary + ", lastPaymentTime=" + lastPaymentTime + "]";
        }

}
