package atul.backend.accenture.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "credit_card", schema = "creditrecord", catalog = "")
public class CreditCardEntity {
    private int id;
    private String name;
    private String limBal;
    private String sex;
    private String education;
    private String marriage;
    private Integer age;
    private String pay0;
    private String pay2;
    private String pay3;
    private String pay4;
    private String pay5;
    private String pay6;
    private Double billAmt1;
    private Double billAmt2;
    private Double billAmt3;
    private Double billAmt4;
    private Double billAmt5;
    private Double billAmt6;
    private Double payAmt1;
    private Double payAmt2;
    private Double payAmt3;
    private Double payAmt4;
    private Double payAmt5;
    private Double payAmt6;
    private String payNxtMnth;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "LIM_BAL")
    public String getLimBal() {
        return limBal;
    }

    public void setLimBal(String limBal) {
        this.limBal = limBal;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "EDUCATION")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "MARRIAGE")
    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "PAY_0")
    public String getPay0() {
        return pay0;
    }

    public void setPay0(String pay0) {
        this.pay0 = pay0;
    }

    @Basic
    @Column(name = "PAY_2")
    public String getPay2() {
        return pay2;
    }

    public void setPay2(String pay2) {
        this.pay2 = pay2;
    }

    @Basic
    @Column(name = "PAY_3")
    public String getPay3() {
        return pay3;
    }

    public void setPay3(String pay3) {
        this.pay3 = pay3;
    }

    @Basic
    @Column(name = "PAY_4")
    public String getPay4() {
        return pay4;
    }

    public void setPay4(String pay4) {
        this.pay4 = pay4;
    }

    @Basic
    @Column(name = "PAY_5")
    public String getPay5() {
        return pay5;
    }

    public void setPay5(String pay5) {
        this.pay5 = pay5;
    }

    @Basic
    @Column(name = "PAY_6")
    public String getPay6() {
        return pay6;
    }

    public void setPay6(String pay6) {
        this.pay6 = pay6;
    }

    @Basic
    @Column(name = "BILL_AMT1")
    public Double getBillAmt1() {
        return billAmt1;
    }

    public void setBillAmt1(Double billAmt1) {
        this.billAmt1 = billAmt1;
    }

    @Basic
    @Column(name = "BILL_AMT2")
    public Double getBillAmt2() {
        return billAmt2;
    }

    public void setBillAmt2(Double billAmt2) {
        this.billAmt2 = billAmt2;
    }

    @Basic
    @Column(name = "BILL_AMT3")
    public Double getBillAmt3() {
        return billAmt3;
    }

    public void setBillAmt3(Double billAmt3) {
        this.billAmt3 = billAmt3;
    }

    @Basic
    @Column(name = "BILL_AMT4")
    public Double getBillAmt4() {
        return billAmt4;
    }

    public void setBillAmt4(Double billAmt4) {
        this.billAmt4 = billAmt4;
    }

    @Basic
    @Column(name = "BILL_AMT5")
    public Double getBillAmt5() {
        return billAmt5;
    }

    public void setBillAmt5(Double billAmt5) {
        this.billAmt5 = billAmt5;
    }

    @Basic
    @Column(name = "BILL_AMT6")
    public Double getBillAmt6() {
        return billAmt6;
    }

    public void setBillAmt6(Double billAmt6) {
        this.billAmt6 = billAmt6;
    }

    @Basic
    @Column(name = "PAY_AMT1")
    public Double getPayAmt1() {
        return payAmt1;
    }

    public void setPayAmt1(Double payAmt1) {
        this.payAmt1 = payAmt1;
    }

    @Basic
    @Column(name = "PAY_AMT2")
    public Double getPayAmt2() {
        return payAmt2;
    }

    public void setPayAmt2(Double payAmt2) {
        this.payAmt2 = payAmt2;
    }

    @Basic
    @Column(name = "PAY_AMT3")
    public Double getPayAmt3() {
        return payAmt3;
    }

    public void setPayAmt3(Double payAmt3) {
        this.payAmt3 = payAmt3;
    }

    @Basic
    @Column(name = "PAY_AMT4")
    public Double getPayAmt4() {
        return payAmt4;
    }

    public void setPayAmt4(Double payAmt4) {
        this.payAmt4 = payAmt4;
    }

    @Basic
    @Column(name = "PAY_AMT5")
    public Double getPayAmt5() {
        return payAmt5;
    }

    public void setPayAmt5(Double payAmt5) {
        this.payAmt5 = payAmt5;
    }

    @Basic
    @Column(name = "PAY_AMT6")
    public Double getPayAmt6() {
        return payAmt6;
    }

    public void setPayAmt6(Double payAmt6) {
        this.payAmt6 = payAmt6;
    }

    @Basic
    @Column(name = "PAY_NXT_MNTH")
    public String getPayNxtMnth() {
        return payNxtMnth;
    }

    public void setPayNxtMnth(String payNxtMnth) {
        this.payNxtMnth = payNxtMnth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardEntity that = (CreditCardEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(limBal, that.limBal) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(education, that.education) &&
                Objects.equals(marriage, that.marriage) &&
                Objects.equals(age, that.age) &&
                Objects.equals(pay0, that.pay0) &&
                Objects.equals(pay2, that.pay2) &&
                Objects.equals(pay3, that.pay3) &&
                Objects.equals(pay4, that.pay4) &&
                Objects.equals(pay5, that.pay5) &&
                Objects.equals(pay6, that.pay6) &&
                Objects.equals(billAmt1, that.billAmt1) &&
                Objects.equals(billAmt2, that.billAmt2) &&
                Objects.equals(billAmt3, that.billAmt3) &&
                Objects.equals(billAmt4, that.billAmt4) &&
                Objects.equals(billAmt5, that.billAmt5) &&
                Objects.equals(billAmt6, that.billAmt6) &&
                Objects.equals(payAmt1, that.payAmt1) &&
                Objects.equals(payAmt2, that.payAmt2) &&
                Objects.equals(payAmt3, that.payAmt3) &&
                Objects.equals(payAmt4, that.payAmt4) &&
                Objects.equals(payAmt5, that.payAmt5) &&
                Objects.equals(payAmt6, that.payAmt6) &&
                Objects.equals(payNxtMnth, that.payNxtMnth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, limBal, sex, education, marriage, age, pay0, pay2, pay3, pay4, pay5, pay6, billAmt1, billAmt2, billAmt3, billAmt4, billAmt5, billAmt6, payAmt1, payAmt2, payAmt3, payAmt4, payAmt5, payAmt6, payNxtMnth);
    }
}
