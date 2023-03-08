public class PhoneFactory {
    public Phone getPhone(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Low Price")){
            return new HuaweiPhone();
        }
        if(shapeType.equalsIgnoreCase("Middle Range Price")){
            return new SamsungPhone();
        }
        if(shapeType.equalsIgnoreCase("expensive")){
            return new IPhone();
        }
        return  null;
    }
}
