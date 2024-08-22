import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.reflect.*;

public class Database {
         
    private static Connection connect() {            		
        String url = "jdbc:sqlite:db\\data.db";            
         
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {            
            e.printStackTrace();        
        }

        return connection;
                                             
    }

    public static boolean executeSQL(String sql){
        boolean ok = false;

        Connection currentConnection = connect();
        
        try {
            Statement statement = currentConnection.createStatement();            
            statement.execute(sql);
            currentConnection.close();
            ok = true;
        } catch (SQLException e1) {            
            e1.printStackTrace();
            ok = false;
        } 

        return ok;
    }

    public static boolean inserirRegistro(SQLClass registro){
        return executeSQL(registro.insertSQL());
    }       
    
    public static boolean atualizarRegistro(SQLClass registro){
        return executeSQL(registro.updateSQL());        
    }

    public static boolean deletarRegistro(SQLClass registro){
        return executeSQL(registro.deleteSQL());
    }           

    public static boolean abrirID(SQLClass registro, int id){        
        Field[] fields = registro.getClass().getDeclaredFields();
        boolean ok = false;
        Connection currentConnection = connect();
        try {
            PreparedStatement stmt = currentConnection.prepareStatement(registro.selectSQL() + " where id = " + id);    
            ResultSet resultSet = stmt.executeQuery();
            
            for (Field field : fields) {                    
                if (field.getType() == String.class){
                    field.set(registro, resultSet.getString(field.getName()));                       
                } else {
                    field.set(registro, resultSet.getInt(field.getName()));                       
                }
            }    
            ok = true;

            currentConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
            ok = false;            
        }            
        return ok;
    }
}