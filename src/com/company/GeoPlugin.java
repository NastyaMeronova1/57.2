package com.company;

//@JsonPropertyOrder({"geopluginCurrencyConverter","geopluginCurrencySymbol_UTF8","geopluginCurrencySymbol","geopluginCurrencyCode",
//"geopluginTimezone","geopluginLocationAccuracyRadius","geopluginRequest","geopluginStatus","geopluginDelay","geopluginCredits","geopluginLongitude",
//  "geopluginLatitude","geopluginCity","geopluginRegion"  ,"geopluginRegionCode"    ,"geopluginContinentName","geopluginContinentCode","geopluginEuVATrate"
//,"geopluginInEU","geopluginCountryName","geopluginCountryCode","geopluginRegionName","geopluginAreaCode","geopluginInEU"})
public class GeoPlugin {
    private String geopluginRequest;
    private int geopluginStatus;
    private String geopluginDelay;


    private GeopluginCredit geopluginCredits;
    private String geopluginCity;
    private String geopluginRegion;
    private String geopluginRegionCode;
    private String geopluginRegionName;
    private int geopluginAreaCode;
    private int geopluginDmaCode;
    private String geopluginCountryCode;
    private String geopluginCountryName;
    private int geopluginInEU;
    private String geopluginEuVATrate;
    private String geopluginContinentCode;
    private String geopluginContinentName;
    private double geopluginLatitude;
    private double geopluginLongitude;
    private int geopluginLocationAccuracyRadius;
    private String geopluginTimezone;
    private String geopluginCurrencyCode;
    private String geopluginCurrencySymbol;
    private String geopluginCurrencySymbol_UTF8;
    private double geopluginCurrencyConverter;


    public GeoPlugin(String geopluginRequest, int geopluginStatus, String geopluginDelay, GeopluginCredit geopluginCredits, String geopluginCity, String geopluginRegion, String geopluginRegionCode, String geopluginRegionName, int geopluginAreaCode, int geopluginDmaCode, String geopluginCountryCode, String geopluginCountryName, int geopluginInEU, String geopluginEuVATrate, String geopluginContinentCode, String geopluginContinentName, double geopluginLatitude, double geopluginLongitude, int geopluginLocationAccuracyRadius, String geopluginTimezone, String geopluginCurrencyCode, String geopluginCurrencySymbol, String geopluginCurrencySymbol_UTF8, double geopluginCurrencyConverter) {
        this.geopluginRequest = geopluginRequest;
        this.geopluginStatus = geopluginStatus;
        this.geopluginDelay = geopluginDelay;
        this.geopluginCredits = geopluginCredits;
        this.geopluginCity = geopluginCity;
        this.geopluginRegion = geopluginRegion;
        this.geopluginRegionCode = geopluginRegionCode;
        this.geopluginRegionName = geopluginRegionName;
        this.geopluginAreaCode = geopluginAreaCode;
        this.geopluginDmaCode = geopluginDmaCode;
        this.geopluginCountryCode = geopluginCountryCode;
        this.geopluginCountryName = geopluginCountryName;
        this.geopluginInEU = geopluginInEU;
        this.geopluginEuVATrate = geopluginEuVATrate;
        this.geopluginContinentCode = geopluginContinentCode;
        this.geopluginContinentName = geopluginContinentName;
        this.geopluginLatitude = geopluginLatitude;
        this.geopluginLongitude = geopluginLongitude;
        this.geopluginLocationAccuracyRadius = geopluginLocationAccuracyRadius;
        this.geopluginTimezone = geopluginTimezone;
        this.geopluginCurrencyCode = geopluginCurrencyCode;
        this.geopluginCurrencySymbol = geopluginCurrencySymbol;
        this.geopluginCurrencySymbol_UTF8 = geopluginCurrencySymbol_UTF8;
        this.geopluginCurrencyConverter = geopluginCurrencyConverter;
    }

    public GeoPlugin() {
    }

    public String getGeopluginRequest() {
        return geopluginRequest;
    }

    public void setGeopluginRequest(String geopluginRequest) {
        this.geopluginRequest = geopluginRequest;
    }

    public int getGeopluginStatus() {
        return geopluginStatus;
    }

    public void setGeopluginStatus(int geopluginStatus) {
        this.geopluginStatus = geopluginStatus;
    }

    public String getGeopluginDelay() {
        return geopluginDelay;
    }

    public void setGeopluginDelay(String geopluginDelay) {
        this.geopluginDelay = geopluginDelay;
    }

    public GeopluginCredit getGeopluginCredits() {
        return geopluginCredits;
    }

    public void setGeopluginCredits(GeopluginCredit geopluginCredits) {
        this.geopluginCredits = geopluginCredits;
    }

    public String getGeopluginCity() {
        return geopluginCity;
    }

    public void setGeopluginCity(String geopluginCity) {
        this.geopluginCity = geopluginCity;
    }

    public String getGeopluginRegion() {
        return geopluginRegion;
    }

    public void setGeopluginRegion(String geopluginRegion) {
        this.geopluginRegion = geopluginRegion;
    }

    public String getGeopluginRegionCode() {
        return geopluginRegionCode;
    }

    public void setGeopluginRegionCode(String geopluginRegionCode) {
        this.geopluginRegionCode = geopluginRegionCode;
    }

    public String getGeopluginRegionName() {
        return geopluginRegionName;
    }

    public void setGeopluginRegionName(String geopluginRegionName) {
        this.geopluginRegionName = geopluginRegionName;
    }

    public int getGeopluginAreaCode() {
        return geopluginAreaCode;
    }

    public void setGeopluginAreaCode(int geopluginAreaCode) {
        this.geopluginAreaCode = geopluginAreaCode;
    }

    public int getGeopluginDmaCode() {
        return geopluginDmaCode;
    }

    public void setGeopluginDmaCode(int geopluginDmaCode) {
        this.geopluginDmaCode = geopluginDmaCode;
    }

    public String getGeopluginCountryCode() {
        return geopluginCountryCode;
    }

    public void setGeopluginCountryCode(String geopluginCountryCode) {
        this.geopluginCountryCode = geopluginCountryCode;
    }

    public String getGeopluginCountryName() {
        return geopluginCountryName;
    }

    public void setGeopluginCountryName(String geopluginCountryName) {
        this.geopluginCountryName = geopluginCountryName;
    }

    public int getGeopluginInEU() {
        return geopluginInEU;
    }

    public void setGeopluginInEU(int geopluginInEU) {
        this.geopluginInEU = geopluginInEU;
    }

    public String getGeopluginEuVATrate() {
        return geopluginEuVATrate;
    }

    public void setGeopluginEuVATrate(String geopluginEuVATrate) {
        this.geopluginEuVATrate = geopluginEuVATrate;
    }

    public String getGeopluginContinentCode() {
        return geopluginContinentCode;
    }

    public void setGeopluginContinentCode(String geopluginContinentCode) {
        this.geopluginContinentCode = geopluginContinentCode;
    }

    public String getGeopluginContinentName() {
        return geopluginContinentName;
    }

    public void setGeopluginContinentName(String geopluginContinentName) {
        this.geopluginContinentName = geopluginContinentName;
    }

    public double getGeopluginLatitude() {
        return geopluginLatitude;
    }

    public void setGeopluginLatitude(double geopluginLatitude) {
        this.geopluginLatitude = geopluginLatitude;
    }

    public double getGeopluginLongitude() {
        return geopluginLongitude;
    }

    public void setGeopluginLongitude(double geopluginLongitude) {
        this.geopluginLongitude = geopluginLongitude;
    }

    public int getGeopluginLocationAccuracyRadius() {
        return geopluginLocationAccuracyRadius;
    }

    public void setGeopluginLocationAccuracyRadius(int geopluginLocationAccuracyRadius) {
        this.geopluginLocationAccuracyRadius = geopluginLocationAccuracyRadius;
    }

    public String getGeopluginTimezone() {
        return geopluginTimezone;
    }

    public void setGeopluginTimezone(String geopluginTimezone) {
        this.geopluginTimezone = geopluginTimezone;
    }

    public String getGeopluginCurrencyCode() {
        return geopluginCurrencyCode;
    }

    public void setGeopluginCurrencyCode(String geopluginCurrencyCode) {
        this.geopluginCurrencyCode = geopluginCurrencyCode;
    }

    public String getGeopluginCurrencySymbol() {
        return geopluginCurrencySymbol;
    }

    public void setGeopluginCurrencySymbol(String geopluginCurrencySymbol) {
        this.geopluginCurrencySymbol = geopluginCurrencySymbol;
    }

    public String getGeopluginCurrencySymbol_UTF8() {
        return geopluginCurrencySymbol_UTF8;
    }

    public void setGeopluginCurrencySymbol_UTF8(String geopluginCurrencySymbol_UTF8) {
        this.geopluginCurrencySymbol_UTF8 = geopluginCurrencySymbol_UTF8;
    }

    public double getGeopluginCurrencyConverter() {
        return geopluginCurrencyConverter;
    }

    public void setGeopluginCurrencyConverter(double geopluginCurrencyConverter) {
        this.geopluginCurrencyConverter = geopluginCurrencyConverter;
    }

    @Override
    public String toString() {
        return "GeoPlugin{" +
                "geopluginRequest='" + geopluginRequest + '\'' +
                ", geopluginStatus=" + geopluginStatus +
                ", geopluginDelay='" + geopluginDelay + '\'' +
                ", geopluginCredits=" + geopluginCredits +
                ", geopluginCity='" + geopluginCity + '\'' +
                ", geopluginRegion='" + geopluginRegion + '\'' +
                ", geopluginRegionCode='" + geopluginRegionCode + '\'' +
                ", geopluginRegionName='" + geopluginRegionName + '\'' +
                ", geopluginAreaCode=" + geopluginAreaCode +
                ", geopluginDmaCode=" + geopluginDmaCode +
                ", geopluginCountryCode='" + geopluginCountryCode + '\'' +
                ", geopluginCountryName='" + geopluginCountryName + '\'' +
                ", geopluginInEU=" + geopluginInEU +
                ", geopluginEuVATrate='" + geopluginEuVATrate + '\'' +
                ", geopluginContinentCode='" + geopluginContinentCode + '\'' +
                ", geopluginContinentName='" + geopluginContinentName + '\'' +
                ", geopluginLatitude=" + geopluginLatitude +
                ", geopluginLongitude=" + geopluginLongitude +
                ", geopluginLocationAccuracyRadius=" + geopluginLocationAccuracyRadius +
                ", geopluginTimezone='" + geopluginTimezone + '\'' +
                ", geopluginCurrencyCode='" + geopluginCurrencyCode + '\'' +
                ", geopluginCurrencySymbol='" + geopluginCurrencySymbol + '\'' +
                ", geopluginCurrencySymbol_UTF8='" + geopluginCurrencySymbol_UTF8 + '\'' +
                ", geopluginCurrencyConverter=" + geopluginCurrencyConverter +
                '}';
    }

}
