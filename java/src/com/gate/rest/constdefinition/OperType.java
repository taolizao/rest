package com.gate.rest.constdefinition;

public enum OperType {
    UNKNOWN("UNKNOWN", 0),

    MARCKETINFO("MarcketInfo", 1),
    MARCKETLIST("MarcketList", 2),
    PAIRS("pairs", 3),
    TICKERS("tickers", 4),
    ETHBTCTICKER("ethbtcticker", 5),
    ETHBTCDEPTH("ethbtcdepth", 6),
    ETHBTCHISTORY("ethbtchistory", 7),
    BALANCE("balance", 8),

    MAXOPERNO("maxmumoperno", 512);

    private String opername;
    private int operno;

    private OperType(String opername, int operno) {
        this.opername = opername;
        this.operno = operno;
    }

    public String getOpernameWithOperno(int operno) {
        for (OperType o : OperType.values()) {
            if (o.operno == operno) {
                return o.opername;
            }
        }

        return OperType.UNKNOWN.getOpername();
    }

    public int getOpernoWithOpername(String opername) {
        for (OperType o : OperType.values()) {
            //System.out.println("Compare " + name + " with " + o.opername);
            if (opername.compareToIgnoreCase(o.opername) == 0) {
                return o.operno;
            }
        }

        return OperType.UNKNOWN.getOperno();
    }

    public String getOpername() {
        return opername;
    }

    public void setOpername(String opername) {
        this.opername = opername;
    }

    public int getOperno() {
        return operno;
    }

    public void setOperno(int operno) {
        this.operno = operno;
    }

    public int getMaxOperno() {
        return this.MAXOPERNO.operno;
    }
}
