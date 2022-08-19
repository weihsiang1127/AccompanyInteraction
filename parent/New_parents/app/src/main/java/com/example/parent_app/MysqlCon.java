package com.example.parent_app;
import android.icu.text.SimpleDateFormat;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class MysqlCon {

    // 伺服器資料庫定義
    String mysql_ip = "184.168.97.99";
    int mysql_port = 3306; // Port 預設為 3306
    String db_name = "treatment";
    String url = "jdbc:mysql://" + mysql_ip + ":" + mysql_port + "/" + db_name + "?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8";
    String db_user = "spopob8v48s2";
    String db_password = "Mm35176661";


    public void run() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Log.v("DB", "加載驅動成功");
        } catch (ClassNotFoundException e) {
            Log.e("DB", "加載驅動失敗");
            return;
        }

        // 連接資料庫
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            Log.v("DB", "遠端連接成功");
        } catch (SQLException e) {
            Log.e("DB", "遠端連接失敗");
            Log.e("DB", e.toString());
        }
    }
    //取得日記填寫資料
    public ArrayList<HashMap<String, String>> getdiaryvalue(String id, String date) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `diary` as a LEFT JOIN (SELECT `parent_id`,`student_id` FROM `relationship`) as b on a.`student_id` =b.`student_id` where `parent_id`='" +  id + "' and `write_diary_time`='"+  date + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String mood = rs.getString("mood");
                String weather = rs.getString("weather");
                String person = rs.getString("person");
                String time = rs.getString("time");
                String fraction = rs.getString("fraction");


                hashMap.put("mood", mood);
                hashMap.put("weather", weather);
                hashMap.put("person", person);
                hashMap.put("time", time);
                hashMap.put("fraction", fraction);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得日記填寫資料
    public ArrayList<HashMap<String, String>> getstdname(String id) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT `student`.`student_name` FROM `student` INNER JOIN `relationship`ON `student`.`user_id` =`relationship`.`student_id` where `relationship`.`parent_id`='" +  id + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String student_name = rs.getString("student_name");

                hashMap.put("student_name", student_name);


                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //修改資料
    public void updaterelationship(String id,String relationship,String cohabitation,String discipline,String home_order,String brothers_sisters,String drug,String income,String f_educate,String m_educate) {
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "UPDATE `relationship` SET `relationship`='" +  relationship + "',`cohabitation`='" +  cohabitation + "',`discipline`='" +  discipline + "',`home_order`='" +  home_order + "',`brothers_sisters`='" +  brothers_sisters + "',`drug`='" +  drug + "',`income`='" +  income + "',`f_educate`='" +  f_educate + "',`m_educate`='" +  m_educate + "' where  `parent_id`='" +  id + "'";
            Log.v("DB", "修改資料完成：" + sql);
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //取得溫度計填寫資料
    public ArrayList<HashMap<String, String>> getthvalue(String id,String date) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `mood_thermometer` as a LEFT JOIN (SELECT `parent_id`,`student_id` FROM `relationship`) as b on a.`student_id` =b.`student_id` where  b.`parent_id`='" +  id + "'and a.`write_time`='"+  date + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String tmmt_mood1 = rs.getString("tmmt_mood1");
                String tmmt_mood2 = rs.getString("tmmt_mood2");
                String tmmt_body = rs.getString("tmmt_body");
                String tmmt_idea = rs.getString("tmmt_idea");
                String tmmt_calmidea = rs.getString("tmmt_calmidea");
                String tmmt_mood3 = rs.getString("tmmt_mood3");


                hashMap.put("tmmt_mood1", tmmt_mood1);
                hashMap.put("tmmt_mood2", tmmt_mood2);
                hashMap.put("tmmt_body", tmmt_body);
                hashMap.put("tmmt_idea", tmmt_idea);
                hashMap.put("tmmt_calmidea", tmmt_calmidea);
                hashMap.put("tmmt_mood3", tmmt_mood3);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得interactive填寫資料
    public ArrayList<HashMap<String, String>> getinteractive1(String id,String date) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `interactive_scale_w` where  `parent_id`='" +  id + "'and  `write_time`='"+  date + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String q1 = rs.getString("q1");
                String q2 = rs.getString("q2");
                String q3 = rs.getString("q3");
                String q4 = rs.getString("q4");
                String q5 = rs.getString("q5");
                String q6 = rs.getString("q6");


                hashMap.put("q1", q1);
                hashMap.put("q2", q2);
                hashMap.put("q3", q3);
                hashMap.put("q4", q4);
                hashMap.put("q5", q5);
                hashMap.put("q6", q6);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得個人資料
    public ArrayList<HashMap<String, String>> getrelationship(String id) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `relationship` where  `parent_id`='" +  id  + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String relationship = rs.getString("relationship");
                String cohabitation = rs.getString("cohabitation");
                String discipline = rs.getString("discipline");
                String home_order = rs.getString("home_order");
                String brothers_sisters	 = rs.getString("brothers_sisters");
                String drug = rs.getString("drug");
                String income = rs.getString("income");
                String f_educate = rs.getString("f_educate");
                String m_educate = rs.getString("m_educate");


                hashMap.put("relationship", relationship);
                hashMap.put("cohabitation", cohabitation);
                hashMap.put("discipline", discipline);
                hashMap.put("home_order", home_order);
                hashMap.put("brothers_sisters", brothers_sisters);
                hashMap.put("drug", drug);
                hashMap.put("income", income);
                hashMap.put("f_educate", f_educate);
                hashMap.put("m_educate", m_educate);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得孩子行為填寫資料
    public ArrayList<HashMap<String, String>> getdisorders(String id) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `mood_disorders_scale_w` where  `parent_id`='" +  id + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String q1 = rs.getString("q1");
                String q2 = rs.getString("q2");
                String q3 = rs.getString("q3");
                String q4 = rs.getString("q4");
                String q5 = rs.getString("q5");
                String q6 = rs.getString("q6");
                String q7 = rs.getString("q7");
                String q8 = rs.getString("q8");
                String q9 = rs.getString("q9");
                String q10 = rs.getString("q10");
                String q11 = rs.getString("q11");
                String q12 = rs.getString("q12");
                String q13 = rs.getString("q13");
                String q14 = rs.getString("q14");
                String q15 = rs.getString("q15");
                String q16 = rs.getString("q16");
                String q17 = rs.getString("q17");
                String q18 = rs.getString("q18");
                String q19 = rs.getString("q19");
                String q20 = rs.getString("q20");
                String q21 = rs.getString("q21");
                String q22 = rs.getString("q22");
                String q23 = rs.getString("q23");
                String q24 = rs.getString("q24");
                String q25 = rs.getString("q25");
                String q26 = rs.getString("q26");
                String q27 = rs.getString("q27");
                String q28 = rs.getString("q28");


                hashMap.put("q1", q1);
                hashMap.put("q2", q2);
                hashMap.put("q3", q3);
                hashMap.put("q4", q4);
                hashMap.put("q5", q5);
                hashMap.put("q6", q6);
                hashMap.put("q7", q7);
                hashMap.put("q8", q8);
                hashMap.put("q9", q9);
                hashMap.put("q10", q10);
                hashMap.put("q11", q11);
                hashMap.put("q12", q12);
                hashMap.put("q13", q13);
                hashMap.put("q14", q14);
                hashMap.put("q15", q15);
                hashMap.put("q16", q16);
                hashMap.put("q17", q17);
                hashMap.put("q18", q18);
                hashMap.put("q19", q19);
                hashMap.put("q20", q20);
                hashMap.put("q21", q21);
                hashMap.put("q22", q22);
                hashMap.put("q23", q23);
                hashMap.put("q24", q24);
                hashMap.put("q25", q25);
                hashMap.put("q26", q26);
                hashMap.put("q27", q27);
                hashMap.put("q28", q28);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得是否填寫過孩子的行為
    public String getsdisorderscount(String id) {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT COUNT(*)  FROM `mood_disorders_scale_w` where `parent_id`='" +  id + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String count = rs.getString("COUNT(*)");
                data = count;
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    //取得是否填寫過孩子的行為
    public String getadaptationcount(String id) {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT COUNT(*)  FROM `adaptation_scale_w` where `parent_id`='" +  id + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String count = rs.getString("COUNT(*)");
                data = count;
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    //取得您與孩子的互動填寫資料
    public ArrayList<HashMap<String, String>> getinteractive(String id,String date) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `interactive_scale_w` where  `parent_id`='" +  id + "'and  `write_time`='"+  date + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String q1 = rs.getString("q1");
                String q2 = rs.getString("q2");
                String q3 = rs.getString("q3");
                String q4 = rs.getString("q4");
                String q5 = rs.getString("q5");
                String q6 = rs.getString("q6");


                hashMap.put("q1", q1);
                hashMap.put("q2", q2);
                hashMap.put("q3", q3);
                hashMap.put("q4", q4);
                hashMap.put("q5", q5);
                hashMap.put("q6", q6);


                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得親子綁定
    public ArrayList<HashMap<String, String>> getstudent(String id) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM `relationship` where  `parent_id`='" +  id + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String student_id = rs.getString("student_id");

                hashMap.put("student_id", student_id);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }

    //取得天數
    public ArrayList<HashMap<String, String>> getmaxdate(String id) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT v.date,`student`.`adaptation_scale` FROM `student` INNER JOIN (SELECT a.`student_id`,b.date, b.parent_id FROM `relationship` as a LEFT JOIN (SELECT *,MAX(`write_time`) as date FROM `adaptation_scale_w` where `parent_id` ='" +  id + "') as b on a.parent_id = b.parent_id WHERE b.parent_id ='" +  id + "') as v ON`student`.`user_id`= v.`student_id`";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                HashMap<String, String> hashMap = new HashMap<>();

                String date = rs.getString("date");
                String adaptation_scale = rs.getString("adaptation_scale");

                hashMap.put("date", date);
                hashMap.put("adaptation_scale", adaptation_scale);

                arrayList.add(hashMap);
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Log.v("DB", "寫入資料完成：" + arrayList);
        return arrayList;
    }


    public int getData(String sql) {
        String data = "";
        int n = 0;
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            //String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            n = 0;
            while (rs.next()) {
                n++;
                /*String id = rs.getString("parent_id");
                data += id + ", ";
                String id2 = rs.getString("password");
                data += id2 + ", " + "\n";*/
            }

            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return n;
    }

    public void interactive_scale_w(String id, String q1, String q2, String q3, String q4, String q5, String q6) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `interactive_scale_w`(`parent_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`,`write_time`) VALUES('" + id + "','" + q1 + "','" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','" + q6 + "','" + date + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗");
            Log.e("DB", e.toString());
        }
    }

    public void adaptation_scale_w( String parent_id, String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8, String q9, String q10) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `adaptation_scale_w`(`parent_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`,`q8`,`q9`,`q10`,`write_time`) VALUES('" + parent_id + "','" + q1 + "','" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','" + q6 + "','" + q7 + "','" + q8 + "','" + q9 + "','" + q10 + "','" + date + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗");
            Log.e("DB", e.toString());
        }
    }

    public void mood_disorders_scale_w(String id, String q1, String q2, String q3, String q4, String q5
            , String q6, String q7, String q8, String q9, String q10, String q11, String q12
            , String q13, String q14, String q15, String q16, String q17, String q18, String q19
            , String q20, String q21, String q22, String q23, String q24, String q25, String q26
            , String q27, String q28) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `mood_disorders_scale_w`(`parent_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`,`q8`,`q9`,`q10`,`q11`,`q12`,`q13`,`q14`,`q15`,`q16`,`q17`,`q18`,`q19`,`q20`,`q21`,`q22`,`q23`,`q24`,`q25`,`q26`,`q27`,`q28`,`write_time`) VALUES('" + id + "','" + q1 + "','" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','" + q6 + "','" + q7 + "','" + q8 + "','" + q9 + "','" + q10 + "','" + q11 + "','" + q12 + "','" + q13 + "','" + q14 + "','" + q15 + "','" + q16 + "','" + q17 + "','" + q18 + "','" + q19 + "','" + q20 + "','" + q21 + "','" + q22 + "','" + q23 + "','" + q24 + "','" + q25 + "','" + q26 + "','" + q27 + "','" + q28 + "','" + date + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗");
            Log.e("DB", e.toString());
        }
    }

    public void relationship(String parent_id, String student_id, String relationship, String cohabitation, String discipline, String home_order, String brothers_sisters,String drug, String income, String f_educate, String m_educate) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `relationship`(`parent_id`, `student_id`, `relationship`, `cohabitation`, `discipline`, `home_order`, `brothers_sisters`, `drug`, `income`, `f_educate`, `m_educate`) VALUES('" + parent_id + "','" + student_id + "','" + relationship + "','" + cohabitation + "','" + discipline + "','" + home_order + "','" + brothers_sisters + "','" + drug + "','" + income + "','" + f_educate + "','" + m_educate + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗");
            Log.e("DB", e.toString());
        }
    }

    //-------------------------------------------------------------------------------------//
    public String getRecord(String recordsql) {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            //String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(recordsql);
            while (rs.next()) {
                String time = rs.getString("write_time");
                data += time + "\n";
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public String getRecordtime(String recordtimesql) {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            //String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(recordtimesql);
            while (rs.next()) {
                String time = rs.getString("COUNT(parent_id)");
                data += time;
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public String getfirst(String first) {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            //String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(first);
            int n = 0;
            while (rs.next()) {
                String id = rs.getString("parent_id");
                data += id + "\n";
                n++;
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public String getr(String recordtimesql) {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            //String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(recordtimesql);
            while (rs.next()) {
                String time = rs.getString("relationship");
                data = time;
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

}





