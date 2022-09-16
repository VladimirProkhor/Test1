package Lesson7Type.company;

public class ClassCasting {
    public static void main(String[] args) {
        //расширение типов upcasting
//        B2BManager b2BManager = new B2BManager();
//        b2BManager.requestStatutoryDocuments();
//        SalesManager salesManager =b2BManager;
//        salesManager.engageContract();
//        Manager manager = salesManager;
//        manager.callToClient();
        //сужения типов downcasting
        Manager manager = new B2BManager();
        SalesManager salesManager = (SalesManager) manager;
        B2BManager b2BManager = (B2BManager) salesManager;


    }
}

