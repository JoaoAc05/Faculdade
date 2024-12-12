import java.lang.reflect.Field;

public abstract class SQLClass {

    private String tableName;
    private String fieldList;
    private String valuesList;
    private String fieldValuesList;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getValueKey() {
        int keyValue = 0;
        try {
            Object value = this.getClass().getDeclaredField(this.getKey()).get(this);
            keyValue = (int) value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keyValue;
    }

    public String getKey() {
        Field[] fields = this.getClass().getDeclaredFields();
        String keyName = "";
        for (Field field : fields) {
            if (field.isAnnotationPresent(Key.class)) {
                keyName = field.getName();
                break;
            }
        }
        return keyName;
    }

    protected void listFields() {
        Field[] fields = this.getClass().getDeclaredFields();

        String fieldString = "";

        for (Field field : fields) {
            fieldString = fieldString + "," + field.getName();
        }
        this.fieldList = fieldString.substring(1);
    }

    protected void listFieldValues() {
        Field[] fields = this.getClass().getDeclaredFields();

        String fieldValuesString = "";
        
        for (Field field : fields) {
            String fieldValue = "";
            try {
                fieldValue = fixFieldType(field);
            } catch (Exception e) {
                e.printStackTrace();
            }
            fieldValuesString = fieldValuesString + "," + fieldValue;
        }
        this.valuesList = fieldValuesString.substring(1);
    }

    protected void listFieldValuesForUpdate() {
        Field[] fields = this.getClass().getDeclaredFields();
        String fieldValuesString = "";
        for (Field field : fields) {
            String fieldValue = "";
            try {
                fieldValue = fixFieldType(field);
            } catch (Exception e) {
                e.printStackTrace();
            }
            fieldValuesString = fieldValuesString + "," + field.getName() + "=" + fieldValue;
        }
        this.fieldValuesList = fieldValuesString.substring(1);
    }

    private String fixFieldType(Field field) throws Exception {
        String value = "";
        field.setAccessible(true);
        Object valueObject = field.get(this);
        if (field.getType() == String.class) {
            value = "'" + valueObject + "'";
        } else {
            value = valueObject.toString();
        }
        return value;
    }

    public String getTableName() {
        return tableName;
    }

    public String selectSQL() {
        return "select * from " + this.tableName;
    }

    public String insertSQL() {
        this.listFields();
        this.listFieldValues();
        return "insert into " + this.tableName + " (" + this.fieldList + ") values (" + this.valuesList + ")";
    }

    public String deleteSQL() {
        return "delete from " + this.tableName + " where " + this.getKey() + " = " + this.getValueKey();
    }

    public String updateSQL() {
        this.listFieldValuesForUpdate();
        return "update " + this.tableName + " set " + this.fieldValuesList + " where " + this.getKey() + " = " + this.getValueKey();
    }
}
