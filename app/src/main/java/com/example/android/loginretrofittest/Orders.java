package com.example.android.loginretrofittest;

public class Orders {

        private int orderId, subtotal, delivery, total, discount, status, phone;
        private String location, orderTime, creation_time, kitchen;
        private Address fullAddress;

        public Orders(int orderId, int subtotal, int delivery, int total, int discount, int status, int phone,
                      String location, String orderTime, String creation_time, String kitchen, Address fullAddress) {
            this.orderId = orderId;
            this.subtotal = subtotal;
            this.delivery = delivery;
            this.total = total;
            this.discount = discount;
            this.status = status;
            this.phone = phone;
            this.location = location;
            this.orderTime = orderTime;
            this.creation_time = creation_time;
            this.kitchen = kitchen;
            this.fullAddress = fullAddress;
        }

        public int getOrderId() {
            return orderId;
        }

        public int getSubtotal() {
            return subtotal;
        }

        public int getDelivery() {
            return delivery;
        }

        public int getTotal() {
            return total;
        }

        public int getDiscount() {
            return discount;
        }

        public int getStatus() {
            return status;
        }

        public int getPhone() {
            return phone;
        }

        public String getLocation() {
            return location;
        }

        public String getOrderTime() {
            return orderTime;
        }

        public String getCreationTime() {
            return creation_time;
        }

        public String getKitchen() {
            return kitchen;
        }

        public Address getFullAddress() {
            return fullAddress;
        }
    }


