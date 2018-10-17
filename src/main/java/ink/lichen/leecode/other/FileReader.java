package ink.lichen.leecode.other;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-10-16.
 */
public class FileReader {

    private static final String sql = "INSERT INTO cashpool_user_account(user_id, business, user_type, phone,   user_name, is_overdraft, overdraft, balance ,account_status)" +
            "VALUES('userId','112', '301', 'phoneN', 'nameN','1', '10000.00',   '0.00',    '1');";

    public static void main(String[] args) {
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
			/* 读入TXT文件 */
            String pathname = "E:\\账号初始化信用账户数据.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            List<String> list = new ArrayList<>();

            String line = "";
            line = br.readLine();
            list.add(line);
            while (line != null) {
                line = br.readLine(); // 一次读入一行数据
                list.add(line);
            }

			/* 写入Txt文件 */
            File writename = new File("E:\\result.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));

            for (String val : list){
                if (val == null || val.length() == 0){
                    continue;
                }
                String [] vals =  val.split(",");
                 String phone = vals[2].trim();
                 String name = vals[3].trim();
                 String userId = vals[4].trim();
                 String writeSql = sql.replace("userId",userId).replace("phoneN",phone).replace("nameN",name);
                out.write(writeSql+"\r\n"); // \r\n即为换行
            }


            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
