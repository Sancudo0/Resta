package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class OperacionModel {

    private double minuendo;
    private double sustraendo;

    public double getMinuendo() {
        return minuendo;
    }

    public void setMinuendo(double minuendo) {
        this.minuendo = minuendo;

    }

    public double getSustraendo() {
        return sustraendo;

    }

    public void setSustraendo(double sustraendo) {
        this.sustraendo = sustraendo;
    }


    @XmlRootElement(name = "Request")
    public class Request {
        private String param1;
        private String param2;

        @XmlElement
        public String getParam1() {
            return param1;
        }

        public void setParam1(String param1) {
            this.param1 = param1;
        }

        @XmlElement
        public String getParam2() {
            return param2;
        }

        public void setParam2(String param2) {
            this.param2 = param2;
        }
    }
}
