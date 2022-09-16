package LembdaLesson6;

public class Boogalter implements NameFormatter<String>{
    public Boogalter() {
        tabNum =457;
    }
    int tabNum;
    @Override
    public String makeFormat(String t1, String t2) {
        return t1.toUpperCase() +"%" + Math.random()+ "-"+ "Prokhorova" + tabNum + "_$_" + t2;
    }
}
