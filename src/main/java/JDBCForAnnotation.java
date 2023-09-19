import com.itheima.domain.Love;
import com.itheima.service.LoveService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class JDBCForAnnotation {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.itheima.config");
        //JDBC连接数据库
        DataSource dataSource = ctx.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        String sql = "select * from love";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("days"));
            System.out.println("------------------------------");
        }
        System.out.println("------------------------------");
        //Mybatis连接数据库
        LoveService loveService = ctx.getBean(LoveService.class);
        List<Love> all = loveService.findAll();
        System.out.println(all);
        ctx.close();
    }
}
