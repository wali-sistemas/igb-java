package co.igb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

/**
 * @author jguisao
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingDTO {
    private Integer year;
    private Integer month;
    private String nameMonth;
    private String userName;
    private Integer timeEstCargaS;
    private BigDecimal timeRealCargaS;
    private Integer timeEstContainer;
    private BigDecimal timeRealContainer;

    public BookingDTO() {
    }

    public BookingDTO(Integer year, Integer month, String nameMonth, String userName, Integer timeEstCargaS, BigDecimal timeRealCargaS, Integer timeEstContainer, BigDecimal timeRealContainer) {
        this.year = year;
        this.month = month;
        this.nameMonth = nameMonth;
        this.userName = userName;
        this.timeEstCargaS = timeEstCargaS;
        this.timeRealCargaS = timeRealCargaS;
        this.timeEstContainer = timeEstContainer;
        this.timeRealContainer = timeRealContainer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTimeEstCargaS() {
        return timeEstCargaS;
    }

    public void setTimeEstCargaS(Integer timeEstCargaS) {
        this.timeEstCargaS = timeEstCargaS;
    }

    public BigDecimal getTimeRealCargaS() {
        return timeRealCargaS;
    }

    public void setTimeRealCargaS(BigDecimal timeRealCargaS) {
        this.timeRealCargaS = timeRealCargaS;
    }

    public Integer getTimeEstContainer() {
        return timeEstContainer;
    }

    public void setTimeEstContainer(Integer timeEstContainer) {
        this.timeEstContainer = timeEstContainer;
    }

    public BigDecimal getTimeRealContainer() {
        return timeRealContainer;
    }

    public void setTimeRealContainer(BigDecimal timeRealContainer) {
        this.timeRealContainer = timeRealContainer;
    }

    @Override
    public String toString() {
        return "TimeOperationDTO{" +
                "year='" + year + '\'' +
                ", month=" + month +
                ", nameMonth='" + nameMonth + '\'' +
                ", userName='" + userName + '\'' +
                ", timeEstCargaS=" + timeEstCargaS +
                ", timeRealCargaS=" + timeRealCargaS +
                ", timeEstContainer=" + timeEstContainer +
                ", timeRealContainer=" + timeRealContainer +
                '}';
    }
}