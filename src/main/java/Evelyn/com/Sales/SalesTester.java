package Evelyn.com.Sales;

import Evelyn.com.Sales.Customer;

//一般客戶 - 滿千送百
//銀級客戶-滿千送百,再送百元還禮金
//金級客戶-滿千送二百,再送二百還禮金
//0001 1200 1100
//0002 800 800
//0003 2000 1800(200) <--銀級客戶
class SalesTester {

    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
    }
}
