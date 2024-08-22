package SqlFactory;

import java.lang.reflect.Field;
import java.lang.reflection.*;

public abstract class SQLClass {

    private String tableNmae;
    private String fieldList;
    private String valuesList;
    private String fieldValuesList; 
}
    public void settableName(String tableNmae) {
        this.tableNmae = tableNmae;  
    }

    public int getValueKey() {
        int KeyValue = 0;
        try {
            Object value = this.getClass().getDeclaredField(this.getKey()).get(this);

            KeyValue = (int) value;
        } catch (Exception e ) {
            e.printStackTrace();
        }
        return KeyValue;

    public String getKey() {
        Field[] fields = this.getClass().getDeclaredFields();

        String keyName = "";

        for (Field field : fields) {
            if (field.isAnnotationPresent(Key.class)){
                keyName = field.getName();
            }
            return keyName;

    protected void listFields(){
        Field[] fields = this .getClass().getDeclaredFields();

        String fieldString = "";

        for(Field field : fields){
            fieldString = fieldString + "," + field.getName();
         }

         this.fiedsList = fieldsString.substring(1);

    protected void listFieldsValues(){
        Field[] fields = this .getClass().getDeclaredFields();

        String fieldsValuesString = "";

        for(Field field : fields){
            String fielValue = "";

            try {
                FieldValue = FixFieldType(field);
            } catch (Exception e) {
                e.printStackTrace();
            }
            fielValuesString = fieldsValuesString + "," + field.getName() + "=" + fielValue;
        }
        this.fiedsValueList = fieldsValuesString.substring(1);
    }
    private String FixFieldType(|Field field) throws Exception {
        String value = "";
        Object valueObject = field.get(this);

        if (field.getTyoe() == String.class) {
            value = value + "'" + valueObject + "'" ;
        } else {
            value = value + valueObject;
        }
        return value;

    public String getTableName(){
        return tableName;
    }
    
    public void selectSQL(){
        return "select * from " + this.tableName;
    }

    public String insertSQL(){
        this.listFields();
        return "insert into " + this.tableName + " (" + this.fieldList + ") values (" + this.valuesList + ")" ;
    }

    public String deletSQL(){
        return "delete from " + this.tableName + "where " + this.getKey() + " = " + this.getvaluesKey();
    }

    public String updateSQL(){
        return "update " + this.tableName + " set " + this.fieldValuesList + " where " + this.getKey() + " = " + this.getvaluesKey();
    }
  
    

