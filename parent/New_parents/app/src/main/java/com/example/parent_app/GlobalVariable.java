package com.example.parent_app;

import android.app.Application;

public class GlobalVariable extends Application {
    private String name;     //帳號
    private String user;     //帳號
    private String password;  //密碼
    private String sex;  //性別
    private String student; //
    private String statistics;
    //----------------------------------------------------------------------------------------
    //user(Activity) & relationship (SQL)
    //個人資料
    private String relationship1; //個資Q1
    private String relationship2; //Q2
    private String relationship3; //Q3
    private String relationship4; //Q4
    private String relationship5; //Q5
    private String relationship6; //Q6
    private String relationship7; //Q7
    private String relationship8; //Q8
    private String relationship9; //Q9
    //----------------------------------------------------------------------------------------
    //interaction(Activity) & interactive_scale_w (SQL)
    //孩子的互動
    private String interaction1;  //互動Q1
    private String interaction2;  //Q2
    private String interaction3;  //Q3
    private String interaction4;  //Q4
    private String interaction5;  //Q5
    private String interaction6;  //Q6
    //----------------------------------------------------------------------------------------
    //performance(Activity) & adaptation_scale_w (SQL)
    //孩子的表現
    private String performance1;  //表現Q1
    private String performance2;  //Q2
    private String performance3;  //Q3
    private String performance4;  //Q4
    private String performance5;  //Q5
    private String performance6;  //Q6
    private String performance7;  //Q7
    private String performance8;  //Q8
    private String performance9;  //Q9
    private String performance10;  //Q10
    //----------------------------------------------------------------------------------------
    //emotions(Activity) & mood_disorders_scale_w (SQL)
    //孩子的行為
    private String emotions1; //行為Q1
    private String emotions2; //Q2
    private String emotions3; //Q3
    private String emotions4; //Q4
    private String emotions5; //Q5
    private String emotions6; //Q6
    private String emotions7; //Q7
    private String emotions8; //Q8
    private String emotions9; //Q9
    private String emotions10; //Q10
    private String emotions11; //Q11
    private String emotions12; //Q12
    private String emotions13; //Q13
    private String emotions14; //Q14
    private String emotions15; //Q15
    private String emotions16; //Q16
    private String emotions17; //Q17
    private String emotions18; //Q18
    private String emotions19; //Q19
    private String emotions20; //Q20
    private String emotions21; //Q21
    private String emotions22; //Q22
    private String emotions23; //Q23
    private String emotions24; //Q24
    private String emotions25; //Q25
    private String emotions26; //Q26
    private String emotions27; //Q27
    private String emotions28; //Q28


    //修改 變數値
    public void setname(String name) {
        this.name = name;
    }
    public void setuser(String user) {
        this.user = user;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public void setstudent(String student){ this.student = student;}
    public void setstatistics(String statistics) {
        this.statistics = statistics;
    }
    //----------------------------------------------------------------------------------------
    //user(Activity) & relationship (SQL)
    //個人資料
    public void setrelationship1(String relationship1) { this.relationship1 = relationship1;}
    public void setrelationship2(String relationship2) { this.relationship2 = relationship2;}
    public void setrelationship3(String relationship3) { this.relationship3 = relationship3;}
    public void setrelationship4(String relationship4) { this.relationship4 = relationship4;}
    public void setrelationship5(String relationship5) { this.relationship5 = relationship5;}
    public void setrelationship6(String relationship6) { this.relationship6 = relationship6;}
    public void setrelationship7(String relationship7) { this.relationship7 = relationship7;}
    public void setrelationship8(String relationship8) { this.relationship8 = relationship8;}
    public void setrelationship9(String relationship9) { this.relationship9 = relationship9;}
    //----------------------------------------------------------------------------------------
    //interaction(Activity) & interactive_scale_w (SQL)
    //孩子的互動
    public void setinteraction1(String interaction1) {
        this.interaction1 = interaction1;
    }
    public void setinteraction2(String interaction2) {
        this.interaction2 = interaction2;
    }
    public void setinteraction3(String interaction3) {
        this.interaction3 = interaction3;
    }
    public void setinteraction4(String interaction4) {
        this.interaction4 = interaction4;
    }
    public void setinteraction5(String interaction5) {
        this.interaction5 = interaction5;
    }
    public void setinteraction6(String interaction6) {
        this.interaction6 = interaction6;
    }
    //----------------------------------------------------------------------------------------
    //performance(Activity) & adaptation_scale_w (SQL)
    //孩子的表現
    public void setperformance1(String performance1) {
        this.performance1 = performance1;
    }
    public void setperformance2(String performance2) { this.performance2 = performance2; }
    public void setperformance3(String performance3) {
        this.performance3 = performance3;
    }
    public void setperformance4(String performance4) {
        this.performance4 = performance4;
    }
    public void setperformance5(String performance5) {
        this.performance5 = performance5;
    }
    public void setperformance6(String performance6) {
        this.performance6 = performance6;
    }
    public void setperformance7(String performance7) {
        this.performance7 = performance7;
    }
    public void setperformance8(String performance8) { this.performance8 = performance8; }
    public void setperformance9(String performance9) {
        this.performance9 = performance9;
    }
    public void setperformance10(String performance10) {
        this.performance10 = performance10;
    }
    //----------------------------------------------------------------------------------------
    //emotions(Activity) & mood_disorders_scale_w (SQL)
    public void setemotions1(String emotions1) {this.emotions1 =emotions1;}
    public void setemotions2(String emotions2) {this.emotions2 =emotions2;}
    public void setemotions3(String emotions3) {this.emotions3 =emotions3;}
    public void setemotions4(String emotions4) {this.emotions4 =emotions4;}
    public void setemotions5(String emotions5) {this.emotions5 =emotions5;}
    public void setemotions6(String emotions6) {this.emotions6 =emotions6;}
    public void setemotions7(String emotions7) {this.emotions7 =emotions7;}
    public void setemotions8(String emotions8) {this.emotions8 =emotions8;}
    public void setemotions9(String emotions9) {this.emotions9 =emotions9;}
    public void setemotions10(String emotions10) {this.emotions10 =emotions10;}
    public void setemotions11(String emotions11) {this.emotions11 =emotions11;}
    public void setemotions12(String emotions12) {this.emotions12 =emotions12;}
    public void setemotions13(String emotions13) {this.emotions13 =emotions13;}
    public void setemotions14(String emotions14) {this.emotions14 =emotions14;}
    public void setemotions15(String emotions15) {this.emotions15 =emotions15;}
    public void setemotions16(String emotions16) {this.emotions16 =emotions16;}
    public void setemotions17(String emotions17) {this.emotions17 =emotions17;}
    public void setemotions18(String emotions18) {this.emotions18 =emotions18;}
    public void setemotions19(String emotions19) {this.emotions19 =emotions19;}
    public void setemotions20(String emotions20) {this.emotions20 =emotions20;}
    public void setemotions21(String emotions21) {this.emotions21 =emotions21;}
    public void setemotions22(String emotions22) {this.emotions22 =emotions22;}
    public void setemotions23(String emotions23) {this.emotions23 =emotions23;}
    public void setemotions24(String emotions24) {this.emotions24 =emotions24;}
    public void setemotions25(String emotions25) {this.emotions25 =emotions25;}
    public void setemotions26(String emotions26) {this.emotions26 =emotions26;}
    public void setemotions27(String emotions27) {this.emotions27 =emotions27;}
    public void setemotions28(String emotions28) {this.emotions28 =emotions28;}





    //取得 變數值
    public String getname() { return name;  }
    public String getuser() { return user;  }
    public String getpassword() { return password; }
    public String getstudent() {return student;}
    public String getstatistics() {
        return statistics;
    }
    //----------------------------------------------------------------------------------------
    //user(Activity) & relationship (SQL)
    //個人資料
    public String getrelationship1() {return relationship1;}
    public String getrelationship2() {return relationship2;}
    public String getrelationship3() {return relationship3;}
    public String getrelationship4() {return relationship4;}
    public String getrelationship5() {return relationship5;}
    public String getrelationship6() {return relationship6;}
    public String getrelationship7() {return relationship7;}
    public String getrelationship8() {return relationship8;}
    public String getrelationship9() {return relationship9;}

    //----------------------------------------------------------------------------------------
    //interaction(Activity) & interactive_scale_w (SQL)
    //孩子的互動
    public String getinteraction1() { return interaction1; }
    public String getinteraction2() { return interaction2; }
    public String getinteraction3() { return interaction3; }
    public String getinteraction4() { return interaction4; }
    public String getinteraction5() { return interaction5; }
    public String getinteraction6() { return interaction6; }
    //----------------------------------------------------------------------------------------
    //performance(Activity) & adaptation_scale_w (SQL)
    //孩子的表現
    public String getperformance1() { return performance1; }
    public String getperformance2() { return performance2; }
    public String getperformance3() { return performance3; }
    public String getperformance4() { return performance4; }
    public String getperformance5() { return performance5; }
    public String getperformance6() { return performance6; }
    public String getperformance7() { return performance7; }
    public String getperformance8() { return performance8; }
    public String getperformance9() { return performance9; }
    public String getperformance10() { return performance10; }
    //----------------------------------------------------------------------------------------
    //emotions(Activity) & mood_disorders_scale_w (SQL)
    public String getemotion1() { return emotions1;}
    public String getemotion2() { return emotions2;}
    public String getemotion3() { return emotions3;}
    public String getemotion4() { return emotions4;}
    public String getemotion5() { return emotions5;}
    public String getemotion6() { return emotions6;}
    public String getemotion7() { return emotions7;}
    public String getemotion8() { return emotions8;}
    public String getemotion9() { return emotions9;}
    public String getemotion10() { return emotions10;}
    public String getemotion11() { return emotions11;}
    public String getemotion12() { return emotions12;}
    public String getemotion13() { return emotions13;}
    public String getemotion14() { return emotions14;}
    public String getemotion15() { return emotions15;}
    public String getemotion16() { return emotions16;}
    public String getemotion17() { return emotions17;}
    public String getemotion18() { return emotions18;}
    public String getemotion19() { return emotions19;}
    public String getemotion20() { return emotions20;}
    public String getemotion21() { return emotions21;}
    public String getemotion22() { return emotions22;}
    public String getemotion23() { return emotions23;}
    public String getemotion24() { return emotions24;}
    public String getemotion25() { return emotions25;}
    public String getemotion26() { return emotions26;}
    public String getemotion27() { return emotions27;}
    public String getemotion28() { return emotions28;}

}