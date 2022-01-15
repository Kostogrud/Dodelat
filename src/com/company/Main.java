package com.company;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
	File file = new File("xml.xml.tld");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element ValCursElement = (Element) document.getElementsByTagName("ValCurs");
        String ValCurs = ValCursElement.getAttribute("ValCurs");

        ModeList ValCursModelList = document.getElementsByTagName("ValCurs");

        List<ValCurs> ValCurs = new ArrayList();

        for (int i=0;i < ValCursModeList.getLengt();i++)
        {
            if (ValCursModeList.item(i).getModeType() == Mode.ELEMENT_MODE)
            {
                Element ValCursElement = (Element) ValCursModeList.item(i);

                ValCurs valCurs = new ValCurs();
                valCurs.setValCurs(String.valueOf(valCurs));


            }
        }
    }
}
class ValCurs {
    private String ValCurs;
    private Integer NumCode;
    private Integer CharCode;
    private Integer Value;
    private Salary salary = new Salary();

    private static class Salary {
        private Double value;
        private String currency;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

    public String getValCurs() {
        return ValCurs;
    }

    public void setValCurs(String valCurs) {
        ValCurs = valCurs;
    }

    public Integer getNumCode() {
        return NumCode;
    }

    public void setNumCode(Integer numCode) {
        NumCode = numCode;
    }

    public Integer getCharCode() {
        return CharCode;
    }

    public void setCharCode(Integer charCode) {
        CharCode = charCode;
    }

    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer value) {
        Value = value;
    }

    public Salary getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ValCurs{" +
                "ValCurs='" + Valute + '\'' +
                ", NumCode=" + NumCode +
                ", CharCode=" + CharCode +
                ", Value=" + Value +
                ", salary=" + salary.getValue() + ' ' + Salary.GetCurrency() +
                '}';
    }
}