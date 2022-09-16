package Lesson7Type.company;

import java.util.List;

@SuppressWarnings("ConstantConditions")
public class Runner {
    public static void main(String[] args) {
//        Company company = new Company();
//        List<Manager> managerList = company.getManagerList();
//        for (Manager manager : managerList) {
//            if (manager instanceof Manager){
//                manager.callToClient();
//            }else if (manager instanceof SalesManager){
//                ((SalesManager)manager).makeSale();
//            }else if (manager instanceof B2BManager){
//                ((B2BManager)manager).requestStatutoryDocuments();
//            }else if (manager instanceof B2CManager){
//                ((B2CManager)manager).requestPassportData();
//            }
//        }
//чтобы программа правильно отрабатывала кострукторы надо сначала сделать проверку у наследников а потом у класса родителя
        Company company = new Company();
        List<Manager> managerList = company.getManagerList();
        for (Manager manager : managerList) {
//            //patterMaching присваем к переменной имя чтобы не кастить при вызове метода
//            if (manager instanceof B2BManager b2BManager){
//                b2BManager.requestStatutoryDocuments();
//            }else if (manager instanceof B2CManager b2CManager){
//                b2CManager.requestPassportData();
//            }else if (manager instanceof SalesManager salesManager){
//               salesManager.makeSale();
//            }else {
//                manager.callToClient();
//            }
//        }
//            простой switch
//            switch (manager.getClass().getSimpleName()) {
//                case "Manager":
//                    manager.callToClient();
//                    break;
//                case "SalesManager":
//                    ((SalesManager) manager).makeSale();
//                    break;
//                case "B2BManager":
//                    ((B2BManager) manager).requestStatutoryDocuments();
//                    break;
//                case "B2CManager":
//                    ((B2CManager) manager).requestPassportData();
//            }
//            switch expression use witch Java - 14 может возвращать какое-то значение
            String managerType =  switch (manager.getClass().getSimpleName()){
                case "Manager","SalesManager" -> {
                    manager.callToClient();
                  yield "Специалист общего профеля";
                }
                case "B2CManager","B2BManager" -> {
                    ((SalesManager) manager).makeSale();
                    yield "Специалист узкого профеля";
                }
                default -> "Неопределенный специаплист";
            };
            System.out.println(managerType);
        }
    }
}
